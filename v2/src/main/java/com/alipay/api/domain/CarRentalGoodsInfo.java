package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租车商品信息
 *
 * @author auto create
 * @since 1.0, 2021-05-25 20:32:44
 */
public class CarRentalGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 8158995462874472162L;

	/**
	 * 商品扩展字段
	 */
	@ApiListField("goods_extra_info")
	@ApiField("extra_info")
	private List<ExtraInfo> goodsExtraInfo;

	/**
	 * 商品列表信息
	 */
	@ApiListField("goods_list")
	@ApiField("car_rental_goods")
	private List<CarRentalGoods> goodsList;

	public List<ExtraInfo> getGoodsExtraInfo() {
		return this.goodsExtraInfo;
	}
	public void setGoodsExtraInfo(List<ExtraInfo> goodsExtraInfo) {
		this.goodsExtraInfo = goodsExtraInfo;
	}

	public List<CarRentalGoods> getGoodsList() {
		return this.goodsList;
	}
	public void setGoodsList(List<CarRentalGoods> goodsList) {
		this.goodsList = goodsList;
	}

}
