package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 端权限检测报告-隐私API调用按调用权限名称区分DTO
 *
 * @author auto create
 * @since 1.0, 2023-06-29 18:07:20
 */
public class ApmobileAppUsedApiDiffApiDescDTO extends AlipayObject {

	private static final long serialVersionUID = 8132959133315863381L;

	/**
	 * 端权限检测报告-隐私API调用点位 DTO
	 */
	@ApiListField("app_used_api_dtos")
	@ApiField("apmobile_app_used_api_d_t_o")
	private List<ApmobileAppUsedApiDTO> appUsedApiDtos;

	/**
	 * 权限使用数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 权限名称
	 */
	@ApiField("permission_name")
	private String permissionName;

	public List<ApmobileAppUsedApiDTO> getAppUsedApiDtos() {
		return this.appUsedApiDtos;
	}
	public void setAppUsedApiDtos(List<ApmobileAppUsedApiDTO> appUsedApiDtos) {
		this.appUsedApiDtos = appUsedApiDtos;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getPermissionName() {
		return this.permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

}
