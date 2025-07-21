package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.newhouse.project.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-19 10:41:35
 */
public class AlipayCommerceHousingNewhouseProjectSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4167861449673184113L;

	/** 
	 * 楼盘id
	 */
	@ApiField("estate_project_id")
	private String estateProjectId;

	public void setEstateProjectId(String estateProjectId) {
		this.estateProjectId = estateProjectId;
	}
	public String getEstateProjectId( ) {
		return this.estateProjectId;
	}

}
