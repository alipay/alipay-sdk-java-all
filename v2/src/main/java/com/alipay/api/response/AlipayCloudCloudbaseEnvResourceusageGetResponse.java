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
 * @since 1.0, 2024-11-22 14:41:28
 */
public class AlipayCloudCloudbaseEnvResourceusageGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1249891355893292338L;

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
