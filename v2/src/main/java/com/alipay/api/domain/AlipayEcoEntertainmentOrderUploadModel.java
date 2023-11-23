package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数娱充值平台ISV订单回流接口
 *
 * @author auto create
 * @since 1.0, 2019-09-17 22:53:20
 */
public class AlipayEcoEntertainmentOrderUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4651548842382829983L;

	/**
	 * 数娱充值ISV订单回流模型
	 */
	@ApiField("entertainment_order_info")
	private EntertainmentOrderInfo entertainmentOrderInfo;

	public EntertainmentOrderInfo getEntertainmentOrderInfo() {
		return this.entertainmentOrderInfo;
	}
	public void setEntertainmentOrderInfo(EntertainmentOrderInfo entertainmentOrderInfo) {
		this.entertainmentOrderInfo = entertainmentOrderInfo;
	}

}
