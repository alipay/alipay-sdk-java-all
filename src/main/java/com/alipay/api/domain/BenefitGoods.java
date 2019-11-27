package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益商品
 *
 * @author auto create
 * @since 1.0, 2018-12-27 11:02:55
 */
public class BenefitGoods extends AlipayObject {

	private static final long serialVersionUID = 4415336292257932998L;

	/**
	 * 权益商品描述
	 */
	@ApiField("goods_desc")
	private String goodsDesc;

	/**
	 * 权益商品副标题
	 */
	@ApiField("goods_sub_title")
	private String goodsSubTitle;

	/**
	 * 权益商品标题
	 */
	@ApiField("goods_title")
	private String goodsTitle;

	/**
	 * 权益商品id
	 */
	@ApiField("out_goods_id")
	private String outGoodsId;

	/**
	 * 权益商品sku_id
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 权益sku描述
	 */
	@ApiField("sku_desc")
	private String skuDesc;

	/**
	 * 花呗便利店月卡
	 */
	@ApiField("sku_sub_title")
	private String skuSubTitle;

	/**
	 * 权益sku标题
	 */
	@ApiField("sku_title")
	private String skuTitle;

	public String getGoodsDesc() {
		return this.goodsDesc;
	}
	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public String getGoodsSubTitle() {
		return this.goodsSubTitle;
	}
	public void setGoodsSubTitle(String goodsSubTitle) {
		this.goodsSubTitle = goodsSubTitle;
	}

	public String getGoodsTitle() {
		return this.goodsTitle;
	}
	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}

	public String getOutGoodsId() {
		return this.outGoodsId;
	}
	public void setOutGoodsId(String outGoodsId) {
		this.outGoodsId = outGoodsId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getSkuDesc() {
		return this.skuDesc;
	}
	public void setSkuDesc(String skuDesc) {
		this.skuDesc = skuDesc;
	}

	public String getSkuSubTitle() {
		return this.skuSubTitle;
	}
	public void setSkuSubTitle(String skuSubTitle) {
		this.skuSubTitle = skuSubTitle;
	}

	public String getSkuTitle() {
		return this.skuTitle;
	}
	public void setSkuTitle(String skuTitle) {
		this.skuTitle = skuTitle;
	}

}
