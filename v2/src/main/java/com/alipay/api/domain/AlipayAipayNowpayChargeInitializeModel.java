package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 初始化收费配置
 *
 * @author auto create
 * @since 1.0, 2026-09-02 00:47:51
 */
public class AlipayAipayNowpayChargeInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 5734154994919478717L;

	/**
	 * 配置完成返回平台地址
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	/**
	 * 商品所有者标识
	 */
	@ApiField("external_owner_id")
	private String externalOwnerId;

	/**
	 * 商品/应用标识
	 */
	@ApiField("out_product_id")
	private String outProductId;

	/**
	 * null
	 */
	@ApiListField("pricing_mode_list")
	@ApiField("pricing_mode")
	private List<PricingMode> pricingModeList;

	/**
	 * 商品图标链接地址
	 */
	@ApiField("product_icon_url")
	private String productIconUrl;

	/**
	 * 商品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 商品详情页
	 */
	@ApiField("product_url")
	private String productUrl;

	public String getCallbackUrl() {
		return this.callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getExternalOwnerId() {
		return this.externalOwnerId;
	}
	public void setExternalOwnerId(String externalOwnerId) {
		this.externalOwnerId = externalOwnerId;
	}

	public String getOutProductId() {
		return this.outProductId;
	}
	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}

	public List<PricingMode> getPricingModeList() {
		return this.pricingModeList;
	}
	public void setPricingModeList(List<PricingMode> pricingModeList) {
		this.pricingModeList = pricingModeList;
	}

	public String getProductIconUrl() {
		return this.productIconUrl;
	}
	public void setProductIconUrl(String productIconUrl) {
		this.productIconUrl = productIconUrl;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductUrl() {
		return this.productUrl;
	}
	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

}
