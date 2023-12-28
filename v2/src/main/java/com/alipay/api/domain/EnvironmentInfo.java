package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品列表中有对应的环保类型时，需要返回
 *
 * @author auto create
 * @since 1.0, 2022-11-18 13:39:41
 */
public class EnvironmentInfo extends AlipayObject {

	private static final long serialVersionUID = 4227631348754857992L;

	/**
	 * 对应商品有环保类型时，需要返回;一个商品可能有多个环保类型
	 */
	@ApiListField("environmental_list")
	@ApiField("environmental")
	private List<Environmental> environmentalList;

	/**
	 * 商品码，根据入参时的商品码进行返回; (其中临期商品一笔订单只返回一个环保类型对应其中一个商品）
	 */
	@ApiField("goods_id")
	private String goodsId;

	public List<Environmental> getEnvironmentalList() {
		return this.environmentalList;
	}
	public void setEnvironmentalList(List<Environmental> environmentalList) {
		this.environmentalList = environmentalList;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

}
