package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保费打款信息模型
 *
 * @author auto create
 * @since 1.0, 2022-08-19 15:20:43
 */
public class ClaimAdvancePaymentDTO extends AlipayObject {

	private static final long serialVersionUID = 7193953615482936581L;

	/**
	 * 赔案号
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 理赔报案单号
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	/**
	 * 收款账号名称
	 */
	@ApiField("in_account_name")
	private String inAccountName;

	/**
	 * 收款账号
	 */
	@ApiField("in_account_no")
	private String inAccountNo;

	/**
	 * 收入账号类型
	 */
	@ApiField("in_account_type")
	private String inAccountType;

	/**
	 * 支出账号名
	 */
	@ApiField("out_account_name")
	private String outAccountName;

	/**
	 * 支出账号
	 */
	@ApiField("out_account_no")
	private String outAccountNo;

	/**
	 * 支出账号类型
	 */
	@ApiField("out_account_type")
	private String outAccountType;

	/**
	 * 打款账单号
	 */
	@ApiField("pay_bill_no")
	private String payBillNo;

	/**
	 * 打款渠道类型：
MYBANK_SHARE(网商银行分账),
ALIPAY(支付宝打款),
WXPAY(微信支付),
CHINA_PAY(银联支付),
BANK_CARD_PAY(银行卡支付),
OTHER(其它)
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 打款金额
	 */
	@ApiField("pay_fee")
	private Long payFee;

	/**
	 * 打款订单号
	 */
	@ApiField("pay_order_no")
	private String payOrderNo;

	/**
	 * 打款业务单号
	 */
	@ApiField("pay_out_biz_no")
	private String payOutBizNo;

	/**
	 * 打款时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getClaimReportNo() {
		return this.claimReportNo;
	}
	public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}

	public String getInAccountName() {
		return this.inAccountName;
	}
	public void setInAccountName(String inAccountName) {
		this.inAccountName = inAccountName;
	}

	public String getInAccountNo() {
		return this.inAccountNo;
	}
	public void setInAccountNo(String inAccountNo) {
		this.inAccountNo = inAccountNo;
	}

	public String getInAccountType() {
		return this.inAccountType;
	}
	public void setInAccountType(String inAccountType) {
		this.inAccountType = inAccountType;
	}

	public String getOutAccountName() {
		return this.outAccountName;
	}
	public void setOutAccountName(String outAccountName) {
		this.outAccountName = outAccountName;
	}

	public String getOutAccountNo() {
		return this.outAccountNo;
	}
	public void setOutAccountNo(String outAccountNo) {
		this.outAccountNo = outAccountNo;
	}

	public String getOutAccountType() {
		return this.outAccountType;
	}
	public void setOutAccountType(String outAccountType) {
		this.outAccountType = outAccountType;
	}

	public String getPayBillNo() {
		return this.payBillNo;
	}
	public void setPayBillNo(String payBillNo) {
		this.payBillNo = payBillNo;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public Long getPayFee() {
		return this.payFee;
	}
	public void setPayFee(Long payFee) {
		this.payFee = payFee;
	}

	public String getPayOrderNo() {
		return this.payOrderNo;
	}
	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}

	public String getPayOutBizNo() {
		return this.payOutBizNo;
	}
	public void setPayOutBizNo(String payOutBizNo) {
		this.payOutBizNo = payOutBizNo;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

}
