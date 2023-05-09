package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.isvhotel.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 22:31:57
 */
public class AlipayOpenIotmbsIsvhotelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3451466163445313758L;

	/** 
	 * project_id+需要编辑的酒店id
	 */
	@ApiField("project_id")
	private String projectId;

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectId( ) {
		return this.projectId;
	}

}
