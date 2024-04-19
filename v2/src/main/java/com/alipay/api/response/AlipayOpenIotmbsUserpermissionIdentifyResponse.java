package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.userpermission.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:06:42
 */
public class AlipayOpenIotmbsUserpermissionIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8811924958972892996L;

	/** 
	 * 返回鉴权结果
	 */
	@ApiField("permit")
	private String permit;

	/** 
	 * 核身平台提供的用户vid
	 */
	@ApiField("vid")
	private String vid;

	public void setPermit(String permit) {
		this.permit = permit;
	}
	public String getPermit( ) {
		return this.permit;
	}

	public void setVid(String vid) {
		this.vid = vid;
	}
	public String getVid( ) {
		return this.vid;
	}

}
