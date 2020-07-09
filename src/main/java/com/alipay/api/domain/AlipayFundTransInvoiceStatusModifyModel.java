package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 票据平台票据状态更新
 *
 * @author auto create
 * @since 1.0, 2020-05-29 15:10:10
 */
public class AlipayFundTransInvoiceStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4442161559225894738L;

	/**
	 * 票据代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 票据号码
	 */
	@ApiField("invoice_number")
	private String invoiceNumber;

	/**
	 * 2-作废
5-红冲
其他状态待添加
	 */
	@ApiField("status")
	private String status;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 校验码
	 */
	@ApiField("verify")
	private String verify;

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceNumber() {
		return this.invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVerify() {
		return this.verify;
	}
	public void setVerify(String verify) {
		this.verify = verify;
	}

}
