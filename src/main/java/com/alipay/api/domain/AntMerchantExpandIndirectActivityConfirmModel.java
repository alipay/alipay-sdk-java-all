package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ant.merchant.expand.indirect.marking.activity.conf
 *
 * @author auto create
 * @since 1.0, 2018-05-10 16:34:49
 */
public class AntMerchantExpandIndirectActivityConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 1536615676715457828L;

	/**
	 * 活动报名id
	 */
	@ApiField("order_id")
	private String orderId;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
