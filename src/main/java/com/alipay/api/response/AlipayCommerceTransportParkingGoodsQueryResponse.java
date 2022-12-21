package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ParkingGoodsDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.parking.goods.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 13:37:58
 */
public class AlipayCommerceTransportParkingGoodsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1673284522546845376L;

	/** 
	 * 商品列表
	 */
	@ApiField("parking_goods_detail")
	private ParkingGoodsDetail parkingGoodsDetail;

	public void setParkingGoodsDetail(ParkingGoodsDetail parkingGoodsDetail) {
		this.parkingGoodsDetail = parkingGoodsDetail;
	}
	public ParkingGoodsDetail getParkingGoodsDetail( ) {
		return this.parkingGoodsDetail;
	}

}
