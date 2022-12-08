package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.multimedia.xnnmini.version.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 11:36:44
 */
public class AlipayMultimediaXnnminiVersionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6688187362861365982L;

	/** 
	 * 版本信息标识id
	 */
	@ApiField("version_id")
	private String versionId;

	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}
	public String getVersionId( ) {
		return this.versionId;
	}

}
