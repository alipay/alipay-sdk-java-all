package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈下数字化门店查询
 *
 * @author auto create
 * @since 1.0, 2024-10-23 21:01:50
 */
public class AlipayCommerceMallDigitalshopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7319444792481227874L;

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
