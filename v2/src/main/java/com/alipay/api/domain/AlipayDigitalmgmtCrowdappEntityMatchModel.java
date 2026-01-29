package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 透镜圈选_实体同圈选应用匹配判断接口
 *
 * @author auto create
 * @since 1.0, 2025-12-29 10:47:41
 */
public class AlipayDigitalmgmtCrowdappEntityMatchModel extends AlipayObject {

	private static final long serialVersionUID = 2512491562143177571L;

	/**
	 * 是否判断operator是否具有crowdAppIds对应的圈选应用的权限
默认 true，即进行上述权限判断，当 operator 不可访问对应圈选应用时认为实体和圈选应用无关系
false 时，不进行圈选应用权限判断，即无论 operator 是否具有管理员权限，都认为可访问
	 */
	@ApiField("check_crowd_app_permission")
	private Boolean checkCrowdAppPermission;

	/**
	 * 是否判断operator是否具有crowdAppIds对应的圈选应用的权限
默认 true，即进行上述权限判断，当 operator 不可访问对应圈选应用时认为实体和圈选应用无关系
false 时，不进行圈选应用权限判断，即无论 operator 是否具有管理员权限，都认为可访问
	 */
	@ApiField("check_row_permission")
	private Boolean checkRowPermission;

	/**
	 * null
	 */
	@ApiListField("crowd_app_ids")
	@ApiField("string")
	private List<String> crowdAppIds;

	/**
	 * 待判断与人群关系的实体ID
如为员工实体，则为员工工号，不足6 位需要补 0
如为其他实体，请先和透镜平台协调
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 工号需要补0，例如012345；
应用请传递英文名
	 */
	@ApiField("operator")
	private String operator;

	public Boolean getCheckCrowdAppPermission() {
		return this.checkCrowdAppPermission;
	}
	public void setCheckCrowdAppPermission(Boolean checkCrowdAppPermission) {
		this.checkCrowdAppPermission = checkCrowdAppPermission;
	}

	public Boolean getCheckRowPermission() {
		return this.checkRowPermission;
	}
	public void setCheckRowPermission(Boolean checkRowPermission) {
		this.checkRowPermission = checkRowPermission;
	}

	public List<String> getCrowdAppIds() {
		return this.crowdAppIds;
	}
	public void setCrowdAppIds(List<String> crowdAppIds) {
		this.crowdAppIds = crowdAppIds;
	}

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
