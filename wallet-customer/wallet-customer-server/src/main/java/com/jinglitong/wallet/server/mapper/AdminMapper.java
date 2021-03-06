package com.jinglitong.wallet.server.mapper;

import com.jinglitong.wallet.api.model.Admin;
import com.jinglitong.wallet.api.model.view.AdminSelVO;
import com.jinglitong.wallet.server.util.MyMapper;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface AdminMapper extends MyMapper<Admin> {
    List<Admin> getAdminList(AdminSelVO admin);

    Admin selectByUsername(String username);

    Admin selectByAdminId(String adminId);
}