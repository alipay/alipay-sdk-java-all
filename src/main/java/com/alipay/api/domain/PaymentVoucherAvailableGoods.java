package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付券指定可核销商品
 *
 * @author auto create
 * @since 1.0, 2022-02-23 14:18:08
 */
public class PaymentVoucherAvailableGoods extends AlipayObject {

	private static final long serialVersionUID = 5344846251578397691L;

	/**
	 * 商品描述信息。 用于券面展示，向用户介绍商品
	 */
	@ApiField("goods_description")
	private String goodsDescription;

	/**
	 * 可优惠商品编码，商家自定义商品编码。当用户支付时，交易中的商品编码和支付券配置的商品编码有任一匹配时，可以使用优惠券。
	 */
	@ApiListField("goods_ids")
	@ApiField("string")
	private List<String> goodsIds;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	public String getGoodsDescription() {
		return this.goodsDescription;
	}
	public void setGoodsDescription(String goodsDescription) {
		this.goodsDescription = goodsDescription;
	}

	public List<String> getGoodsIds() {
		return this.goodsIds;
	}
	public void setGoodsIds(List<String> goodsIds) {
		this.goodsIds = goodsIds;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

}
