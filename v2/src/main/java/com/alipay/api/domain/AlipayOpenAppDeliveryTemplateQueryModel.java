package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约模板查询接口
 *
 * @author auto create
 * @since 1.0, 2023-07-04 10:01:35
 */
public class AlipayOpenAppDeliveryTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6591935358341493761L;

	/**
	 * 履约类型
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	public String getDeliveryType() {
		return this.deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

}
