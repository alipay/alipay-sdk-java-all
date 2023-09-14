package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.parking.goods.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:35:42
 */
public class AlipayCommerceTransportParkingGoodsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6391767391326935523L;

	/** 
	 * 支付宝商品ID列表
	 */
	@ApiField("goods_id")
	private String goodsId;

	/** 
	 * isv内部产生商品ID
	 */
	@ApiField("out_id")
	private String outId;

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsId( ) {
		return this.goodsId;
	}

	public void setOutId(String outId) {
		this.outId = outId;
	}
	public String getOutId( ) {
		return this.outId;
	}

}
