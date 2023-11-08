package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.complain.reconciliation.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-27 09:51:51
 */
public class AlipayMerchantComplainReconciliationSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 7393678453912362814L;

	/** 
	 * 商家支付宝账号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 商家类型
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/** 
	 * 对一些不影响12315一键和解流程开通，但是需要修改/优化的点进行提示
	 */
	@ApiField("notice")
	private String notice;

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId( ) {
		return this.merchantId;
	}

	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}
	public String getMerchantType( ) {
		return this.merchantType;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}
	public String getNotice( ) {
		return this.notice;
	}

}
