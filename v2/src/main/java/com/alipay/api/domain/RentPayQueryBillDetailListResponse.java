package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对账单详情
 *
 * @author auto create
 * @since 1.0, 2024-12-19 22:31:52
 */
public class RentPayQueryBillDetailListResponse extends AlipayObject {

	private static final long serialVersionUID = 6753351871657848111L;

	/**
	 * 公积金付金额，单位：元
	 */
	@ApiField("acc_amount")
	private String accAmount;

	/**
	 * 待创单
	 */
	@ApiField("acc_pay_status")
	private String accPayStatus;

	/**
	 * 账户编号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 付款批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 提示信息
	 */
	@ApiField("description")
	private String description;

	/**
	 * 提取日期，日期格式都是yyyy-mm-dd
	 */
	@ApiField("draw_date")
	private String drawDate;

	/**
	 * 审批号
	 */
	@ApiField("org_biz_no")
	private String orgBizNo;

	/**
	 * 租赁机构订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 姓名
	 */
	@ApiField("pay_cert_name")
	private String payCertName;

	/**
	 * 证件号码
	 */
	@ApiField("pay_cert_num")
	private String payCertNum;

	/**
	 * 证件类型
	 */
	@ApiField("pay_cert_type")
	private String payCertType;

	/**
	 * 付款日期，日期格式都是yyyy-mm-dd
	 */
	@ApiField("payment_date")
	private String paymentDate;

	/**
	 * 收款银行全称
	 */
	@ApiField("rent_bank_name")
	private String rentBankName;

	/**
	 * 收款账户号码
	 */
	@ApiField("rent_card_num")
	private String rentCardNum;

	/**
	 * 租房直付，非公积金支付金额，单位：元
	 */
	@ApiField("self_amount")
	private String selfAmount;

	/**
	 * 银行结算流水号
	 */
	@ApiField("settle_serial_no")
	private String settleSerialNo;

	/**
	 * 房租总金额，单位:元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAccAmount() {
		return this.accAmount;
	}
	public void setAccAmount(String accAmount) {
		this.accAmount = accAmount;
	}

	public String getAccPayStatus() {
		return this.accPayStatus;
	}
	public void setAccPayStatus(String accPayStatus) {
		this.accPayStatus = accPayStatus;
	}

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDrawDate() {
		return this.drawDate;
	}
	public void setDrawDate(String drawDate) {
		this.drawDate = drawDate;
	}

	public String getOrgBizNo() {
		return this.orgBizNo;
	}
	public void setOrgBizNo(String orgBizNo) {
		this.orgBizNo = orgBizNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayCertName() {
		return this.payCertName;
	}
	public void setPayCertName(String payCertName) {
		this.payCertName = payCertName;
	}

	public String getPayCertNum() {
		return this.payCertNum;
	}
	public void setPayCertNum(String payCertNum) {
		this.payCertNum = payCertNum;
	}

	public String getPayCertType() {
		return this.payCertType;
	}
	public void setPayCertType(String payCertType) {
		this.payCertType = payCertType;
	}

	public String getPaymentDate() {
		return this.paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getRentBankName() {
		return this.rentBankName;
	}
	public void setRentBankName(String rentBankName) {
		this.rentBankName = rentBankName;
	}

	public String getRentCardNum() {
		return this.rentCardNum;
	}
	public void setRentCardNum(String rentCardNum) {
		this.rentCardNum = rentCardNum;
	}

	public String getSelfAmount() {
		return this.selfAmount;
	}
	public void setSelfAmount(String selfAmount) {
		this.selfAmount = selfAmount;
	}

	public String getSettleSerialNo() {
		return this.settleSerialNo;
	}
	public void setSettleSerialNo(String settleSerialNo) {
		this.settleSerialNo = settleSerialNo;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
