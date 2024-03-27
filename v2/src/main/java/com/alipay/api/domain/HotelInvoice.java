package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票
 *
 * @author auto create
 * @since 1.0, 2024-01-24 10:57:25
 */
public class HotelInvoice extends AlipayObject {

	private static final long serialVersionUID = 5258321368297456835L;

	/**
	 * 发票模式
1=酒店开票
2=Ota提供发票
	 */
	@ApiField("invoice_mode")
	private Long invoiceMode;

	/**
	 * 发票用途：中间用逗号分隔，代订房费，旅游费，差旅费，其他
	 */
	@ApiField("invoice_purpose")
	private String invoicePurpose;

	/**
	 * 支持的发票类型列表(英文逗号分割)：
1：增值税普通发票(纸质)，
2：增值税专用发票(纸质)，
3：增值税普通发票(电子)
	 */
	@ApiListField("invoice_type")
	@ApiField("string")
	private List<String> invoiceType;

	/**
	 * 邮费提供方：
0：未设置 
1：卖家承担，
2：买家承担（邮费到付），
3：卖家承担（邮费￥XX）
	 */
	@ApiField("postage_provider")
	private String postageProvider;

	public Long getInvoiceMode() {
		return this.invoiceMode;
	}
	public void setInvoiceMode(Long invoiceMode) {
		this.invoiceMode = invoiceMode;
	}

	public String getInvoicePurpose() {
		return this.invoicePurpose;
	}
	public void setInvoicePurpose(String invoicePurpose) {
		this.invoicePurpose = invoicePurpose;
	}

	public List<String> getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(List<String> invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getPostageProvider() {
		return this.postageProvider;
	}
	public void setPostageProvider(String postageProvider) {
		this.postageProvider = postageProvider;
	}

}
