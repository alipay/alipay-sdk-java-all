package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电商店铺明细数据查询
 *
 * @author auto create
 * @since 1.0, 2024-08-12 15:02:28
 */
public class ZhimaCreditEpEcomstoreDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7243274472974146621L;

	/**
	 * 店铺平台ID
	 */
	@ApiField("platform_id")
	private String platformId;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 店铺ID
	 */
	@ApiField("store_id")
	private String storeId;

	public String getPlatformId() {
		return this.platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
