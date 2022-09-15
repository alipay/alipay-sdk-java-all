package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cashticket.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-14 16:20:18
 */
public class AlipayMarketingCashticketTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2693344375631837582L;

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
	 * 模板id
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
