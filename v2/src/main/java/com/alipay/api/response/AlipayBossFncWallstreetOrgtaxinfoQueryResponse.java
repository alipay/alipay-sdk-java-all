package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OrgTaxInfoOpenApiDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.wallstreet.orgtaxinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-07 11:07:02
 */
public class AlipayBossFncWallstreetOrgtaxinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5533874843434337293L;

	/** 
	 * ou税务信息
	 */
	@ApiField("result_set")
	private OrgTaxInfoOpenApiDto resultSet;

	public void setResultSet(OrgTaxInfoOpenApiDto resultSet) {
		this.resultSet = resultSet;
	}
	public OrgTaxInfoOpenApiDto getResultSet( ) {
		return this.resultSet;
	}

}
