package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.complain.reconciliation.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-27 09:51:51
 */
public class AlipayMerchantComplainReconciliationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2375416652665858523L;

	/** 
	 * 一些不影响开通12315一键和解流程，但是有问题的地方
	 */
	@ApiField("notice")
	private String notice;

	/** 
	 * 间连/直连商家开通一键和解功能过程中的状态
	 */
	@ApiField("status")
	private String status;

	public void setNotice(String notice) {
		this.notice = notice;
	}
	public String getNotice( ) {
		return this.notice;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
