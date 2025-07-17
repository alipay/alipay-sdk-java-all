package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改S码入参
 *
 * @author auto create
 * @since 1.0, 2020-06-15 10:51:47
 */
public class UpdateCodeRequest extends AlipayObject {

	private static final long serialVersionUID = 2767489376348275615L;

	/**
	 * 执行动作，如：绑定-BIND，解绑-UNBIND
	 */
	@ApiField("action")
	private String action;

	/**
	 * biz_id，唯一，业务id，用于业务请求的幂等标志
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 码值，对应码平台的token，https://qr.alipay.com/${token}  中的token
	 */
	@ApiField("code_token")
	private String codeToken;

	/**
	 * context_data，发码的上下文信息，比如子业务code，场景code等。此值为一个Map<string, string>类型的json串字符，传入规则如下： {"key1":"val2","key2":"val2"}。必填业务字段：SUB_BIZ_TYPE，SCENE等，具体咨询对接技术人员
	 */
	@ApiField("context_data")
	private String contextData;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCodeToken() {
		return this.codeToken;
	}
	public void setCodeToken(String codeToken) {
		this.codeToken = codeToken;
	}

	public String getContextData() {
		return this.contextData;
	}
	public void setContextData(String contextData) {
		this.contextData = contextData;
	}

}
