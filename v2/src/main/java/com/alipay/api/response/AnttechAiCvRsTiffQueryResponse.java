package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.rs.tiff.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-28 14:41:56
 */
public class AnttechAiCvRsTiffQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3532983295856666355L;

	/** 
	 * tiff瓦片图像的base64结果
	 */
	@ApiField("tile_result")
	private String tileResult;

	public void setTileResult(String tileResult) {
		this.tileResult = tileResult;
	}
	public String getTileResult( ) {
		return this.tileResult;
	}

}
