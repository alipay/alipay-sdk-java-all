package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 邮箱收票发票信息回传
 *
 * @author auto create
 * @since 1.0, 2024-01-04 16:54:51
 */
public class AlipayEbppInvoiceEmailInvoiceinfoSendModel extends AlipayObject {

	private static final long serialVersionUID = 5352186129541524942L;

	/**
	 * 用户邮箱地址
	 */
	@ApiField("email_address")
	private String emailAddress;

	/**
	 * 邮箱收票发票信息列表
	 */
	@ApiListField("email_invoice_info_list")
	@ApiField("email_invoice_info")
	private List<EmailInvoiceInfo> emailInvoiceInfoList;

	/**
	 * 外部邮件ID
	 */
	@ApiField("out_email_id")
	private String outEmailId;

	public String getEmailAddress() {
		return this.emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public List<EmailInvoiceInfo> getEmailInvoiceInfoList() {
		return this.emailInvoiceInfoList;
	}
	public void setEmailInvoiceInfoList(List<EmailInvoiceInfo> emailInvoiceInfoList) {
		this.emailInvoiceInfoList = emailInvoiceInfoList;
	}

	public String getOutEmailId() {
		return this.outEmailId;
	}
	public void setOutEmailId(String outEmailId) {
		this.outEmailId = outEmailId;
	}

}
