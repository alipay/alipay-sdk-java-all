package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠券使用限制
 *
 * @author auto create
 * @since 1.0, 2024-05-22 16:19:37
 */
public class CouponUseProduct extends AlipayObject {

	private static final long serialVersionUID = 1563233974931834347L;

	/**
	 * 产品编码
	 */
	@ApiField("commodity_code")
	private String commodityCode;

	/**
	 * 资源包规格编码
	 */
	@ApiField("spec_code")
	private String specCode;

	public String getCommodityCode() {
		return this.commodityCode;
	}
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

}
