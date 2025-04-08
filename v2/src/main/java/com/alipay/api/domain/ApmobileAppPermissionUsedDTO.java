package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 端权限检测报告-敏感权限使用总览DTO
 *
 * @author auto create
 * @since 1.0, 2023-07-03 11:35:48
 */
public class ApmobileAppPermissionUsedDTO extends AlipayObject {

	private static final long serialVersionUID = 8448863752167863527L;

	/**
	 * 端权限检测报告-隐私API调用按调用权限名称区分DTO
	 */
	@ApiListField("app_used_api_diff_api_desc_dtos")
	@ApiField("apmobile_app_used_api_diff_api_desc_d_t_o")
	private List<ApmobileAppUsedApiDiffApiDescDTO> appUsedApiDiffApiDescDtos;

	/**
	 * app自身调用权限次数
	 */
	@ApiField("app_used_num")
	private Long appUsedNum;

	/**
	 * 所调用权限是否申请（0：未申请，1已申请）
	 */
	@ApiField("is_applied")
	private Long isApplied;

	/**
	 * 权限是否被使用（0：未使用，1已使用）
	 */
	@ApiField("is_used")
	private Long isUsed;

	/**
	 * 权限码
	 */
	@ApiField("permission_code")
	private String permissionCode;

	/**
	 * 权限名称
	 */
	@ApiField("permission_name")
	private String permissionName;

	/**
	 * 端权限检测报告-调用某权限的SDK DTO
	 */
	@ApiListField("sdk_sensitive_used_list")
	@ApiField("apmobile_sdk_sensitive_used_d_t_o")
	private List<ApmobileSdkSensitiveUsedDTO> sdkSensitiveUsedList;

	public List<ApmobileAppUsedApiDiffApiDescDTO> getAppUsedApiDiffApiDescDtos() {
		return this.appUsedApiDiffApiDescDtos;
	}
	public void setAppUsedApiDiffApiDescDtos(List<ApmobileAppUsedApiDiffApiDescDTO> appUsedApiDiffApiDescDtos) {
		this.appUsedApiDiffApiDescDtos = appUsedApiDiffApiDescDtos;
	}

	public Long getAppUsedNum() {
		return this.appUsedNum;
	}
	public void setAppUsedNum(Long appUsedNum) {
		this.appUsedNum = appUsedNum;
	}

	public Long getIsApplied() {
		return this.isApplied;
	}
	public void setIsApplied(Long isApplied) {
		this.isApplied = isApplied;
	}

	public Long getIsUsed() {
		return this.isUsed;
	}
	public void setIsUsed(Long isUsed) {
		this.isUsed = isUsed;
	}

	public String getPermissionCode() {
		return this.permissionCode;
	}
	public void setPermissionCode(String permissionCode) {
		this.permissionCode = permissionCode;
	}

	public String getPermissionName() {
		return this.permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public List<ApmobileSdkSensitiveUsedDTO> getSdkSensitiveUsedList() {
		return this.sdkSensitiveUsedList;
	}
	public void setSdkSensitiveUsedList(List<ApmobileSdkSensitiveUsedDTO> sdkSensitiveUsedList) {
		this.sdkSensitiveUsedList = sdkSensitiveUsedList;
	}

}
