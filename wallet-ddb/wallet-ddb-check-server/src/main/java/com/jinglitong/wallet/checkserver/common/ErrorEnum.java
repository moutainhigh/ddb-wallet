package com.jinglitong.wallet.checkserver.common;

public enum ErrorEnum {
    ERROR_1(1, "数据库语句执行失败"),
    //**********  短信  ************
    ERROR_26001(26001, "请求参数有误"),
    ERROR_26002(26002, "发送失败"),
    ERROR_26003(26003, "邮箱有误"),

    //**********  用户登录/注册/注销/忘记密码密码  ************
    ERROR_21001(21001, "注册失败"),
    ERROR_21002(21002, "验证码错误"),
    ERROR_21003(21003, "验证码超时,或错误"),
    ERROR_21004(21004, "该用户已注册"),
    ERROR_21005(21005, "该用户未注册"),
    ERROR_21011(21011, "未知账户"),
    ERROR_21012(21012, "密码不正确"),
    ERROR_21013(21013, "用户已锁定"),
    ERROR_21014(21014, "用户或密码错误次数过多"),
    ERROR_21015(21015, "用户名密码不正确"),
    ERROR_21016(21016, "登录失败"),
    ERROR_21017(21017, "重复登录"),
    ERROR_21021(21021, "登出失败"),
    ERROR_21031(21031, "重置密码失败"),
    ERROR_21099(21099, "未登录"),
    ERROR_21101(21101, "Id不能为空"),
    ERROR_21102(21102, "用户名已存在"),
    ERROR_21103(21103, "杂项创建失败"),
    ERROR_21104(21104, "用户名不正确"),
    ERROR_21105(21105, "密码不正确"),
    ERROR_21111(21111, "身份认证失败"),
    ERROR_21112(21112, "已进行身份认证"),
    ERROR_21113(21113, "身份证号无效"),
    ERROR_21114(21114, "杂项删除失败"),
    ERROR_21115(21115, "邀请码错误"),

    //**********  创建钱包/导入钱包/查询钱包/转账:21300-21399  ************
    ERROR_21301(21301, "创建钱包内部错误"),
    ERROR_21302(21302, "该链钱包已经存在无法创建"),
    ERROR_21303(21303, "获得gas费错误"),
    ERROR_21321(21321, "导入钱包内部错误"),
    ERROR_21322(21322, "该链钱包已经存在无法导入"),
    ERROR_21331(21331, "无法找到钱包"),
    ERROR_21332(21332, "获得余额失败"),
    ERROR_21333(21333, "批量获得余额失败"),
    ERROR_21341(21341, "转账失败"),
    ERROR_21351(21351, "获得交易列表失败"),
    ERROR_21399(21399, "找不到对应链接口"),
    ERROR_21361(21361, "修改密码错误"),
    ERROR_21371(21371, "重置密码错误"),
    ERROR_21381(21381, "导出钱包错误"),
    ERROR_21382(21382, "删除钱包错误"),
    ERROR_21352(21352, "获得交易记录失败"),

    //**********  版本控制/广告/帮助:21400-21499  ************
    ERROR_21401(21401, "获得版本失败"),

    //**********  Admin错误码:31400- ************
    ERROR_31400(31400, "AdminId为空"),
    ERROR_31401(31401, "appControl添加数据库出错"),
    ERROR_31402(31402, "appControl修改数据库出错"),
    ERROR_31403(31403, "appControl为空"),
    ERROR_31404(31404, "apphelp添加数据库出错"),
    ERROR_31405(31405, "apphelp修改数据库出错"),
    ERROR_31406(31406, "apphelpId为空或appState为空"),
    ERROR_31407(31407, "apphelp修改状态失败"),
    ERROR_31408(31408, "appNotice创建失败"),
    ERROR_31409(31409, "noticeId为空"),
    ERROR_31410(31410, "notice修改失败"),
    ERROR_31411(31411, "notice状态修改失败"),
    ERROR_31412(31412, "用户名为空"),
    ERROR_31413(31413, "WalletId为空"),
    ERROR_31414(31414, "Admin修改状态失败"),
    ERROR_31415(31415, "Admin修改失败"),
    ERROR_31416(31416, "创建角色失败"),
    ERROR_31417(31416, "角色ID为空"),
    ERROR_31418(31418, "修改角色失败"),
    ERROR_31419(31419, "修改角色状态失败"),
    ERROR_31420(31420, "密码重置失败"),
    ERROR_31421(31421, "用户未登录"),
    ERROR_31422(31422, "您对该账户没有权限"),
    ERROR_31423(31423, "暂无数据"),
    ERROR_31424(3142, "链修改失败"),
    ERROR_31425(3145, "链修改失败"),
    ERROR_31426(3146, "链名已存在"),
    ERROR_31427(3147, "创建失败"),
    ERROR_31428(3148, "修改币失败"),
    ERROR_31429(3149, "修改状态失败"),
    ERROR_31430(3130, "信息已存在"),
    ERROR_31431(3131, "主币不能修改为无效"),
    
    ERROR_31433(31433, "banner创建失败"),
    ERROR_31432(31432, "banner修改失败"),

    ERROR_31434(31434, "商家信息添加失败"),
    ERROR_31435(31435, "商家信息修改失败"),
    ERROR_31436(31436, "商家信息删除失败"),
    ERROR_31437(31437, "商家币种添加失败"),
    ERROR_31438(31438, "商家币种修改失败"),
    ERROR_31439(31439, "商家币种删除失败"),
    ERROR_31440(31440, "支付信息新增失败"),
    ERROR_31441(31441, "支付信息修改失败"),
    ERROR_31442(31442, "支付信息删除失败"),

    
    ERROR_31443(31443, "图片规格过大"),
    ERROR_31444(31444, "图片格式不符合要求，请上传png或jpg格式"),
    ERROR_31445(31445, "币种已存在"),
    ERROR_31446(31446, "币种为空"),

    ERROR_31447(31447, "head参数不正确"),
    ERROR_31448(31448, "商家不存在"),
    ERROR_31449(31449, "请求时间超过10分钟"),
    ERROR_31450(31450, "签名不正确"),
    ERROR_31451(31451, "支付订单不存在"),
    ERROR_31452(31452, "商家订单号已经存在"),
    ERROR_31453(31453, "支付金额不匹配"),
    ERROR_31454(31454, "支付金额不匹配"),
    ERROR_31455(31455, "锁仓规则不存在"),
    ERROR_31456(31456, "支付金额必须大于零"),
    ERROR_31457(31457, "支付币种不存在"),
    ERROR_31458(31458, "该邀请码不存在，注册失败"),
    ERROR_31459(31459, "注册须输入邀请码"),
    ERROR_31460(31460, "已存在该链的账户"),
    ERROR_31461(31461, "添加激活账户失败"),
    ERROR_31462(31462, "支付请求失败"),
    ERROR_31463(31463, "修改激活账户失败"),
    ERROR_31464(31464, "提交反馈失败"),
    ERROR_31465(31465, "反馈处理失败"),


     //fyy
    ERROR_35001(35001, "锁仓状态不能为空"),
    ERROR_35002(35002, "ID不能为空"),
    ERROR_35003(35003, "规则创建失败"),
    ERROR_35004(35004, "链已失效"),
    ERROR_35006(3500, "链下仍有有效币"),

    //**********  冻结释放 ************
    ERROR_35101(35101, "总账导入失败"),
    ERROR_35102(35102, "excel读取失败"),
    ERROR_35103(35103, "用户验证错误"),
    //**********  解仓 ************
    ERROR_35200(35200, "获取总账地址失败"),
    //数据收集
    ERROR_36001(36001,"装机记录失败"),
    ERROR_36002(36002,"公司信息操作成功"),
    ERROR_36003(36003,"公司信息操作失败"),
    ERROR_36005(36005,"app钱包信息操作失败"),
    ERROR_36006(36006,"钱包编码已存在"),

    //关于管理
    ERROR_37000(37000,"关于配置查询错误"),
    ERROR_37001(37001,"关于配置修改错误"),
    ERROR_37002(37002,"关于配置新增错误"),
    ERROR_37003(37003,"关于配置参数不能为空"),
    ERROR_37004(37004,"关于配置删除数据失败"),
    ERROR_37005(37005,"关于配置修改查询错误"),
    ERROR_37006(37006,"appId不能为空"),

    //协议管理
    ERROR_38000(38000,"协议列表查询错误"),
    ERROR_38001(38001,"协议参数不能为空"),
    ERROR_38002(38002,"此协议正在关联钱包使用，无法删除"),
    ERROR_38003(38003,"协议删除失败"),
    ERROR_38004(38004,"协议回显查询失败"),
    ERROR_38005(38005,"协议上传OOS出现错误"),
    ERROR_38006(38006,"新增协议出现错误"),
    ERROR_38007(38007,"修改协议出现错误"),
    ERROR_38008(38008,"协议未修改，请修改后提交协议"),
    ERROR_38009(38009,"协议下拉框查询失败"),


    //游戏方
    ERROR_41001(41001,"解密异常"),
    ERROR_41002(41002,"flowId重复复，请求已处理过。"),
    ERROR_41003(41003,"内部错误"),

    // 兑换mei
    ERROR_41004(41004,"兑换积分数量不能多于可用积分"),
    ERROR_41005(41005,"兑换MEI失败"),
    ERROR_41006(41006,"邮件发送失败"),
    ERROR_41007(41007,"用户不存在"),
    
    // 用户认证新加错误码
    ERROR_41008(41008,"身份证号已被认证，请重新填写身份信息"),
    ERROR_41009(41009,"身份证号已被认证，请选择审核不通过"),
    ;


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