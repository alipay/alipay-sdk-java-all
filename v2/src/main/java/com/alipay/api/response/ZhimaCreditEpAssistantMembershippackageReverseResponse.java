package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.assistant.membershippackage.reverse response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-27 10:17:52
 */
public class ZhimaCreditEpAssistantMembershippackageReverseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1614671246578638812L;

	/** 
	 * 退权益执行成功的那笔业务流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 退权益状态
	 */
	@ApiField("status")
	private String status;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
