package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WorkspaceVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.innovate.cloudbaseenv.workspace.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:27:43
 */
public class TechriskInnovateCloudbaseenvWorkspaceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2428867275866329233L;

	/** 
	 * 环境变量集合
	 */
	@ApiListField("workspace_list")
	@ApiField("workspace_v_o")
	private List<WorkspaceVO> workspaceList;

	public void setWorkspaceList(List<WorkspaceVO> workspaceList) {
		this.workspaceList = workspaceList;
	}
	public List<WorkspaceVO> getWorkspaceList( ) {
		return this.workspaceList;
	}

}
