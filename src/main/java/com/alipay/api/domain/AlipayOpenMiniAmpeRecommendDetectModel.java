package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AMPE情景推荐信息校验
 *
 * @author auto create
 * @since 1.0, 2021-10-14 14:00:11
 */
public class AlipayOpenMiniAmpeRecommendDetectModel extends AlipayObject {

	private static final long serialVersionUID = 3258237398285711249L;

	/**
	 * 设备标识
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 订单中心ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 产品id
	 */
	@ApiField("product_id")
	private String productId;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

}
