package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请S码的参数
 *
 * @author auto create
 * @since 1.0, 2019-09-18 11:17:17
 */
public class ApplyCodeRequest extends AlipayObject {

	private static final long serialVersionUID = 7327832454522766524L;

	/**
	 * biz_id，唯一，业务id，用于业务请求的幂等标志
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * context_data，发码的上下文信息，比如子业务code，场景code等。此值为一个Map<string, string>类型的json串字符，传入规则如下： {"key1":"val2","key2":"val2"}。必填业务字段：SUB_BIZ_TYPE，SCENE，url
	 */
	@ApiField("context_data")
	private String contextData;

	/**
	 * logo_url，logo图片地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getContextData() {
		return this.contextData;
	}
	public void setContextData(String contextData) {
		this.contextData = contextData;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

}
