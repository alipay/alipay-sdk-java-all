package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 离境退税服务
 *
 * @author auto create
 * @since 1.0, 2025-07-01 20:29:07
 */
public class AlipayUserTaxRefundModel extends AlipayObject {

	private static final long serialVersionUID = 8242578279157553473L;

	/**
	 * 资金记账本id
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 退税申请单总金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 二维码值
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 总金额，单位为元，精确到小数点后两位，取值范围[0.1,100000000]。
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退税申请单号
	 */
	@ApiField("refund_biz_no")
	private String refundBizNo;

	public String getAccountBookId() {
		return this.accountBookId;
	}
	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getQrCode() {
		return this.qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundBizNo() {
		return this.refundBizNo;
	}
	public void setRefundBizNo(String refundBizNo) {
		this.refundBizNo = refundBizNo;
	}

}
