package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.multimedia.xnnmini.version.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 09:36:41
 */
public class AlipayMultimediaXnnminiVersionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4856477837222879691L;

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
