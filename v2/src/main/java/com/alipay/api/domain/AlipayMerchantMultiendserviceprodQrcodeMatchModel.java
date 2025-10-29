package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 判断码值是否支持支付宝缴费
 *
 * @author auto create
 * @since 1.0, 2025-04-27 11:37:28
 */
public class AlipayMerchantMultiendserviceprodQrcodeMatchModel extends AlipayObject {

	private static final long serialVersionUID = 5384321832563513287L;

	/**
	 * 二维码码值
	 */
	@ApiField("qrcode_value")
	private String qrcodeValue;

	public String getQrcodeValue() {
		return this.qrcodeValue;
	}
	public void setQrcodeValue(String qrcodeValue) {
		this.qrcodeValue = qrcodeValue;
	}

}
