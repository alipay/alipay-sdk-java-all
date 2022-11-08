package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保函发票申请
 *
 * @author auto create
 * @since 1.0, 2022-08-24 17:36:42
 */
public class MybankCreditLoantradeGuarletterInvoiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4681572921133572858L;

	/**
	 * 公司地址，专票时必填
	 */
	@ApiField("address")
	private String address;

	/**
	 * 证件号
	 */
	@ApiField("apply_user_cert_no")
	private String applyUserCertNo;

	/**
	 * 开票企业名称
	 */
	@ApiField("apply_user_name")
	private String applyUserName;

	/**
	 * 银行账户号，专票时必填
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 开户行，专票时必填
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 联系电话
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 保函单号
	 */
	@ApiField("guar_order_no")
	private String guarOrderNo;

	/**
	 * 开票金额
	 */
	@ApiField("invoice_amt")
	private CreditPayMoneyVO invoiceAmt;

	/**
	 * 1：普票
2：专票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 电话号码，专票时必填
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 接收电子发票时必传
	 */
	@ApiField("receive_email")
	private String receiveEmail;

	/**
	 * 请求单号
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getApplyUserCertNo() {
		return this.applyUserCertNo;
	}
	public void setApplyUserCertNo(String applyUserCertNo) {
		this.applyUserCertNo = applyUserCertNo;
	}

	public String getApplyUserName() {
		return this.applyUserName;
	}
	public void setApplyUserName(String applyUserName) {
		this.applyUserName = applyUserName;
	}

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getGuarOrderNo() {
		return this.guarOrderNo;
	}
	public void setGuarOrderNo(String guarOrderNo) {
		this.guarOrderNo = guarOrderNo;
	}

	public CreditPayMoneyVO getInvoiceAmt() {
		return this.invoiceAmt;
	}
	public void setInvoiceAmt(CreditPayMoneyVO invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getReceiveEmail() {
		return this.receiveEmail;
	}
	public void setReceiveEmail(String receiveEmail) {
		this.receiveEmail = receiveEmail;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
