package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 端权限检测报告-SDK调用权限DTO
 *
 * @author auto create
 * @since 1.0, 2023-06-26 13:59:24
 */
public class ApmobileSdkUsedDTO extends AlipayObject {

	private static final long serialVersionUID = 7631249967286169714L;

	/**
	 * 权限id
	 */
	@ApiField("permission_id")
	private String permissionId;

	/**
	 * 权限中文名
	 */
	@ApiField("permission_name")
	private String permissionName;

	/**
	 * SDK调用次数
	 */
	@ApiField("sdk_used_num")
	private Long sdkUsedNum;

	public String getPermissionId() {
		return this.permissionId;
	}
	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}

	public String getPermissionName() {
		return this.permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public Long getSdkUsedNum() {
		return this.sdkUsedNum;
	}
	public void setSdkUsedNum(Long sdkUsedNum) {
		this.sdkUsedNum = sdkUsedNum;
	}

}
