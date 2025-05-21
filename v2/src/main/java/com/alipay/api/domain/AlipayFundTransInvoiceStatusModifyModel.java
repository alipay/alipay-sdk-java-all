package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 票据平台票据状态更新
 *
 * @author auto create
 * @since 1.0, 2024-11-22 10:10:52
 */
public class AlipayFundTransInvoiceStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5375137292686529677L;

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
	 * 用户身份标识类型，当user_id为空时，此字段必须传值。
1 身份证
	 */
	@ApiField("payer_id_type")
	private String payerIdType;

	/**
	 * 用户标识值，当user_id为空时此字段必须传值，且值与payer_id_type对应，例如身份证号。

如
	 */
	@ApiField("payer_id_value")
	private String payerIdValue;

	/**
	 * 2-作废
3-报销
4-换开
5-红冲
其他状态待添加
	 */
	@ApiField("status")
	private String status;

	/**
	 * 蚂蚁统一会员ID,当此字段为空时，payer_id_type,payer_id_value不能为空
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

	public String getPayerIdType() {
		return this.payerIdType;
	}
	public void setPayerIdType(String payerIdType) {
		this.payerIdType = payerIdType;
	}

	public String getPayerIdValue() {
		return this.payerIdValue;
	}
	public void setPayerIdValue(String payerIdValue) {
		this.payerIdValue = payerIdValue;
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
