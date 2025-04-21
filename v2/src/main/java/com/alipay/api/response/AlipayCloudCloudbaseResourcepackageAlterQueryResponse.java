package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ResourcePackageInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.alter.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-22 21:06:41
 */
public class AlipayCloudCloudbaseResourcepackageAlterQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5811949348893628436L;

	/** 
	 * 当前实例规格编码
	 */
	@ApiField("current_spec_code")
	private String currentSpecCode;

	/** 
	 * 资源包列表
	 */
	@ApiListField("resource_pkgs")
	@ApiField("resource_package_info")
	private List<ResourcePackageInfo> resourcePkgs;

	public void setCurrentSpecCode(String currentSpecCode) {
		this.currentSpecCode = currentSpecCode;
	}
	public String getCurrentSpecCode( ) {
		return this.currentSpecCode;
	}

	public void setResourcePkgs(List<ResourcePackageInfo> resourcePkgs) {
		this.resourcePkgs = resourcePkgs;
	}
	public List<ResourcePackageInfo> getResourcePkgs( ) {
		return this.resourcePkgs;
	}

}
