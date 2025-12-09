package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.label.plateinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-04 11:24:04
 */
public class ZhimaCreditEpLabelPlateinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3813712655337986656L;

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
