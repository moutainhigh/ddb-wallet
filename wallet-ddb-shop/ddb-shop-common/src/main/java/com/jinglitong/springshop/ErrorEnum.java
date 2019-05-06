package com.jinglitong.springshop;

public enum ErrorEnum {
    ERROR_1(1, "数据库语句执行失败"),
    ERROR_201(201, "请求失败"),
    ERROR_202(202, "不能为空"),
    ERROR_203(203, "用户不存在"),
    ERROR_204(204, "密码错误"),
    ERROR_205(205, "用户未登录"),
    ERROR_206(206, "实名参数有误"),
    ERROR_207(207, "参数有误"),
    ERROR_208(208, "系统升级中，请稍后！"),
    ERROR_401(401, "用户未登录"),
    ERROR_209(209, "用户名或密码错误"),
    ERROR_210(210, "暂无登录权限"),
    //********购物车错误码*******************************************************************************
    ERROR_3001(3001, "购物车参数错误"),
    ERROR_3002(3002, "数量超过限制"),
    ERROR_3003(3003, "sku不存在"),
    ERROR_3004(3004, "购物车商品总数超过限制"),
    ERROR_3005(3005, "购物车不存在"),
    ERROR_3006(3006, "购物项不存在"),
    ERROR_3007(3007, "同步購物車"),
    ERROR_3008(3008, "购物车结算参数有误"),
    //********订单错误码*******************************************************************************
    ERROR_3100(3100, "订单参数有误"),
    ERROR_3101(3101, "订单无法修改"),
    ERROR_3102(3102, "抱歉，您本单包含失效商品！"),
    ERROR_3103(3103, "请选择相同币种的商品进行结算~"),
    ERROR_3104(3104, "宝分积分不足"),
    ERROR_3105(3105, "现金袋余额不足"),
    ERROR_3106(3106, "扣款失败"),
    ERROR_3107(3107, "宝分积分转账记录失败"),
    ERROR_3108(3108, "宝分币积分流水记录失败"),
    ERROR_3109(3109, "宝分币转入系统账户失败"),
    ERROR_3110(3110, "宝分币积分转账到系统账户记录失败"),
    ERROR_3111(3111, "宝分币积分转账到系统账户流水记录失败"),
    ERROR_3112(3112, "现金袋积分转账记录失败"),
    ERROR_3113(3113, "现金袋积分流水记录失败"),
    ERROR_3114(3114, "现金袋抵扣转入系统账户失败"),
    ERROR_3115(3115, "现金袋积分转账到系统账户记录失败"),
    ERROR_3116(3116, "现金袋积分转账到系统账户流水记录失败"),
    ERROR_3117(3117, "下单失败"),
    ERROR_3118(3118, "不足"),
    ERROR_3119(3119, "用户流水记录失败"),
    ERROR_3120(3120, "用户钱包日志失败"),
    ERROR_3121(3121, "转入系统账户失败"),
    ERROR_3122(3122, "转入系统账户记录失败"),
    ERROR_3123(3123, "转入系统账户钱包记录失败"),
    ERROR_3124(3124, "下单撤销失败"),
    ERROR_3125(3125, "下单撤销用户流水记录失败"),
    ERROR_3126(3126, "下单撤销用户钱包日志失败"),
    ERROR_3127(3127, "下单撤销转入系统账户失败"),
    ERROR_3128(3128, "下单撤销转入系统账户记录失败"),
    ERROR_3129(3129, "下单撤销转入系统账户钱包记录失败"),
    //********商品上架*******************************************************************************
    ERROR_4001(4001, "sn编码重复"),
    ERROR_4002(4002, "上架失败"),
    ERROR_4003(4003, "商品纯币种的价格不可低于非纯币种价格的价格"),
    
    //********收货地址*******************************************************************************
    ERROR_5001(5001, "区域id不存在"),
    ERROR_5002(5002, "收货地址不存在"),


    //********注册、修改密码、找回密码*******************************************************************************
    ERROR_5201(5201, "参数有误"),
    ERROR_5202(5202, "用户名不正确"),
    ERROR_5203(5203, "该邀请码不存在，注册失败"),
    ERROR_5204(5204, "验证码超时,或错误"),
    ERROR_5205(5205, "验证码错误"),
    ERROR_5206(5206, "用户已注册"),
    ERROR_5207(5207, "入库错误"),
    ERROR_5208(5208, "该用户未注册"),
    ERROR_5209(5209, "邀请码必填"),
    ERROR_5210(5210, "注册失败"),
    ERROR_5211(5211, "获取邀请码失败"),
    ERROR_5212(5212, "两次输入密码不一致"),
    ERROR_0000(0, "success"),
    ERROR_0001(1, "已处理过"),
    //******** 酷咖平台同步数据*******************************************************************************
    ERROR_5301(5301, "解密异常"),
    ERROR_5302(5202, "参数异常"),
    ERROR_5303(5203, "没有该物流公司"),
    ERROR_5304(5204, "没有该订单"),
    ERROR_5305(5205, "没有该订单项"),
    ERROR_5306(5206, "物流入库错误"),
    ERROR_5307(5307, "该订单已处理"),
    
  //******** 支付*******************************************************************************
    ERROR_5401(5401, "omiPay错误"),
    ERROR_5402(5402, "支付插件参数错误"),
    ERROR_5403(5403, "支付成功"),
    
    //******** 提現*******************************************************************************
    ERROR_5501(5501, "获取规则错误"),
    ERROR_5502(5502, "获取银行卡信息错误"),
    ERROR_5503(5503, "提现金额不可小于最小金额"),
    ERROR_5504(5504, "提现金额不可大于最大金额"),
    ERROR_5505(5505, "现金袋和代金币余额不足"),
    ERROR_5506(5506,"解绑失败"),
    ERROR_5507(5507,"银行卡添加失败"),
    ERROR_5508(5508,"银行卡不能重复绑定"),
    ERROR_5509(5509,"非法账号，请重新输入"),
    ERROR_5510(5510,"用户只能绑定一张银行卡"),
    ERROR_5511(5511,"用户未认证"),
    ERROR_5512(5512,"订单已经处理"),
  //******** 订单审核*******************************************************************************
    ERROR_5520(5520,"该订单已审核过"),
    ERROR_5521(5521,"该订单修改中"),
    ERROR_5522(5522,"该订单已修改"),
    ERROR_5523(5523,"订单已通过审核，正在发货中"),
	//******** 商铺store*******************************************************************************
	ERROR_5601(5601,"供应商添加失败"),
	ERROR_5602(5602,"供应商名称不能重复"),
	ERROR_5603(5603,"供应商名称不能为空"),
	ERROR_5604(5604,"供应商联系人不能为空"),
	ERROR_5605(5605,"供应商联系电话不能为空"),
	ERROR_5606(5606,"供应商修改失败");



    private Integer code;//结果编码
    private String msg;//结果信息

    ErrorEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}