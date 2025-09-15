package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * boss商品同步海图sku
 *
 * @author auto create
 * @since 1.0, 2025-04-29 17:13:31
 */
public class AnttechOceanbaseObglobalSkuSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6127678315472715681L;

	/**
	 * 商品sku信息
	 */
	@ApiField("sku_info")
	private String skuInfo;

	/**
	 * 初始化sku
	 */
	@ApiField("sku_init")
	private Boolean skuInit;

	public String getSkuInfo() {
		return this.skuInfo;
	}
	public void setSkuInfo(String skuInfo) {
		this.skuInfo = skuInfo;
	}

	public Boolean getSkuInit() {
		return this.skuInit;
	}
	public void setSkuInit(Boolean skuInit) {
		this.skuInit = skuInit;
	}

}
