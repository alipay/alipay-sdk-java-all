package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CedsipeihuanCcomplex;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.openapi.v.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 06:27:40
 */
public class AlipaySecurityProdOpenapiVBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3341289179825552837L;

	/** 
	 * 区
	 */
	@ApiField("area_code")
	private String areaCode;

	/** 
	 * 可选
	 */
	@ApiField("cde")
	private String cde;

	/** 
	 * 特殊可选
	 */
	@ApiField("ds")
	private CedsipeihuanCcomplex ds;

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getAreaCode( ) {
		return this.areaCode;
	}

	public void setCde(String cde) {
		this.cde = cde;
	}
	public String getCde( ) {
		return this.cde;
	}

	public void setDs(CedsipeihuanCcomplex ds) {
		this.ds = ds;
	}
	public CedsipeihuanCcomplex getDs( ) {
		return this.ds;
	}

}
