package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告单元层级数据结构
 *
 * @author auto create
 * @since 1.0, 2018-09-18 21:52:42
 */
public class AdGroup extends AlipayObject {

	private static final long serialVersionUID = 8631144515969236927L;

	/**
	 * 广告系统ID
	 */
	@ApiField("ad_user_id")
	private Long adUserId;

	/**
	 * 人群定向（优化）配置串
	 */
	@ApiField("crowd_condition")
	private String crowdCondition;

	/**
	 * 广告单元ID，新建时留空
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * 广告单元名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 单元所属计划ID
	 */
	@ApiField("plan_id")
	private Long planId;

	/**
	 * 区域定向
	 */
	@ApiListField("position_condition")
	@ApiField("position")
	private List<Position> positionCondition;

	/**
	 * 单元保量数值
	 */
	@ApiField("quantity")
	private Long quantity;

	public Long getAdUserId() {
		return this.adUserId;
	}
	public void setAdUserId(Long adUserId) {
		this.adUserId = adUserId;
	}

	public String getCrowdCondition() {
		return this.crowdCondition;
	}
	public void setCrowdCondition(String crowdCondition) {
		this.crowdCondition = crowdCondition;
	}

	public Long getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Long getPlanId() {
		return this.planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public List<Position> getPositionCondition() {
		return this.positionCondition;
	}
	public void setPositionCondition(List<Position> positionCondition) {
		this.positionCondition = positionCondition;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
