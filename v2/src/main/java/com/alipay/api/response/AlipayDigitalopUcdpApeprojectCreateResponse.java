package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apeproject.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 16:36:49
 */
public class AlipayDigitalopUcdpApeprojectCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5539827665139576234L;

	/** 
	 * 新创建的projectID
	 */
	@ApiField("project_id")
	private Long projectId;

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public Long getProjectId( ) {
		return this.projectId;
	}

}
