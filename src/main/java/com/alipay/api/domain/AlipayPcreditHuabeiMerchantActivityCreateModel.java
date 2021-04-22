package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 新版花呗分期商家贴息活动创建接口
 *
 * @author auto create
 * @since 1.0, 2020-12-21 16:56:15
 */
public class AlipayPcreditHuabeiMerchantActivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3743383187953232791L;

	/**
	 * 花呗分期商家贴息活动名称，长度不能超过30个汉字或字符
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 花呗分期贴息预算金额，单位是元
	 */
	@ApiField("amount_budget")
	private String amountBudget;

	/**
	 * 预算提醒邮件列表，邮箱必须符合邮箱地址规则，提醒邮箱个数不能超过5个,多个邮箱用逗号隔开
	 */
	@ApiField("budget_warning_mail_list")
	private String budgetWarningMailList;

	/**
	 * 预算提醒手机号列表，符合手机号码规则，提醒手机号个数不能超过5个，多个手机号用逗号隔开
	 */
	@ApiField("budget_warning_mobile_list")
	private String budgetWarningMobileList;

	/**
	 * 预算提醒金额，不能高于预算金额，预算达到该金额时会触发告警通知，单位是元
	 */
	@ApiField("budget_warning_money")
	private String budgetWarningMoney;

	/**
	 * 活动结束时间，必须大于start_time，且结束时间必须大于当前时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 出资的资金类型，默认值=MONEY，商户积分=MERCHANT_POINT
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 花呗分期数集合
	 */
	@ApiListField("install_num_list")
	@ApiField("number")
	private List<Long> installNumList;

	/**
	 * 免息金额上限不能大于300000, 不能低于免息金额下限，交易额度若高于该上限值则不做花呗分期免息补贴，单位是元
	 */
	@ApiField("max_money_limit")
	private String maxMoneyLimit;

	/**
	 * 贴息对象门店信息
	 */
	@ApiListField("merchant_info")
	@ApiField("hb_merchant_info")
	private List<HbMerchantInfo> merchantInfo;

	/**
	 * 免息金额下限不能少于100，交易额度若小于该值，则不做花呗分期免息补贴，单位是元。
	 */
	@ApiField("min_money_limit")
	private String minMoneyLimit;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 活动开始时间,精确到秒
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getAmountBudget() {
		return this.amountBudget;
	}
	public void setAmountBudget(String amountBudget) {
		this.amountBudget = amountBudget;
	}

	public String getBudgetWarningMailList() {
		return this.budgetWarningMailList;
	}
	public void setBudgetWarningMailList(String budgetWarningMailList) {
		this.budgetWarningMailList = budgetWarningMailList;
	}

	public String getBudgetWarningMobileList() {
		return this.budgetWarningMobileList;
	}
	public void setBudgetWarningMobileList(String budgetWarningMobileList) {
		this.budgetWarningMobileList = budgetWarningMobileList;
	}

	public String getBudgetWarningMoney() {
		return this.budgetWarningMoney;
	}
	public void setBudgetWarningMoney(String budgetWarningMoney) {
		this.budgetWarningMoney = budgetWarningMoney;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public List<Long> getInstallNumList() {
		return this.installNumList;
	}
	public void setInstallNumList(List<Long> installNumList) {
		this.installNumList = installNumList;
	}

	public String getMaxMoneyLimit() {
		return this.maxMoneyLimit;
	}
	public void setMaxMoneyLimit(String maxMoneyLimit) {
		this.maxMoneyLimit = maxMoneyLimit;
	}

	public List<HbMerchantInfo> getMerchantInfo() {
		return this.merchantInfo;
	}
	public void setMerchantInfo(List<HbMerchantInfo> merchantInfo) {
		this.merchantInfo = merchantInfo;
	}

	public String getMinMoneyLimit() {
		return this.minMoneyLimit;
	}
	public void setMinMoneyLimit(String minMoneyLimit) {
		this.minMoneyLimit = minMoneyLimit;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
