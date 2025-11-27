package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集卡lm下单扣卡
 *
 * @author auto create
 * @since 1.0, 2025-07-02 15:04:47
 */
public class AlipayOfflineMarketingAiplayfieldbusUserpointPayModel extends AlipayObject {

	private static final long serialVersionUID = 7793424931389146298L;

	/**
	 * 客户业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 扣减时间
	 */
	@ApiField("deducted_date")
	private String deductedDate;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * lm订单id
	 */
	@ApiField("lm_order_id")
	private String lmOrderId;

	/**
	 * 额外
	 */
	@ApiField("merchant_exts")
	private String merchantExts;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 库存单元id
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getDeductedDate() {
		return this.deductedDate;
	}
	public void setDeductedDate(String deductedDate) {
		this.deductedDate = deductedDate;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getLmOrderId() {
		return this.lmOrderId;
	}
	public void setLmOrderId(String lmOrderId) {
		this.lmOrderId = lmOrderId;
	}

	public String getMerchantExts() {
		return this.merchantExts;
	}
	public void setMerchantExts(String merchantExts) {
		this.merchantExts = merchantExts;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
