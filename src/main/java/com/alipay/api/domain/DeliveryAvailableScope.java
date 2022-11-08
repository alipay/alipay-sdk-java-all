package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放可用范围
 *
 * @author auto create
 * @since 1.0, 2022-08-08 10:33:37
 */
public class DeliveryAvailableScope extends AlipayObject {

	private static final long serialVersionUID = 1715152532664538198L;

	/**
	 * 投放城市编码，当delivery_available_scope_type=CITY_CODE，那么该对象必须填值。填值时all_city和city_codes两者二选一且必填。
	 */
	@ApiField("delivery_available_city_code")
	private DeliveryAvailableCityCode deliveryAvailableCityCode;

	/**
	 * 投放可用范围类型，目前支持的类型是城市范围CITY_CODE
	 */
	@ApiField("delivery_available_scope_type")
	private String deliveryAvailableScopeType;

	public DeliveryAvailableCityCode getDeliveryAvailableCityCode() {
		return this.deliveryAvailableCityCode;
	}
	public void setDeliveryAvailableCityCode(DeliveryAvailableCityCode deliveryAvailableCityCode) {
		this.deliveryAvailableCityCode = deliveryAvailableCityCode;
	}

	public String getDeliveryAvailableScopeType() {
		return this.deliveryAvailableScopeType;
	}
	public void setDeliveryAvailableScopeType(String deliveryAvailableScopeType) {
		this.deliveryAvailableScopeType = deliveryAvailableScopeType;
	}

}
