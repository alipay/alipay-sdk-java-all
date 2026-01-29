package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动信息
 *
 * @author auto create
 * @since 1.0, 2025-09-10 15:28:52
 */
public class ThirdActivityInfo extends AlipayObject {

	private static final long serialVersionUID = 7358659111865657794L;

	/**
	 * 活动模版id
	 */
	@ApiField("aggr_id")
	private String aggrId;

	/**
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 出资的资金类型
MONEY-余额
MERCHANT_POINT-积分
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 活动支持的期数
	 */
	@ApiListField("install_num_list")
	@ApiField("number")
	private List<Long> installNumList;

	/**
	 * 金额上限,人民币元（CNY）
	 */
	@ApiField("max_money_limit")
	private String maxMoneyLimit;

	/**
	 * 金额下限,人民币元（CNY）
	 */
	@ApiField("min_money_limit")
	private String minMoneyLimit;

	/**
	 * 活动名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 活动状态
EFFECTIVE有效
INEFFECTIVE无效
	 */
	@ApiField("status")
	private String status;

	/**
	 * 贴息场景
ALL代表全场贴息 
SPECIFIED_RULES 代表指定规则
	 */
	@ApiField("subsidy_scope")
	private String subsidyScope;

	public String getAggrId() {
		return this.aggrId;
	}
	public void setAggrId(String aggrId) {
		this.aggrId = aggrId;
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

	public String getMinMoneyLimit() {
		return this.minMoneyLimit;
	}
	public void setMinMoneyLimit(String minMoneyLimit) {
		this.minMoneyLimit = minMoneyLimit;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubsidyScope() {
		return this.subsidyScope;
	}
	public void setSubsidyScope(String subsidyScope) {
		this.subsidyScope = subsidyScope;
	}

}
