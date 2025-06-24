package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据skuId查询sku信息
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:38:47
 */
public class AnttechNftSkuinfoSkuidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3738769857889179185L;

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
