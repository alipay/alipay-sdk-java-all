package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.seller.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 15:34:31
 */
public class AlipayInsSceneSellerDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6754786157374383346L;

	/** 
	 * 返回数据结果
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
