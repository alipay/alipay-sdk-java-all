package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 计划单元详情
 *
 * @author auto create
 * @since 1.0, 2018-09-18 21:52:42
 */
public class AdPlan extends AlipayObject {

	private static final long serialVersionUID = 6489437762775288961L;

	/**
	 * 注册用户返回的用户ID
	 */
	@ApiField("ad_user_id")
	private Long adUserId;

	/**
	 * 广告投放预算，单位：分
	 */
	@ApiField("budget")
	private Long budget;

	/**
	 * 投放计划结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 计划中所属单元列表
	 */
	@ApiField("group_list")
	private AdGroup groupList;

	/**
	 * 广告计划ID
	 */
	@ApiField("plan_id")
	private Long planId;

	/**
	 * 广告计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 计划保量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 投放计划开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	public Long getAdUserId() {
		return this.adUserId;
	}
	public void setAdUserId(Long adUserId) {
		this.adUserId = adUserId;
	}

	public Long getBudget() {
		return this.budget;
	}
	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public AdGroup getGroupList() {
		return this.groupList;
	}
	public void setGroupList(AdGroup groupList) {
		this.groupList = groupList;
	}

	public Long getPlanId() {
		return this.planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return this.planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
