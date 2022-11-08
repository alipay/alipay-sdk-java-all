package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 重力层信息
 *
 * @author auto create
 * @since 1.0, 2022-01-17 17:30:39
 */
public class WeightFloor extends AlipayObject {

	private static final long serialVersionUID = 6619296161442773266L;

	/**
	 * 层号
	 */
	@ApiField("floor_id")
	private String floorId;

	/**
	 * 重力层商品位置信息列表
	 */
	@ApiListField("goods_list")
	@ApiField("goods_pos")
	private List<GoodsPos> goodsList;

	public String getFloorId() {
		return this.floorId;
	}
	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}

	public List<GoodsPos> getGoodsList() {
		return this.goodsList;
	}
	public void setGoodsList(List<GoodsPos> goodsList) {
		this.goodsList = goodsList;
	}

}
