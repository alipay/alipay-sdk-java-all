package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单标签
 *
 * @author auto create
 * @since 1.0, 2024-05-30 10:21:37
 */
public class OrderTagInfo extends AlipayObject {

	private static final long serialVersionUID = 8135663281489671753L;

	/**
	 * 是否禁止履约
空值：待履约（发货、发奖）
	 */
	@ApiField("of_hold")
	private String ofHold;

	public String getOfHold() {
		return this.ofHold;
	}
	public void setOfHold(String ofHold) {
		this.ofHold = ofHold;
	}

}
