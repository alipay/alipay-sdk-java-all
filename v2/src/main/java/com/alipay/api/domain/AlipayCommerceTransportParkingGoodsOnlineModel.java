package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝车位运营商品上下架
 *
 * @author auto create
 * @since 1.0, 2020-03-19 11:55:36
 */
public class AlipayCommerceTransportParkingGoodsOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 6827428367887418441L;

	/**
	 * 支付宝商品唯一ID
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 操作类型：put-上架，pull-下架
	 */
	@ApiField("op_type")
	private String opType;

	/**
	 * isv内部产生商品ID(goods_id和out_id不能同时为空)
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

	public String getOpType() {
		return this.opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
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
