package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.rentroom.area.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-24 07:42:22
 */
public class AlipayOpenAppRentroomAreaModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5597444491941572119L;

	/** 
	 * 小区ID
	 */
	@ApiField("area_id")
	private String areaId;

	/** 
	 * 商户侧自定义小区ID
	 */
	@ApiField("out_area_id")
	private String outAreaId;

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getAreaId( ) {
		return this.areaId;
	}

	public void setOutAreaId(String outAreaId) {
		this.outAreaId = outAreaId;
	}
	public String getOutAreaId( ) {
		return this.outAreaId;
	}

}
