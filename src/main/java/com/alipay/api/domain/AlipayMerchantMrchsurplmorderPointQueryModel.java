package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * LinkedMall在下订单之前回调商家促活获取当前商户积分
 *
 * @author auto create
 * @since 1.0, 2022-04-19 18:43:58
 */
public class AlipayMerchantMrchsurplmorderPointQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8463363833815127951L;

	/**
	 * 业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 下单之前的扩展信息
	 */
	@ApiField("merchant_exts")
	private String merchantExts;

	/**
	 * sku id
	 */
	@ApiField("sku_id")
	private Long skuId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getMerchantExts() {
		return this.merchantExts;
	}
	public void setMerchantExts(String merchantExts) {
		this.merchantExts = merchantExts;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
