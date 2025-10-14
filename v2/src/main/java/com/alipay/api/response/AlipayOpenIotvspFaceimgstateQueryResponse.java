package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.faceimgstate.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-08 14:31:01
 */
public class AlipayOpenIotvspFaceimgstateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8826493527422324613L;

	/** 
	 * true-已上传
false-未上传
	 */
	@ApiField("upload")
	private Boolean upload;

	public void setUpload(Boolean upload) {
		this.upload = upload;
	}
	public Boolean getUpload( ) {
		return this.upload;
	}

}
