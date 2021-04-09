package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ant.merchant.expand.indirect.marking.activity.conf
 *
 * @author auto create
 * @since 1.0, 2018-12-29 10:16:15
 */
public class AntMerchantExpandIndirectActivityConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4548352481452448471L;

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
