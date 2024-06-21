package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新蓝海活动申请单详情查询
 *
 * @author auto create
 * @since 1.0, 2020-11-26 13:57:39
 */
public class AlipayOpenSpBlueseaactivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4328265764325771434L;

	/**
	 * 申请单 id。通过 <a href="https://opendocs.alipay.com/apis/01ebig">alipay.open.sp.blueseaactivity.create</a>接口获取
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
