package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 竞拍成功接口
 *
 * @author auto create
 * @since 1.0, 2026-07-17 13:46:53
 */
public class XingheLendassistCarfinauctionAuctionsucNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 3314745897211632276L;

	/**
	 * 星河申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 尾款支付截止时间
	 */
	@ApiField("deadline")
	private Date deadline;

	/**
	 * 成交价，单位为分
	 */
	@ApiField("deal_price")
	private Long dealPrice;

	/**
	 * 拍下时间
	 */
	@ApiField("deal_time")
	private Date dealTime;

	/**
	 * 保证金金额，单位为分
	 */
	@ApiField("foregift_price")
	private Long foregiftPrice;

	/**
	 * 处置机构账户名
	 */
	@ApiField("institution_account_name")
	private String institutionAccountName;

	/**
	 * 处置机构银行账号
	 */
	@ApiField("institution_bank_account")
	private String institutionBankAccount;

	/**
	 * 处置机构开户行联行号
	 */
	@ApiField("institution_bank_code")
	private String institutionBankCode;

	/**
	 * 处置机构开户行名称
	 */
	@ApiField("institution_bank_name")
	private String institutionBankName;

	/**
	 * 外部订单号（阿里拍卖单号）
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 转账附言
	 */
	@ApiField("payment_remark")
	private String paymentRemark;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public Date getDeadline() {
		return this.deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Long getDealPrice() {
		return this.dealPrice;
	}
	public void setDealPrice(Long dealPrice) {
		this.dealPrice = dealPrice;
	}

	public Date getDealTime() {
		return this.dealTime;
	}
	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}

	public Long getForegiftPrice() {
		return this.foregiftPrice;
	}
	public void setForegiftPrice(Long foregiftPrice) {
		this.foregiftPrice = foregiftPrice;
	}

	public String getInstitutionAccountName() {
		return this.institutionAccountName;
	}
	public void setInstitutionAccountName(String institutionAccountName) {
		this.institutionAccountName = institutionAccountName;
	}

	public String getInstitutionBankAccount() {
		return this.institutionBankAccount;
	}
	public void setInstitutionBankAccount(String institutionBankAccount) {
		this.institutionBankAccount = institutionBankAccount;
	}

	public String getInstitutionBankCode() {
		return this.institutionBankCode;
	}
	public void setInstitutionBankCode(String institutionBankCode) {
		this.institutionBankCode = institutionBankCode;
	}

	public String getInstitutionBankName() {
		return this.institutionBankName;
	}
	public void setInstitutionBankName(String institutionBankName) {
		this.institutionBankName = institutionBankName;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPaymentRemark() {
		return this.paymentRemark;
	}
	public void setPaymentRemark(String paymentRemark) {
		this.paymentRemark = paymentRemark;
	}

}
