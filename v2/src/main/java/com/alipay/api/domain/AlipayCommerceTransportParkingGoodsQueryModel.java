package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝车位运营商品查询
 *
 * @author auto create
 * @since 1.0, 2020-03-19 11:56:21
 */
public class AlipayCommerceTransportParkingGoodsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2271159852984611246L;

	/**
	 * isv内部产生商品ID(goods_id和out_id不能同时为空)
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * isv内部产生商品ID
	 */
	@ApiField("out_id")
	private String outId;

	/**
	 * 支付宝返回停车场ID
	 */
	@ApiField("parking_id")
	private String parkingId;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getOutId() {
		return this.outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

}
