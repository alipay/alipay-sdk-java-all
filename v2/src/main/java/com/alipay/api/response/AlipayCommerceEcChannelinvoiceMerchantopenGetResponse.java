package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.channelinvoice.merchantopen.get response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-03 10:57:48
 */
public class AlipayCommerceEcChannelinvoiceMerchantopenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1115582524724876832L;

	/** 
	 * 企业名称
	 */
	@ApiField("company_name")
	private String companyName;

	/** 
	 * 企业税号
	 */
	@ApiField("company_tax_no")
	private String companyTaxNo;

	/** 
	 * 开通失败原因
	 */
	@ApiField("open_fail_reason")
	private String openFailReason;

	/** 
	 * 开通状态
	 */
	@ApiField("open_status")
	private String openStatus;

	/** 
	 * 外部渠道商户 ID
	 */
	@ApiField("out_channel_merchant_id")
	private String outChannelMerchantId;

	/** 
	 * 外部渠道商户名称
	 */
	@ApiField("out_channel_merchant_name")
	private String outChannelMerchantName;

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName( ) {
		return this.companyName;
	}

	public void setCompanyTaxNo(String companyTaxNo) {
		this.companyTaxNo = companyTaxNo;
	}
	public String getCompanyTaxNo( ) {
		return this.companyTaxNo;
	}

	public void setOpenFailReason(String openFailReason) {
		this.openFailReason = openFailReason;
	}
	public String getOpenFailReason( ) {
		return this.openFailReason;
	}

	public void setOpenStatus(String openStatus) {
		this.openStatus = openStatus;
	}
	public String getOpenStatus( ) {
		return this.openStatus;
	}

	public void setOutChannelMerchantId(String outChannelMerchantId) {
		this.outChannelMerchantId = outChannelMerchantId;
	}
	public String getOutChannelMerchantId( ) {
		return this.outChannelMerchantId;
	}

	public void setOutChannelMerchantName(String outChannelMerchantName) {
		this.outChannelMerchantName = outChannelMerchantName;
	}
	public String getOutChannelMerchantName( ) {
		return this.outChannelMerchantName;
	}

}
