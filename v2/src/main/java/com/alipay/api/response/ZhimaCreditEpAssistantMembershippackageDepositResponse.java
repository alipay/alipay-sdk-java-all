package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.assistant.membershippackage.deposit response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-02 11:52:45
 */
public class ZhimaCreditEpAssistantMembershippackageDepositResponse extends AlipayResponse {

	private static final long serialVersionUID = 3271696635413426522L;

	/** 
	 * 充值到的权益包id
	 */
	@ApiField("package_id")
	private String packageId;

	/** 
	 * 会员包充值的记录id
	 */
	@ApiField("record_id")
	private String recordId;

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public String getPackageId( ) {
		return this.packageId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

}
