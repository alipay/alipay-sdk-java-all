package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家促活LinkedMall订单预下单
 *
 * @author auto create
 * @since 1.0, 2022-04-19 19:54:16
 */
public class AlipayMerchantMrchsurplmorderPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 6168995766188614963L;

	/**
	 * LinkedMall入驻的业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * LinkedMall的商品ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 订单扩展属性信息
	 */
	@ApiField("merchant_exts")
	private String merchantExts;

	/**
	 * LinkedMall的skuId
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
