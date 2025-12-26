package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 抽佣信息
 *
 * @author auto create
 * @since 1.0, 2025-01-05 10:03:05
 */
public class CommissionInfo extends AlipayObject {

	private static final long serialVersionUID = 5341587413387363826L;

	/**
	 * 角色列表
	 */
	@ApiListField("commission_role_list")
	@ApiField("commission_role_info")
	private List<CommissionRoleInfo> commissionRoleList;

	/**
	 * 抽佣比例
	 */
	@ApiField("isv_rate")
	private String isvRate;

	/**
	 * 目标id
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 商家
	 */
	@ApiField("target_type")
	private String targetType;

	public List<CommissionRoleInfo> getCommissionRoleList() {
		return this.commissionRoleList;
	}
	public void setCommissionRoleList(List<CommissionRoleInfo> commissionRoleList) {
		this.commissionRoleList = commissionRoleList;
	}

	public String getIsvRate() {
		return this.isvRate;
	}
	public void setIsvRate(String isvRate) {
		this.isvRate = isvRate;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}
