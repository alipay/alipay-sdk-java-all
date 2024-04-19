package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交易订单中，对应的商品列表中有对应的环保类型，能量发放结果
 *
 * @author auto create
 * @since 1.0, 2022-11-18 13:39:52
 */
public class OrderGoodDTO extends AlipayObject {

	private static final long serialVersionUID = 8414535384268165635L;

	/**
	 * 对应订单有环保类型时，能量发放结果
	 */
	@ApiListField("environmental_list")
	@ApiField("environmental_d_t_o")
	private List<EnvironmentalDTO> environmentalList;

	/**
	 * 商品码，根据之前数据回传的中有环保类型的商品码
	 */
	@ApiField("goods_id")
	private String goodsId;

	public List<EnvironmentalDTO> getEnvironmentalList() {
		return this.environmentalList;
	}
	public void setEnvironmentalList(List<EnvironmentalDTO> environmentalList) {
		this.environmentalList = environmentalList;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

}
