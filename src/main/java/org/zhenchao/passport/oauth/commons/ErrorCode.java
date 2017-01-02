package org.zhenchao.passport.oauth.commons;

/**
 * 错误代码
 *
 * @author zhenchao.wang 2016-12-28 17:52
 * @version 1.0.0
 */
public enum ErrorCode {

    SYSTEM_ERROR(100000, "system error"),

    SERVICE_ERROR(100100, "service error"),

    LOCAL_SERVICE_ERROR(100101, "local service error"),

    REMOTE_SERVICE_ERROR(100150, "remote service error"),

    PARAMETER_ERROR(100200, "parameter error"),

    ENCRYPT_ERROR(100300, "encrypt error"),

    /** 验证用户错误 */
    VALIDATE_USER_ERROR(200000, "validate user error"),

    /** 无效的用户 */
    ILLEGAL_USER(200001, "illegal user");

    /** 错误码 */
    private int code;

    /** 错误描述信息 */
    private String desc;

    ErrorCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}