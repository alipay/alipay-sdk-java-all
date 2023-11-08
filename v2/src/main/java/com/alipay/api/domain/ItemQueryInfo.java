package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品推荐查询结果
 *
 * @author auto create
 * @since 1.0, 2023-03-23 16:52:02
 */
public class ItemQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 4355187997667876159L;

	/**
	 * 商品品牌
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 商品跳转url
	 */
	@ApiField("buy_url")
	private String buyUrl;

	/**
	 * 币种（默认为人名币）
	 */
	@ApiField("currency_type")
	private String currencyType;

	/**
	 * 商品唯一id
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 上架时间
	 */
	@ApiField("lanch_time")
	private Date lanchTime;

	/**
	 * 计价方式（/天；/月）
	 */
	@ApiField("monetary_unit")
	private String monetaryUnit;

	/**
	 * 商品现价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品图片
	 */
	@ApiListField("promo_pic_url_list")
	@ApiField("string")
	private List<String> promoPicUrlList;

	/**
	 * 商品推荐分数
	 */
	@ApiField("score")
	private String score;

	/**
	 * 商品标签
	 */
	@ApiField("tags")
	private String tags;

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBuyUrl() {
		return this.buyUrl;
	}
	public void setBuyUrl(String buyUrl) {
		this.buyUrl = buyUrl;
	}

	public String getCurrencyType() {
		return this.currencyType;
	}
	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Date getLanchTime() {
		return this.lanchTime;
	}
	public void setLanchTime(Date lanchTime) {
		this.lanchTime = lanchTime;
	}

	public String getMonetaryUnit() {
		return this.monetaryUnit;
	}
	public void setMonetaryUnit(String monetaryUnit) {
		this.monetaryUnit = monetaryUnit;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public List<String> getPromoPicUrlList() {
		return this.promoPicUrlList;
	}
	public void setPromoPicUrlList(List<String> promoPicUrlList) {
		this.promoPicUrlList = promoPicUrlList;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	public String getTags() {
		return this.tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}

}
