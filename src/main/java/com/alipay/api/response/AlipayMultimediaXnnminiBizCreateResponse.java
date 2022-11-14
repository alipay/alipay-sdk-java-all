package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.multimedia.xnnmini.biz.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-03 21:41:34
 */
public class AlipayMultimediaXnnminiBizCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6553183179795652947L;

	/** 
	 * 创建业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

}
