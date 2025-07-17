package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, 2021-05-12 21:08:45
 */
public class CateringGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 7645472786981334628L;

	/**
	 * 商品扩展字段，商品信息扩展，key：good_ classification，value：drink
	 */
	@ApiListField("goods_extra_info")
	@ApiField("extra_info")
	private List<ExtraInfo> goodsExtraInfo;

	/**
	 * 商品列表信息
	 */
	@ApiListField("goods_list")
	@ApiField("goods")
	private List<Goods> goodsList;

	public List<ExtraInfo> getGoodsExtraInfo() {
		return this.goodsExtraInfo;
	}
	public void setGoodsExtraInfo(List<ExtraInfo> goodsExtraInfo) {
		this.goodsExtraInfo = goodsExtraInfo;
	}

	public List<Goods> getGoodsList() {
		return this.goodsList;
	}
	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}

}
