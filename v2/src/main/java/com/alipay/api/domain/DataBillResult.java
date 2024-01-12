package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单、转化查询结果数据
 *
 * @author auto create
 * @since 1.0, 2023-08-17 15:01:16
 */
public class DataBillResult extends AlipayObject {

	private static final long serialVersionUID = 8136655662951728416L;

	/**
	 * 活动名
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动类型，枚举：GMV\促活\促绑
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 银行清算号16位/31位
	 */
	@ApiField("bank_bill_no")
	private String bankBillNo;

	/**
	 * 银行简称
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 银行分行信息
	 */
	@ApiField("branch_name")
	private String branchName;

	/**
	 * 交易日期，格式为yyyyMMdd
	 */
	@ApiField("pay_date")
	private String payDate;

	/**
	 * 交易时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 实际交易金额，提现金额
	 */
	@ApiField("real_pay_amt")
	private String realPayAmt;

	/**
	 * 订单金额
	 */
	@ApiField("trade_total_amt")
	private String tradeTotalAmt;

	/**
	 * 用户交易笔数排序
	 */
	@ApiField("user_trd_cnt_rank")
	private String userTrdCntRank;

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getBankBillNo() {
		return this.bankBillNo;
	}
	public void setBankBillNo(String bankBillNo) {
		this.bankBillNo = bankBillNo;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return this.branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getPayDate() {
		return this.payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getRealPayAmt() {
		return this.realPayAmt;
	}
	public void setRealPayAmt(String realPayAmt) {
		this.realPayAmt = realPayAmt;
	}

	public String getTradeTotalAmt() {
		return this.tradeTotalAmt;
	}
	public void setTradeTotalAmt(String tradeTotalAmt) {
		this.tradeTotalAmt = tradeTotalAmt;
	}

	public String getUserTrdCntRank() {
		return this.userTrdCntRank;
	}
	public void setUserTrdCntRank(String userTrdCntRank) {
		this.userTrdCntRank = userTrdCntRank;
	}

}
