package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.paymrchdata.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-21 13:32:24
 */
public class AlipayMerchantPaymrchdataQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8478156284353746747L;

	/** 
	 * 经营码开通结果
	 */
	@ApiField("open_result")
	private Boolean openResult;

	/** 
	 * 表示经营码开通的单据号
	 */
	@ApiField("qrcode_business_apply_no")
	private String qrcodeBusinessApplyNo;

	public void setOpenResult(Boolean openResult) {
		this.openResult = openResult;
	}
	public Boolean getOpenResult( ) {
		return this.openResult;
	}

	public void setQrcodeBusinessApplyNo(String qrcodeBusinessApplyNo) {
		this.qrcodeBusinessApplyNo = qrcodeBusinessApplyNo;
	}
	public String getQrcodeBusinessApplyNo( ) {
		return this.qrcodeBusinessApplyNo;
	}

}
