package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cashvoucher.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingCashvoucherTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8263123925551932878L;

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

}
