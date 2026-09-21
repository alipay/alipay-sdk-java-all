package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-17 14:22:56
 */
public class ShopProductPriceList extends AlipayObject {

	private static final long serialVersionUID = 8234224119186474138L;

	/**
	 * 服务商侧维护的外部门店 ID。
	 */
	@ApiField("external_shop_id")
	private String externalShopId;

	/**
	 * null
	 */
	@ApiListField("product_list")
	@ApiField("product_list")
	private List<ProductList> productList;

	/**
	 * 企业码内部门店 ID。
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getExternalShopId() {
		return this.externalShopId;
	}
	public void setExternalShopId(String externalShopId) {
		this.externalShopId = externalShopId;
	}

	public List<ProductList> getProductList() {
		return this.productList;
	}
	public void setProductList(List<ProductList> productList) {
		this.productList = productList;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
