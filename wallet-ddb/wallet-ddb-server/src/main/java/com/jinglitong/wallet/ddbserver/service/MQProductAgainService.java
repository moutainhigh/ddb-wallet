package com.jinglitong.wallet.ddbserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.aliyun.oss.common.utils.DateUtil;
import com.jinglitong.wallet.common.utils.StringUtils;
import com.jinglitong.wallet.ddbapi.model.DdbMqMessageRecord;
import com.jinglitong.wallet.ddbserver.mapper.DdbMqMessageRecordMapper;
import com.jinglitong.wallet.ddbserver.util.AliMQServiceUtil;
import com.jinglitong.wallet.ddbserver.util.DateUtils;

import lombok.extern.slf4j.Slf4j;
import tk.mybatis.mapper.weekend.Weekend;
import tk.mybatis.mapper.weekend.WeekendCriteria;

@Slf4j
@Service
public class MQProductAgainService {

	@Autowired
	private DdbMqMessageRecordMapper ddbMqMessageRecordMapper;
	
    @Value("${ali.mq.send.group}")
    private String producerId;
    
    @Value("${ali.mq.topic}")
    private String topic;
    
    
    public void start() {
    	Weekend<DdbMqMessageRecord>weekend = Weekend.of(DdbMqMessageRecord.class);
    	WeekendCriteria<DdbMqMessageRecord,Object> Criteria =weekend.weekendCriteria();
    	Criteria.andCondition(" status = 0");
    	List<DdbMqMessageRecord> list =  ddbMqMessageRecordMapper.selectByExample(weekend);
    	log.info("product failure list {}",list.size());
    	for (DdbMqMessageRecord ddbMqMessageRecord : list) {
    		String Result =AliMQServiceUtil.createNewOrder(ddbMqMessageRecord.getFlowId(), ddbMqMessageRecord.getDataBody(), 
    				ddbMqMessageRecord.getTopic(), ddbMqMessageRecord.getTag());
    		if(!StringUtils.isEmpty(Result)) {
    			DdbMqMessageRecord update = new DdbMqMessageRecord();
    			update.setMsgId(Result);
    			update.setStatus(true);
    			update.setCreateTime(DateUtils.getDateTime());
    			Weekend<DdbMqMessageRecord>upWeekend = Weekend.of(DdbMqMessageRecord.class);
    	    	WeekendCriteria<DdbMqMessageRecord,Object> upCriteria =upWeekend.weekendCriteria();
    	    	upCriteria.andEqualTo(DdbMqMessageRecord::getFlowId, ddbMqMessageRecord.getFlowId());
    			ddbMqMessageRecordMapper.updateByExampleSelective(update, upWeekend);
    		}
    		
		}
    	
    }
}
