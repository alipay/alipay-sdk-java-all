package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ResourcePackageInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.open.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-22 21:06:41
 */
public class AlipayCloudCloudbaseResourcepackageOpenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2123828513857245944L;

	/** 
	 * 资源包列表信息
	 */
	@ApiListField("resource_packages")
	@ApiField("resource_package_info")
	private List<ResourcePackageInfo> resourcePackages;

	public void setResourcePackages(List<ResourcePackageInfo> resourcePackages) {
		this.resourcePackages = resourcePackages;
	}
	public List<ResourcePackageInfo> getResourcePackages( ) {
		return this.resourcePackages;
	}

}
