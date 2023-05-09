package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.cloud.app.permission.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:41:47
 */
public class AlipayOpenCloudAppPermissionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4156889836566854185L;

	/** 
	 * 拥有权限的接口列表
	 */
	@ApiListField("permission_api_list")
	@ApiField("string")
	private List<String> permissionApiList;

	public void setPermissionApiList(List<String> permissionApiList) {
		this.permissionApiList = permissionApiList;
	}
	public List<String> getPermissionApiList( ) {
		return this.permissionApiList;
	}

}
