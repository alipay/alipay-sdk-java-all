package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券可用商品
 *
 * @author auto create
 * @since 1.0, 2024-06-24 21:42:14
 */
public class VoucherAvailableGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 7715129354725573429L;

	/**
	 * 可优惠商品编码，商家自定义商品编码。当用户支付时，交易中的商品编码和支付券配置的商品编码有任一匹配时，可以使用优惠券。
	 */
	@ApiListField("available_goods_sku_ids")
	@ApiField("string")
	private List<String> availableGoodsSkuIds;

	/**
	 * 不可核销商品编码，商家自定义商品编码。当用户支付时，交易中的商品编码和支付券配置的商品编码有任一匹配时，不可以使用优惠券。
	 */
	@ApiListField("exclude_goods_sku_ids")
	@ApiField("string")
	private List<String> excludeGoodsSkuIds;

	/**
	 * 商品描述信息。 用于券面展示，向用户介绍商品
	 */
	@ApiField("goods_description")
	private String goodsDescription;

	/**
	 * 商品详情，会展示在特定渠道(如服务市场团购业务插件的套餐明细)。
	 */
	@ApiField("goods_detail")
	private String goodsDetail;

	/**
	 * 商品详情图片列表，会展示在特定渠道(如服务市场团购业务插件的头图)
	 */
	@ApiListField("goods_detail_images")
	@ApiField("string")
	private List<String> goodsDetailImages;

	/**
	 * 商品详情富文本描述
	 */
	@ApiField("goods_detail_rich_description")
	private String goodsDetailRichDescription;

	/**
	 * 商品名称。
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 原价。说明：该字段可不填，填入商品名称goods_name则必填;
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

	public String getGoodsDetail() {
		return this.goodsDetail;
	}
	public void setGoodsDetail(String goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public List<String> getGoodsDetailImages() {
		return this.goodsDetailImages;
	}
	public void setGoodsDetailImages(List<String> goodsDetailImages) {
		this.goodsDetailImages = goodsDetailImages;
	}

	public String getGoodsDetailRichDescription() {
		return this.goodsDetailRichDescription;
	}
	public void setGoodsDetailRichDescription(String goodsDetailRichDescription) {
		this.goodsDetailRichDescription = goodsDetailRichDescription;
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
