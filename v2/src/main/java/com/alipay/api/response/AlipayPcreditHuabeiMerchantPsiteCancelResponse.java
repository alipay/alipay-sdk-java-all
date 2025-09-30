package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.merchant.psite.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 10:12:37
 */
public class AlipayPcreditHuabeiMerchantPsiteCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6182165271636334532L;

	/** 
	 * 是否取消报名成功
	 */
	@ApiField("has_cancel")
	private Boolean hasCancel;

	/** 
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setHasCancel(Boolean hasCancel) {
		this.hasCancel = hasCancel;
	}
	public Boolean getHasCancel( ) {
		return this.hasCancel;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
