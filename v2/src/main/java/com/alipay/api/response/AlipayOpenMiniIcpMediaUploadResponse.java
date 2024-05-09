package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.icp.media.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 21:50:59
 */
public class AlipayOpenMiniIcpMediaUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5476342548932963267L;

	/** 
	 * 申请备案时填写的文件材料凭证ID
	 */
	@ApiField("media_id")
	private String mediaId;

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public String getMediaId( ) {
		return this.mediaId;
	}

}
