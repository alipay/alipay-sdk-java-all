package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包扫码的产品上下文对象
 *
 * @author auto create
 * @since 1.0, 2017-04-28 11:12:12
 */
public class AlipayMarketingProductContext extends AlipayObject {

	private static final long serialVersionUID = 7345936824515323887L;

	/**
	 * 客户端client_id
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * product需要接入的时候和支付宝码平台约定。
目前仅支持建行app使用ccb_wallet
	 */
	@ApiField("product")
	private String product;

	/**
	 * 版本号
	 */
	@ApiField("product_version")
	private String productVersion;

	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getProduct() {
		return this.product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

	public String getProductVersion() {
		return this.productVersion;
	}
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

}
