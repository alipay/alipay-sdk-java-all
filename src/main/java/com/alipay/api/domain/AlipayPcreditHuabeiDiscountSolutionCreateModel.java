package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建方案实例
 *
 * @author auto create
 * @since 1.0, 2019-08-30 11:34:50
 */
public class AlipayPcreditHuabeiDiscountSolutionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6694568825458931627L;

	/**
	 * 花呗分期商家贴息活动名称，长度不能超过30个汉字或字符
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * amount_budget，花呗分期贴息预算金额，单位是元
	 */
	@ApiField("amount_budget")
	private String amountBudget;

	/**
	 * budget_warning_mail_list，预算提醒邮件列表，邮箱必须符合邮箱地址规则，提醒邮箱个数不能超过5个
	 */
	@ApiListField("budget_warning_mail_list")
	@ApiField("string")
	private List<String> budgetWarningMailList;

	/**
	 * budget_warning_mobile_no_list，预算提醒手机号列表，符合手机号码规则，提醒手机号个数不能超过5个
	 */
	@ApiListField("budget_warning_mobile_no_list")
	@ApiField("string")
	private List<String> budgetWarningMobileNoList;

	/**
	 * budget_warning_money，预算提醒金额，不能高于预算金额，预算达到该金额时会触发告警通知，单位是元。
	 */
	@ApiField("budget_warning_money")
	private String budgetWarningMoney;

	/**
	 * end_time，活动结束时间，必须大于start_time，且结束时间必须晚于当前时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * install_num_str_list，花呗分期数集合，不同期数之间用逗号分开
	 */
	@ApiListField("install_num_str_list")
	@ApiField("string")
	private List<String> installNumStrList;

	/**
	 * max_money_limit，免息金额上限不能大于300000, 不能低于免息金额下限，交易额度若高于该上限值则不做花呗分期免息补贴，单位是元
	 */
	@ApiField("max_money_limit")
	private String maxMoneyLimit;

	/**
	 * min_money_limit，免息金额下限不能少于100，交易额度若小于该值，则不做花呗分期免息补贴，单位是元。
	 */
	@ApiField("min_money_limit")
	private String minMoneyLimit;

	/**
	 * start_time，活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * sub_shop_info, 子门店信息，间连贴息商家、海外商家该字段必须要填写，其他选填！
	 */
	@ApiField("sub_shop_info")
	private SubShopInfo subShopInfo;

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

	public List<String> getBudgetWarningMailList() {
		return this.budgetWarningMailList;
	}
	public void setBudgetWarningMailList(List<String> budgetWarningMailList) {
		this.budgetWarningMailList = budgetWarningMailList;
	}

	public List<String> getBudgetWarningMobileNoList() {
		return this.budgetWarningMobileNoList;
	}
	public void setBudgetWarningMobileNoList(List<String> budgetWarningMobileNoList) {
		this.budgetWarningMobileNoList = budgetWarningMobileNoList;
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

	public List<String> getInstallNumStrList() {
		return this.installNumStrList;
	}
	public void setInstallNumStrList(List<String> installNumStrList) {
		this.installNumStrList = installNumStrList;
	}

	public String getMaxMoneyLimit() {
		return this.maxMoneyLimit;
	}
	public void setMaxMoneyLimit(String maxMoneyLimit) {
		this.maxMoneyLimit = maxMoneyLimit;
	}

	public String getMinMoneyLimit() {
		return this.minMoneyLimit;
	}
	public void setMinMoneyLimit(String minMoneyLimit) {
		this.minMoneyLimit = minMoneyLimit;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public SubShopInfo getSubShopInfo() {
		return this.subShopInfo;
	}
	public void setSubShopInfo(SubShopInfo subShopInfo) {
		this.subShopInfo = subShopInfo;
	}

}
