package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请S码的参数
 *
 * @author auto create
 * @since 1.0, 2020-06-13 17:02:56
 */
public class ApplyCodeRequest extends AlipayObject {

	private static final long serialVersionUID = 7356158164721755964L;

	/**
	 * 通码的业务身份，能唯一定位通码业务，包含码上的数据、路由规则
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * biz_id，唯一，业务id，用于业务请求的幂等标志
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * context_data，发码的上下文信息，比如pid，url等。此值为一个Map<string, string>类型的json串字符，传入规则如下： {"key1":"val2","key2":"val2"}。
	 */
	@ApiField("context_data")
	private String contextData;

	/**
	 * logo_url，logo图片地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

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
