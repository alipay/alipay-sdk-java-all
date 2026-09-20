package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单归还地址
 *
 * @author auto create
 * @since 1.0, 2026-09-04 17:07:50
 */
public class DistributionOrderReturnAddressDTO extends AlipayObject {

	private static final long serialVersionUID = 8659179146552413642L;

	/**
	 * 地址ID，通过地址管理接口维护和获取
	 */
	@ApiField("address_id")
	private String addressId;

	public String getAddressId() {
		return this.addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

}
