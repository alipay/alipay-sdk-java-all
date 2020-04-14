package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.seller.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-21 17:57:43
 */
public class AlipayInsSceneSellerDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1647827229493512679L;

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
