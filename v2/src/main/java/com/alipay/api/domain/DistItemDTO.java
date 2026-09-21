package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-11 23:27:50
 */
public class DistItemDTO extends AlipayObject {

	private static final long serialVersionUID = 6536379314453723855L;

	/**
	 * 渠道商品ID
	 */
	@ApiField("channel_item_id")
	private String channelItemId;

	/**
	 * 渠道商品图片
	 */
	@ApiField("channel_item_pic_url")
	private String channelItemPicUrl;

	/**
	 * 渠道商品价格，单位元
	 */
	@ApiField("channel_item_price")
	private String channelItemPrice;

	/**
	 * 渠道商品标题
	 */
	@ApiField("channel_item_title")
	private String channelItemTitle;

	/**
	 * 商品数量
	 */
	@ApiField("item_cnt")
	private Long itemCnt;

	/**
	 * 原始商品押金，单位元
	 */
	@ApiField("item_deposit_price")
	private String itemDepositPrice;

	/**
	 * 商品库itemId
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商户侧商品Id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商户侧SkuId
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 商品库skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getChannelItemId() {
		return this.channelItemId;
	}
	public void setChannelItemId(String channelItemId) {
		this.channelItemId = channelItemId;
	}

	public String getChannelItemPicUrl() {
		return this.channelItemPicUrl;
	}
	public void setChannelItemPicUrl(String channelItemPicUrl) {
		this.channelItemPicUrl = channelItemPicUrl;
	}

	public String getChannelItemPrice() {
		return this.channelItemPrice;
	}
	public void setChannelItemPrice(String channelItemPrice) {
		this.channelItemPrice = channelItemPrice;
	}

	public String getChannelItemTitle() {
		return this.channelItemTitle;
	}
	public void setChannelItemTitle(String channelItemTitle) {
		this.channelItemTitle = channelItemTitle;
	}

	public Long getItemCnt() {
		return this.itemCnt;
	}
	public void setItemCnt(Long itemCnt) {
		this.itemCnt = itemCnt;
	}

	public String getItemDepositPrice() {
		return this.itemDepositPrice;
	}
	public void setItemDepositPrice(String itemDepositPrice) {
		this.itemDepositPrice = itemDepositPrice;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
