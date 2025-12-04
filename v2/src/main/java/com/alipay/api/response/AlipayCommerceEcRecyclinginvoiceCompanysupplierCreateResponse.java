package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.companysupplier.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-22 16:27:30
 */
public class AlipayCommerceEcRecyclinginvoiceCompanysupplierCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1421743443512934936L;

	/** 
	 * 端内通知打开反向开票供应商关系确认页面的url
	 */
	@ApiField("activation_alipay_url")
	private String activationAlipayUrl;

	/** 
	 * 短信方式通知打开反向开票供应商关系确认页面的url
	 */
	@ApiField("activation_url")
	private String activationUrl;

	/** 
	 * 新增成功的供应商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public void setActivationAlipayUrl(String activationAlipayUrl) {
		this.activationAlipayUrl = activationAlipayUrl;
	}
	public String getActivationAlipayUrl( ) {
		return this.activationAlipayUrl;
	}

	public void setActivationUrl(String activationUrl) {
		this.activationUrl = activationUrl;
	}
	public String getActivationUrl( ) {
		return this.activationUrl;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierId( ) {
		return this.supplierId;
	}

}
