package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cashitemvoucher.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:18:02
 */
public class AlipayMarketingCashitemvoucherTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1824223454165216924L;

	/** 
	 * 模板支付确认链接
	 */
	@ApiField("confirm_uri")
	private String confirmUri;

	/** 
	 * 资金订单号，模板支付时需要
	 */
	@ApiField("fund_order_no")
	private String fundOrderNo;

	/** 
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 使用一张单品券用户可以获得的最大优惠。计算方式和单张券的最大优惠的上限请参考产品说明文档
	 */
	@ApiField("voucher_discount_limit")
	private String voucherDiscountLimit;

	public void setConfirmUri(String confirmUri) {
		this.confirmUri = confirmUri;
	}
	public String getConfirmUri( ) {
		return this.confirmUri;
	}

	public void setFundOrderNo(String fundOrderNo) {
		this.fundOrderNo = fundOrderNo;
	}
	public String getFundOrderNo( ) {
		return this.fundOrderNo;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

	public void setVoucherDiscountLimit(String voucherDiscountLimit) {
		this.voucherDiscountLimit = voucherDiscountLimit;
	}
	public String getVoucherDiscountLimit( ) {
		return this.voucherDiscountLimit;
	}

}
