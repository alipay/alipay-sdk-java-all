package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广曝光规则
 *
 * @author auto create
 * @since 1.0, 2025-02-11 14:47:12
 */
public class NDeliveryTargetRule extends AlipayObject {

	private static final long serialVersionUID = 1474491818691726792L;

	/**
	 * 碰一下设备的SN，若传入则与n_delivery_merchant_rule为且关系
	 */
	@ApiField("n_delivery_device_id")
	private String nDeliveryDeviceId;

	/**
	 * 曝光商户信息
	 */
	@ApiField("n_delivery_merchant_rule")
	private NDeliveryMerchantRule nDeliveryMerchantRule;

	public String getnDeliveryDeviceId() {
		return this.nDeliveryDeviceId;
	}
	public void setnDeliveryDeviceId(String nDeliveryDeviceId) {
		this.nDeliveryDeviceId = nDeliveryDeviceId;
	}

	public NDeliveryMerchantRule getnDeliveryMerchantRule() {
		return this.nDeliveryMerchantRule;
	}
	public void setnDeliveryMerchantRule(NDeliveryMerchantRule nDeliveryMerchantRule) {
		this.nDeliveryMerchantRule = nDeliveryMerchantRule;
	}

}
