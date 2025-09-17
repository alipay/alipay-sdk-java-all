package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.newhouse.project.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 11:07:37
 */
public class AlipayCommerceHousingNewhouseProjectSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 8619437829531219231L;

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
