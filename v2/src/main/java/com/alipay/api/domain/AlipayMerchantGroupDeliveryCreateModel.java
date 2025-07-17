package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建推广计划
 *
 * @author auto create
 * @since 1.0, 2024-10-31 16:17:44
 */
public class AlipayMerchantGroupDeliveryCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8614295686497398248L;

	/**
	 * 推广计划绑定场景。specified_org 群组入群，city_group_join 按城市入群，shop_group_join 按门店入群。
	 */
	@ApiField("bind_scene")
	private String bindScene;

	/**
	 * 推广计划入群规则ID。
	 */
	@ApiField("delivery_join_rule_id")
	private String deliveryJoinRuleId;

	/**
	 * 推广计划名称
	 */
	@ApiField("delivery_name")
	private String deliveryName;

	/**
	 * 推广结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 收款账号列表
	 */
	@ApiListField("group_accounts")
	@ApiField("group_account_v_o")
	private List<GroupAccountVO> groupAccounts;

	/**
	 * 群组id，表里唯一键，创建群组自动生成。
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 推广开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getBindScene() {
		return this.bindScene;
	}
	public void setBindScene(String bindScene) {
		this.bindScene = bindScene;
	}

	public String getDeliveryJoinRuleId() {
		return this.deliveryJoinRuleId;
	}
	public void setDeliveryJoinRuleId(String deliveryJoinRuleId) {
		this.deliveryJoinRuleId = deliveryJoinRuleId;
	}

	public String getDeliveryName() {
		return this.deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<GroupAccountVO> getGroupAccounts() {
		return this.groupAccounts;
	}
	public void setGroupAccounts(List<GroupAccountVO> groupAccounts) {
		this.groupAccounts = groupAccounts;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
