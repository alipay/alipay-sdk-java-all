package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.rentroom.area.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-30 11:17:23
 */
public class AlipayOpenAppRentroomAreaCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6697673158168492343L;

	/** 
	 * 平台生成的小区ID
	 */
	@ApiField("area_id")
	private String areaId;

	/** 
	 * 小区信息提报时商户传入的小区ID，不做加工直接返回。
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
