package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈下数字化门店查询
 *
 * @author auto create
 * @since 1.0, 2025-04-18 19:21:19
 */
public class AlipayCommerceMallDigitalshopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5521617885693468899L;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

}
