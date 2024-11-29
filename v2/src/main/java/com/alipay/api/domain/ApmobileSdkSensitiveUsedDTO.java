package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 *  端权限检测报告-调用某权限的SDK DTO
 *
 * @author auto create
 * @since 1.0, 2023-06-29 15:58:57
 */
public class ApmobileSdkSensitiveUsedDTO extends AlipayObject {

	private static final long serialVersionUID = 8489473478775666833L;

	/**
	 * 端权限检测报告-SDK隐私API调用点位 DTO
	 */
	@ApiListField("app_used_api_dtos")
	@ApiField("apmobile_app_used_api_d_t_o")
	private List<ApmobileAppUsedApiDTO> appUsedApiDtos;

	/**
	 * 权限id
	 */
	@ApiField("permission_id")
	private String permissionId;

	/**
	 * sdk名称
	 */
	@ApiField("sdk_name")
	private String sdkName;

	/**
	 * SDK调用权限次数
	 */
	@ApiField("sdk_used_num")
	private Long sdkUsedNum;

	public List<ApmobileAppUsedApiDTO> getAppUsedApiDtos() {
		return this.appUsedApiDtos;
	}
	public void setAppUsedApiDtos(List<ApmobileAppUsedApiDTO> appUsedApiDtos) {
		this.appUsedApiDtos = appUsedApiDtos;
	}

	public String getPermissionId() {
		return this.permissionId;
	}
	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}

	public String getSdkName() {
		return this.sdkName;
	}
	public void setSdkName(String sdkName) {
		this.sdkName = sdkName;
	}

	public Long getSdkUsedNum() {
		return this.sdkUsedNum;
	}
	public void setSdkUsedNum(Long sdkUsedNum) {
		this.sdkUsedNum = sdkUsedNum;
	}

}
