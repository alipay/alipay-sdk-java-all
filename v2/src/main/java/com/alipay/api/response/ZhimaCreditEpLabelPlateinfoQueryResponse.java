package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.label.plateinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-08 10:21:56
 */
public class ZhimaCreditEpLabelPlateinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5571137783533554316L;

	/** 
	 * 实力标牌高清图片+下载高清图+通过内部单号获取
	 */
	@ApiField("hd_pic_src")
	private String hdPicSrc;

	public void setHdPicSrc(String hdPicSrc) {
		this.hdPicSrc = hdPicSrc;
	}
	public String getHdPicSrc( ) {
		return this.hdPicSrc;
	}

}
