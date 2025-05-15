package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.faceimgstate.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-18 15:56:59
 */
public class AlipayOpenIotvspFaceimgstateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6581671859328272361L;

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
