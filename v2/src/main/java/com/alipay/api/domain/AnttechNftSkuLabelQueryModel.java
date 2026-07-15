package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 藏品标签颜色查询
 *
 * @author auto create
 * @since 1.0, 2026-03-11 15:46:25
 */
public class AnttechNftSkuLabelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8697869285136669566L;

	/**
	 * 藏品skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
