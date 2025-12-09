package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.leads.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-21 10:43:29
 */
public class AntMerchantExpandLeadsModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3317659694648332421L;

	/** 
	 * leads信息修改过程中返回的不通过信息原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 如果返回true,则代表需要审核,异步消息通知,一般是四要素的修改需要审核,其他一些关联信息修改不需要审核
	 */
	@ApiField("need_audit")
	private Boolean needAudit;

	/** 
	 * 是否通过
	 */
	@ApiField("pass")
	private Boolean pass;

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setNeedAudit(Boolean needAudit) {
		this.needAudit = needAudit;
	}
	public Boolean getNeedAudit( ) {
		return this.needAudit;
	}

	public void setPass(Boolean pass) {
		this.pass = pass;
	}
	public Boolean getPass( ) {
		return this.pass;
	}

}
