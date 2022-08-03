package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券可用商品
 *
 * @author auto create
 * @since 1.0, 2022-07-28 14:17:16
 */
public class VoucherAvailableGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 6576568481486553263L;

	/**
	 * 可优惠商品编码，商家自定义商品编码。当用户支付时，交易中的商品编码和支付券配置的商品编码有任一匹配时，可以使用优惠券。
	 */
	@ApiListField("available_goods_sku_ids")
	@ApiField("string")
	private List<String> availableGoodsSkuIds;

	/**
	 * 不可核销商品编码，商家自定义商品编码。当用户支付时，交易中的商品编码和支付券配置的商品编码有任一匹配时，不可以使用优惠券。 限制: 1、available_goods与unavailable_goods_ids只能二选一或者同时为空
	 */
	@ApiListField("exclude_goods_sku_ids")
	@ApiField("string")
	private List<String> excludeGoodsSkuIds;

	/**
	 * 商品描述
	 */
	@ApiField("goods_description")
	private String goodsDescription;

	/**
	 * 商品名称。
限制:
1.兑换券、特价券必填
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品原价
限制：
特价券必填
	 */
	@ApiField("origin_amount")
	private String originAmount;

	public List<String> getAvailableGoodsSkuIds() {
		return this.availableGoodsSkuIds;
	}
	public void setAvailableGoodsSkuIds(List<String> availableGoodsSkuIds) {
		this.availableGoodsSkuIds = availableGoodsSkuIds;
	}

	public List<String> getExcludeGoodsSkuIds() {
		return this.excludeGoodsSkuIds;
	}
	public void setExcludeGoodsSkuIds(List<String> excludeGoodsSkuIds) {
		this.excludeGoodsSkuIds = excludeGoodsSkuIds;
	}

	public String getGoodsDescription() {
		return this.goodsDescription;
	}
	public void setGoodsDescription(String goodsDescription) {
		this.goodsDescription = goodsDescription;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getOriginAmount() {
		return this.originAmount;
	}
	public void setOriginAmount(String originAmount) {
		this.originAmount = originAmount;
	}

}
