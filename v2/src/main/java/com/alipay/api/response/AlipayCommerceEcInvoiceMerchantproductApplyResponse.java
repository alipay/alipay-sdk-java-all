package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.invoice.merchantproduct.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-22 16:37:29
 */
public class AlipayCommerceEcInvoiceMerchantproductApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4718866449932568494L;

	/** 
	 * 产品开通流水ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 产品开通状态
	 */
	@ApiField("flow_status")
	private String flowStatus;

	/** 
	 * 开通流程页(需要商户登录)
	 */
	@ApiField("open_page_url")
	private String openPageUrl;

	/** 
	 * 外部申请ID
	 */
	@ApiField("out_apply_id")
	private String outApplyId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

	public void setFlowStatus(String flowStatus) {
		this.flowStatus = flowStatus;
	}
	public String getFlowStatus( ) {
		return this.flowStatus;
	}

	public void setOpenPageUrl(String openPageUrl) {
		this.openPageUrl = openPageUrl;
	}
	public String getOpenPageUrl( ) {
		return this.openPageUrl;
	}

	public void setOutApplyId(String outApplyId) {
		this.outApplyId = outApplyId;
	}
	public String getOutApplyId( ) {
		return this.outApplyId;
	}

}
