package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.certification.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:35
 */
public class ZhimaCustomerCertificationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2513669448773236618L;

	/** 
	 * 认证的主体属性信息，一般的认证场景都是返回空
	 */
	@ApiField("attribute_info")
	private String attributeInfo;

	/** 
	 * 包含了认证过程中的认证材料和过程记录
	 */
	@ApiField("channel_statuses")
	private String channelStatuses;

	/** 
	 * 认证不通过的原因
	 */
	@ApiField("failed_reason")
	private String failedReason;

	/** 
	 * 认证的主体信息，一般的认证场景返回为空
	 */
	@ApiField("identity_info")
	private String identityInfo;

	/** 
	 * 认证是否通过,通过为true，不通过为false
	 */
	@ApiField("passed")
	private String passed;

	public void setAttributeInfo(String attributeInfo) {
		this.attributeInfo = attributeInfo;
	}
	public String getAttributeInfo( ) {
		return this.attributeInfo;
	}

	public void setChannelStatuses(String channelStatuses) {
		this.channelStatuses = channelStatuses;
	}
	public String getChannelStatuses( ) {
		return this.channelStatuses;
	}

	public void setFailedReason(String failedReason) {
		this.failedReason = failedReason;
	}
	public String getFailedReason( ) {
		return this.failedReason;
	}

	public void setIdentityInfo(String identityInfo) {
		this.identityInfo = identityInfo;
	}
	public String getIdentityInfo( ) {
		return this.identityInfo;
	}

	public void setPassed(String passed) {
		this.passed = passed;
	}
	public String getPassed( ) {
		return this.passed;
	}

}
