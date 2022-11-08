package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 *  小部件商品信息模型
 *
 * @author auto create
 * @since 1.0, 2022-09-15 10:41:35
 */
public class WidgetGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 3839893373743832821L;

	/**
	 * 该商品的小程序购买链接
	 */
	@ApiField("buying_url")
	private String buyingUrl;

	/**
	 * 商品辅助说明文案
	 */
	@ApiField("goods_comment")
	private String goodsComment;

	/**
	 * 商品说明标签（如-随心退）
	 */
	@ApiField("goods_description_label")
	private String goodsDescriptionLabel;

	/**
	 * 商品的唯一标识，同一个小部件下，该标识唯一，请开发者自行保证
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 营销标签（如-限量特价），每个商品仅支持一个营销标签
	 */
	@ApiField("goods_label")
	private String goodsLabel;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品所属品类
	 */
	@ApiField("goods_type")
	private String goodsType;

	/**
	 * 商品主图片地址
	 */
	@ApiField("main_pic_url")
	private String mainPicUrl;

	/**
	 * 商品排序，自然整数, 数字越小越靠前
	 */
	@ApiField("order_number")
	private Long orderNumber;

	/**
	 * 单位"元"的商品原价，传入数字，不需要传入"元"
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 投放城市的列表，详见https://www.mca.gov.cn/article/sj/xzqh/2020/2020/202007170301.html，有多个用英文,分隔。如果没有限制则不传入
	 */
	@ApiField("publish_cities")
	private String publishCities;

	/**
	 * 剩余库存
	 */
	@ApiField("remaining_quantity")
	private Long remainingQuantity;

	/**
	 * 单位"元"的售价，传入数字，不需要传入"元"
	 */
	@ApiField("sell_price")
	private String sellPrice;

	/**
	 * 已售数量
	 */
	@ApiField("sold_quantity")
	private Long soldQuantity;

	/**
	 * 总库存量
	 */
	@ApiField("total_quantity")
	private Long totalQuantity;

	public String getBuyingUrl() {
		return this.buyingUrl;
	}
	public void setBuyingUrl(String buyingUrl) {
		this.buyingUrl = buyingUrl;
	}

	public String getGoodsComment() {
		return this.goodsComment;
	}
	public void setGoodsComment(String goodsComment) {
		this.goodsComment = goodsComment;
	}

	public String getGoodsDescriptionLabel() {
		return this.goodsDescriptionLabel;
	}
	public void setGoodsDescriptionLabel(String goodsDescriptionLabel) {
		this.goodsDescriptionLabel = goodsDescriptionLabel;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsLabel() {
		return this.goodsLabel;
	}
	public void setGoodsLabel(String goodsLabel) {
		this.goodsLabel = goodsLabel;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsType() {
		return this.goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getMainPicUrl() {
		return this.mainPicUrl;
	}
	public void setMainPicUrl(String mainPicUrl) {
		this.mainPicUrl = mainPicUrl;
	}

	public Long getOrderNumber() {
		return this.orderNumber;
	}
	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getPublishCities() {
		return this.publishCities;
	}
	public void setPublishCities(String publishCities) {
		this.publishCities = publishCities;
	}

	public Long getRemainingQuantity() {
		return this.remainingQuantity;
	}
	public void setRemainingQuantity(Long remainingQuantity) {
		this.remainingQuantity = remainingQuantity;
	}

	public String getSellPrice() {
		return this.sellPrice;
	}
	public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Long getSoldQuantity() {
		return this.soldQuantity;
	}
	public void setSoldQuantity(Long soldQuantity) {
		this.soldQuantity = soldQuantity;
	}

	public Long getTotalQuantity() {
		return this.totalQuantity;
	}
	public void setTotalQuantity(Long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

}
