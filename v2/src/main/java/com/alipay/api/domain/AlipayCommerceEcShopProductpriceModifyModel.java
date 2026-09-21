package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店商品单价批量维护
 *
 * @author auto create
 * @since 1.0, 2026-09-17 14:22:56
 */
public class AlipayCommerceEcShopProductpriceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5788218128834983792L;

	/**
	 * 商家企业 ID，用于商家自调用时进行企业鉴权
	 */
	@ApiField("merchant_enterprise_id")
	private String merchantEnterpriseId;

	/**
	 * 服务商 ID，用于标识代商家调用的服务商。
	 */
	@ApiField("service_provider_id")
	private String serviceProviderId;

	/**
	 * null
	 */
	@ApiListField("shop_product_price_list")
	@ApiField("shop_product_price_list")
	private List<ShopProductPriceList> shopProductPriceList;

	public String getMerchantEnterpriseId() {
		return this.merchantEnterpriseId;
	}
	public void setMerchantEnterpriseId(String merchantEnterpriseId) {
		this.merchantEnterpriseId = merchantEnterpriseId;
	}

	public String getServiceProviderId() {
		return this.serviceProviderId;
	}
	public void setServiceProviderId(String serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}

	public List<ShopProductPriceList> getShopProductPriceList() {
		return this.shopProductPriceList;
	}
	public void setShopProductPriceList(List<ShopProductPriceList> shopProductPriceList) {
		this.shopProductPriceList = shopProductPriceList;
	}

}
