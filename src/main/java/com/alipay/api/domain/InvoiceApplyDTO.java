package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 待开票申请信息
 *
 * @author auto create
 * @since 1.0, 2022-07-14 17:43:04
 */
public class InvoiceApplyDTO extends AlipayObject {

	private static final long serialVersionUID = 8893319468778378964L;

	/**
	 * 合计金额（申请开票总金额，含税）
格式为2位小数
	 */
	@ApiField("apply_amount")
	private String applyAmount;

	/**
	 * 开票申请ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 批次id
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 该申请批次对应的实际账单对应结束时间
	 */
	@ApiField("gmt_biz_end")
	private Date gmtBizEnd;

	/**
	 * 该申请批次对应的实际账单对应起始时间
	 */
	@ApiField("gmt_biz_start")
	private Date gmtBizStart;

	/**
	 * 开票（介质）类型
可选值：
0: 电票
1：纸质普票
2：纸质专票
3：电子专票
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 发票（文件）类型
可选值：
blue: 蓝票
red: 红票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 销方税号
	 */
	@ApiField("payee_register_no")
	private String payeeRegisterNo;

	/**
	 * 购方地址
	 */
	@ApiField("payer_address")
	private String payerAddress;

	/**
	 * 购方银行账号
	 */
	@ApiField("payer_bank_account_id")
	private String payerBankAccountId;

	/**
	 * 购方开户行名称
	 */
	@ApiField("payer_bank_name")
	private String payerBankName;

	/**
	 * 购方电子邮箱，需满足邮箱格式。
	 */
	@ApiField("payer_email")
	private String payerEmail;

	/**
	 * 购方抬头
	 */
	@ApiField("payer_name")
	private String payerName;

	/**
	 * 购方电话
	 */
	@ApiField("payer_phone")
	private String payerPhone;

	/**
	 * 购方方税务登记证号，由大写字母或数字组成，长度要求15~20位。
	 */
	@ApiField("payer_register_no")
	private String payerRegisterNo;

	/**
	 * 购方手机号码，用于短信通知收票。
格式为11位数字组成的手机号码
	 */
	@ApiField("recieve_mobile")
	private String recieveMobile;

	public String getApplyAmount() {
		return this.applyAmount;
	}
	public void setApplyAmount(String applyAmount) {
		this.applyAmount = applyAmount;
	}

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public Date getGmtBizEnd() {
		return this.gmtBizEnd;
	}
	public void setGmtBizEnd(Date gmtBizEnd) {
		this.gmtBizEnd = gmtBizEnd;
	}

	public Date getGmtBizStart() {
		return this.gmtBizStart;
	}
	public void setGmtBizStart(Date gmtBizStart) {
		this.gmtBizStart = gmtBizStart;
	}

	public String getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
	}
	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

	public String getPayerAddress() {
		return this.payerAddress;
	}
	public void setPayerAddress(String payerAddress) {
		this.payerAddress = payerAddress;
	}

	public String getPayerBankAccountId() {
		return this.payerBankAccountId;
	}
	public void setPayerBankAccountId(String payerBankAccountId) {
		this.payerBankAccountId = payerBankAccountId;
	}

	public String getPayerBankName() {
		return this.payerBankName;
	}
	public void setPayerBankName(String payerBankName) {
		this.payerBankName = payerBankName;
	}

	public String getPayerEmail() {
		return this.payerEmail;
	}
	public void setPayerEmail(String payerEmail) {
		this.payerEmail = payerEmail;
	}

	public String getPayerName() {
		return this.payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getPayerPhone() {
		return this.payerPhone;
	}
	public void setPayerPhone(String payerPhone) {
		this.payerPhone = payerPhone;
	}

	public String getPayerRegisterNo() {
		return this.payerRegisterNo;
	}
	public void setPayerRegisterNo(String payerRegisterNo) {
		this.payerRegisterNo = payerRegisterNo;
	}

	public String getRecieveMobile() {
		return this.recieveMobile;
	}
	public void setRecieveMobile(String recieveMobile) {
		this.recieveMobile = recieveMobile;
	}

}
