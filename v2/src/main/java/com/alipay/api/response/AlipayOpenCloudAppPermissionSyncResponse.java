package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.cloud.app.permission.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:21:49
 */
public class AlipayOpenCloudAppPermissionSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1722846131477799671L;

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
