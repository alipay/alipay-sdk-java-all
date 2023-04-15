package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.cloud.app.permission.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-06 16:56:41
 */
public class AlipayOpenCloudAppPermissionSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3799413386296419959L;

	/** 
	 * 接口权限列表
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
