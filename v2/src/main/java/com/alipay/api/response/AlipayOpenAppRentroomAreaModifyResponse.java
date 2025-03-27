package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.rentroom.area.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-30 11:22:22
 */
public class AlipayOpenAppRentroomAreaModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4186333753424395427L;

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
