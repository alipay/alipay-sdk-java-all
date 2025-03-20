package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ResourceStatus;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.resourcestatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:45
 */
public class AlipayCloudCloudbaseEnvResourcestatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4633885731234388746L;

	/** 
	 * 资源状态列表
	 */
	@ApiListField("resources")
	@ApiField("resource_status")
	private List<ResourceStatus> resources;

	public void setResources(List<ResourceStatus> resources) {
		this.resources = resources;
	}
	public List<ResourceStatus> getResources( ) {
		return this.resources;
	}

}
