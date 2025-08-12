package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权限集模型
 *
 * @author auto create
 * @since 1.0, 2024-08-30 11:28:30
 */
public class PermissionSetVO extends AlipayObject {

	private static final long serialVersionUID = 3355793235486569268L;

	/**
	 * 接口列表
	 */
	@ApiListField("api_info_list")
	@ApiField("api_info_v_o")
	private List<ApiInfoVO> apiInfoList;

	/**
	 * 权限集编码
	 */
	@ApiField("permission_code")
	private String permissionCode;

	/**
	 * 服务商代运营基础
	 */
	@ApiField("permission_name")
	private String permissionName;

	public List<ApiInfoVO> getApiInfoList() {
		return this.apiInfoList;
	}
	public void setApiInfoList(List<ApiInfoVO> apiInfoList) {
		this.apiInfoList = apiInfoList;
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

}
