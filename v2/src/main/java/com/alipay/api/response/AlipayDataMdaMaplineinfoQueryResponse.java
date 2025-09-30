package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.maplineinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 11:02:36
 */
public class AlipayDataMdaMaplineinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4622286182138658683L;

	/** 
	 * 火炬传递飞线图
	 */
	@ApiField("line_map")
	private String lineMap;

	public void setLineMap(String lineMap) {
		this.lineMap = lineMap;
	}
	public String getLineMap( ) {
		return this.lineMap;
	}

}
