package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票交付信息，包含发票文件类型、手机/邮箱交付信息、小程序手机号和电子发票账户等
 *
 * @author auto create
 * @since 1.0, 2026-08-14 19:59:20
 */
public class InvoiceDeliverInfo extends AlipayObject {

	private static final long serialVersionUID = 2545487287218483164L;

	/**
	 * 交付邮箱
	 */
	@ApiField("client_email")
	private String clientEmail;

	/**
	 * 交付手机号
	 */
	@ApiField("client_phone")
	private String clientPhone;

	/**
	 * 0 不交付，1 手机或邮箱交付
	 */
	@ApiField("deliver_type")
	private String deliverType;

	/**
	 * 开票人唯一标识
	 */
	@ApiField("electronic_invoice_account")
	private String electronicInvoiceAccount;

	/**
	 * 推送的文件类型
1:pdf 2:ofd 3.xml 4:pdf+ofd 5:pdf+xml 6:ofd+xml 7:pdf+ofd+xml。
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 小程序绑定手机号，如支付宝小程序绑定过手机号，则可以在支付宝卡包中看到发票
	 */
	@ApiField("tinyapp_phone")
	private String tinyappPhone;

	public String getClientEmail() {
		return this.clientEmail;
	}
	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getClientPhone() {
		return this.clientPhone;
	}
	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}

	public String getDeliverType() {
		return this.deliverType;
	}
	public void setDeliverType(String deliverType) {
		this.deliverType = deliverType;
	}

	public String getElectronicInvoiceAccount() {
		return this.electronicInvoiceAccount;
	}
	public void setElectronicInvoiceAccount(String electronicInvoiceAccount) {
		this.electronicInvoiceAccount = electronicInvoiceAccount;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getTinyappPhone() {
		return this.tinyappPhone;
	}
	public void setTinyappPhone(String tinyappPhone) {
		this.tinyappPhone = tinyappPhone;
	}

}
