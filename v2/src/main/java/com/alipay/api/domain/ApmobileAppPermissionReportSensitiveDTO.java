package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 端权限检测报告-敏感权限使用分析DTO
 *
 * @author auto create
 * @since 1.0, 2023-07-03 17:06:34
 */
public class ApmobileAppPermissionReportSensitiveDTO extends AlipayObject {

	private static final long serialVersionUID = 4264725732687654829L;

	/**
	 * 申请的权限 (APP在Manifest文件中声明敏感权限)
	 */
	@ApiField("permission_apply")
	private Long permissionApply;

	/**
	 * (过度的申请权限)在Manifest文件中声明了但未在代码中调用的敏感权限
	 */
	@ApiField("permission_over_apply")
	private Long permissionOverApply;

	/**
	 * 冗余权限( 在代码中调用了但未在Manifest文件中声明的敏感权限)
	 */
	@ApiField("permission_over_used")
	private Long permissionOverUsed;

	/**
	 * 申请和使用权限 (APP在Manifest文件中声明及代码中调用的敏感权限)
	 */
	@ApiField("permission_sum")
	private Long permissionSum;

	/**
	 * 使用的权限(APP在代码中调用的敏感权限)
	 */
	@ApiField("permission_used")
	private Long permissionUsed;

	/**
	 * 端权限检测报告-敏感权限使用总览DTO
	 */
	@ApiListField("permission_used_list")
	@ApiField("apmobile_app_permission_used_d_t_o")
	private List<ApmobileAppPermissionUsedDTO> permissionUsedList;

	/**
	 * 端权限检测报告-敏感权限使用总览DTO
	 */
	@ApiListField("permission_used_overview_list")
	@ApiField("apmobile_app_permission_used_overview_d_t_o")
	private List<ApmobileAppPermissionUsedOverviewDTO> permissionUsedOverviewList;

	public Long getPermissionApply() {
		return this.permissionApply;
	}
	public void setPermissionApply(Long permissionApply) {
		this.permissionApply = permissionApply;
	}

	public Long getPermissionOverApply() {
		return this.permissionOverApply;
	}
	public void setPermissionOverApply(Long permissionOverApply) {
		this.permissionOverApply = permissionOverApply;
	}

	public Long getPermissionOverUsed() {
		return this.permissionOverUsed;
	}
	public void setPermissionOverUsed(Long permissionOverUsed) {
		this.permissionOverUsed = permissionOverUsed;
	}

	public Long getPermissionSum() {
		return this.permissionSum;
	}
	public void setPermissionSum(Long permissionSum) {
		this.permissionSum = permissionSum;
	}

	public Long getPermissionUsed() {
		return this.permissionUsed;
	}
	public void setPermissionUsed(Long permissionUsed) {
		this.permissionUsed = permissionUsed;
	}

	public List<ApmobileAppPermissionUsedDTO> getPermissionUsedList() {
		return this.permissionUsedList;
	}
	public void setPermissionUsedList(List<ApmobileAppPermissionUsedDTO> permissionUsedList) {
		this.permissionUsedList = permissionUsedList;
	}

	public List<ApmobileAppPermissionUsedOverviewDTO> getPermissionUsedOverviewList() {
		return this.permissionUsedOverviewList;
	}
	public void setPermissionUsedOverviewList(List<ApmobileAppPermissionUsedOverviewDTO> permissionUsedOverviewList) {
		this.permissionUsedOverviewList = permissionUsedOverviewList;
	}

}
