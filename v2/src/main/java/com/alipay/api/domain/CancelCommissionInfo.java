package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:27
 */
public class CancelCommissionInfo extends AlipayObject {

	private static final long serialVersionUID = 1184357881349733718L;

	/**
	 * null
	 */
	@ApiListField("commission_role_list")
	@ApiField("cancel_commission_role_info")
	private List<CancelCommissionRoleInfo> commissionRoleList;

	/**
	 * 是否修改服务商规则
	 */
	@ApiField("modify_isv_rule")
	private Boolean modifyIsvRule;

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

	public List<CancelCommissionRoleInfo> getCommissionRoleList() {
		return this.commissionRoleList;
	}
	public void setCommissionRoleList(List<CancelCommissionRoleInfo> commissionRoleList) {
		this.commissionRoleList = commissionRoleList;
	}

	public Boolean getModifyIsvRule() {
		return this.modifyIsvRule;
	}
	public void setModifyIsvRule(Boolean modifyIsvRule) {
		this.modifyIsvRule = modifyIsvRule;
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
