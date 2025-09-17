package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsmartpay.invoicepostaddress.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-18 10:07:04
 */
public class AlipayBossFncGfsmartpayInvoicepostaddressQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8885114435836965718L;

	/** 
	 * 地址名称
	 */
	@ApiField("address_name")
	private String addressName;

	/** 
	 * 联系电话
	 */
	@ApiField("address_phone")
	private String addressPhone;

	/** 
	 * 联系邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/** 
	 * 大陆发票邮箱
	 */
	@ApiField("mainland_invoice_post_email")
	private String mainlandInvoicePostEmail;

	/** 
	 * 海外发票邮箱
	 */
	@ApiField("oversea_invoice_post_email")
	private String overseaInvoicePostEmail;

	/** 
	 * 邮寄地址
	 */
	@ApiField("post_address")
	private String postAddress;

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	public String getAddressName( ) {
		return this.addressName;
	}

	public void setAddressPhone(String addressPhone) {
		this.addressPhone = addressPhone;
	}
	public String getAddressPhone( ) {
		return this.addressPhone;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactEmail( ) {
		return this.contactEmail;
	}

	public void setMainlandInvoicePostEmail(String mainlandInvoicePostEmail) {
		this.mainlandInvoicePostEmail = mainlandInvoicePostEmail;
	}
	public String getMainlandInvoicePostEmail( ) {
		return this.mainlandInvoicePostEmail;
	}

	public void setOverseaInvoicePostEmail(String overseaInvoicePostEmail) {
		this.overseaInvoicePostEmail = overseaInvoicePostEmail;
	}
	public String getOverseaInvoicePostEmail( ) {
		return this.overseaInvoicePostEmail;
	}

	public void setPostAddress(String postAddress) {
		this.postAddress = postAddress;
	}
	public String getPostAddress( ) {
		return this.postAddress;
	}

}
