package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收行情商户商品spu价格同步
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:42:27
 */
public class AlipayCommerceRecycleMarketspupriceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8563342232564998433L;

	/**
	 * C2B:回收价：用户将旧机给回收商，回收商提供给C的回收价。

	 */
	@ApiField("price_type")
	private String priceType;

	/**
	 * product_code
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * null
	 */
	@ApiListField("skus")
	@ApiField("recycle_sku_d_t_o")
	private List<RecycleSkuDTO> skus;

	public String getPriceType() {
		return this.priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<RecycleSkuDTO> getSkus() {
		return this.skus;
	}
	public void setSkus(List<RecycleSkuDTO> skus) {
		this.skus = skus;
	}

}
