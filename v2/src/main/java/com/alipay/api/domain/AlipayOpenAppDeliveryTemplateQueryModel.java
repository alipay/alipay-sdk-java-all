package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约模板查询接口
 *
 * @author auto create
 * @since 1.0, 2023-09-11 14:51:51
 */
public class AlipayOpenAppDeliveryTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7888788471213774473L;

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
