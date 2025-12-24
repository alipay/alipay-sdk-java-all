package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅初始化返回数据
 *
 * @author auto create
 * @since 1.0, 2025-11-19 16:47:21
 */
public class SubscribeInitiateApiResponse extends AlipayObject {

	private static final long serialVersionUID = 3724724332665899327L;

	/**
	 * 订阅链接对应二维码图片链接
	 */
	@ApiField("qr_code_image_url")
	private String qrCodeImageUrl;

	/**
	 * 订阅付费凭证
	 */
	@ApiField("subscribe_token")
	private String subscribeToken;

	/**
	 * 订阅付费地址
	 */
	@ApiField("subscribe_url")
	private String subscribeUrl;

	/**
	 * 订阅套餐明细
	 */
	@ApiField("subscription_packages")
	private SubscriptionPackageDetailDTO subscriptionPackages;

	public String getQrCodeImageUrl() {
		return this.qrCodeImageUrl;
	}
	public void setQrCodeImageUrl(String qrCodeImageUrl) {
		this.qrCodeImageUrl = qrCodeImageUrl;
	}

	public String getSubscribeToken() {
		return this.subscribeToken;
	}
	public void setSubscribeToken(String subscribeToken) {
		this.subscribeToken = subscribeToken;
	}

	public String getSubscribeUrl() {
		return this.subscribeUrl;
	}
	public void setSubscribeUrl(String subscribeUrl) {
		this.subscribeUrl = subscribeUrl;
	}

	public SubscriptionPackageDetailDTO getSubscriptionPackages() {
		return this.subscriptionPackages;
	}
	public void setSubscriptionPackages(SubscriptionPackageDetailDTO subscriptionPackages) {
		this.subscriptionPackages = subscriptionPackages;
	}

}
