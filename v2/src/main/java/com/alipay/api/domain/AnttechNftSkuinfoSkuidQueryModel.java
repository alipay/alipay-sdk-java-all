package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据skuId查询sku信息
 *
 * @author auto create
 * @since 1.0, 2025-03-31 10:20:23
 */
public class AnttechNftSkuinfoSkuidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8154733837717826963L;

	/**
	 * 数字藏品类标识ID
	 */
	@ApiField("sku_id")
	private Long skuId;

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

}
