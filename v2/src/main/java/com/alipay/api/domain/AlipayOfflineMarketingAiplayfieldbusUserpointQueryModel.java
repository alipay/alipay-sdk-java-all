package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集卡lm确认订单页积分查询
 *
 * @author auto create
 * @since 1.0, 2025-07-02 15:04:46
 */
public class AlipayOfflineMarketingAiplayfieldbusUserpointQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3515664616591594242L;

	/**
	 * 业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 额外信息
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
