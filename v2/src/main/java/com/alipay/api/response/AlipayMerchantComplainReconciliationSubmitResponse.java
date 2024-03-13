package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.complain.reconciliation.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:34
 */
public class AlipayMerchantComplainReconciliationSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 7334453683284825685L;

	/** 
	 * 商家的统一社会信用代码，间连商家则取二次认证后的统一社会信用代码
	 */
	@ApiField("merchant_credit_no")
	private String merchantCreditNo;

	/** 
	 * 商家支付宝账号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 商家在支付宝侧的名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

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

	public void setMerchantCreditNo(String merchantCreditNo) {
		this.merchantCreditNo = merchantCreditNo;
	}
	public String getMerchantCreditNo( ) {
		return this.merchantCreditNo;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId( ) {
		return this.merchantId;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
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
