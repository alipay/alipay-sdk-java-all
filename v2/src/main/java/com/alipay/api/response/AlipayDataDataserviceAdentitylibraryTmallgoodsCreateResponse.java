package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adentitylibrary.tmallgoods.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-25 11:02:51
 */
public class AlipayDataDataserviceAdentitylibraryTmallgoodsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3656321521622141693L;

	/** 
	 * 商品 ID
	 */
	@ApiField("goods_id")
	private String goodsId;

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsId( ) {
		return this.goodsId;
	}

}
