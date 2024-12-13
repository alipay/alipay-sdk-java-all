package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ResourcePackageInstance;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-21 10:11:43
 */
public class AlipayCloudCloudbaseResourcepackageInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1295518893635353986L;

	/** 
	 * 资源包实例详情列表
	 */
	@ApiListField("instances")
	@ApiField("resource_package_instance")
	private List<ResourcePackageInstance> instances;

	public void setInstances(List<ResourcePackageInstance> instances) {
		this.instances = instances;
	}
	public List<ResourcePackageInstance> getInstances( ) {
		return this.instances;
	}

}
