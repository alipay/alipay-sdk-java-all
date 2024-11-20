package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ResourcePackage;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.resourcepackage.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-10 20:01:39
 */
public class AlipayCloudCloudbaseEnvResourcepackageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3585524932862765336L;

	/** 
	 * 资源包列表
	 */
	@ApiListField("resource_packages")
	@ApiField("resource_package")
	private List<ResourcePackage> resourcePackages;

	public void setResourcePackages(List<ResourcePackage> resourcePackages) {
		this.resourcePackages = resourcePackages;
	}
	public List<ResourcePackage> getResourcePackages( ) {
		return this.resourcePackages;
	}

}
