package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费者通知信息
 *
 * @author auto create
 * @since 1.0, 2023-02-23 16:30:44
 */
public class ConsumerNotifyIstd extends AlipayObject {

	private static final long serialVersionUID = 8275571375919641485L;

	/**
	 * 商品数量
	 */
	@ApiField("goods_count")
	private Long goodsCount;

	/**
	 * 商品缩略图url，支持格式：bmp、jpg、jpeg、png、gif
	 */
	@ApiField("goods_img")
	private String goodsImg;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商家电话
	 */
	@ApiField("merchant_mobile")
	private String merchantMobile;

	/**
	 * 商家名称，tiny_app_id和merchant_name不能同时为空
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商家小程序appid
	 */
	@ApiField("tiny_app_id")
	private String tinyAppId;

	/**
	 * 商家小程序的路径，建议为订单页面
	 */
	@ApiField("tiny_app_url")
	private String tinyAppUrl;

	public Long getGoodsCount() {
		return this.goodsCount;
	}
	public void setGoodsCount(Long goodsCount) {
		this.goodsCount = goodsCount;
	}

	public String getGoodsImg() {
		return this.goodsImg;
	}
	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getMerchantMobile() {
		return this.merchantMobile;
	}
	public void setMerchantMobile(String merchantMobile) {
		this.merchantMobile = merchantMobile;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getTinyAppId() {
		return this.tinyAppId;
	}
	public void setTinyAppId(String tinyAppId) {
		this.tinyAppId = tinyAppId;
	}

	public String getTinyAppUrl() {
		return this.tinyAppUrl;
	}
	public void setTinyAppUrl(String tinyAppUrl) {
		this.tinyAppUrl = tinyAppUrl;
	}

}
