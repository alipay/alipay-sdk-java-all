package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WorkspaceResourceUsage;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.resourceusage.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 22:46:41
 */
public class AlipayCloudCloudbaseEnvResourceusageGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3442139415839473642L;

	/** 
	 * 资源包用量列表
	 */
	@ApiListField("workspace_resource_usages")
	@ApiField("workspace_resource_usage")
	private List<WorkspaceResourceUsage> workspaceResourceUsages;

	public void setWorkspaceResourceUsages(List<WorkspaceResourceUsage> workspaceResourceUsages) {
		this.workspaceResourceUsages = workspaceResourceUsages;
	}
	public List<WorkspaceResourceUsage> getWorkspaceResourceUsages( ) {
		return this.workspaceResourceUsages;
	}

}
