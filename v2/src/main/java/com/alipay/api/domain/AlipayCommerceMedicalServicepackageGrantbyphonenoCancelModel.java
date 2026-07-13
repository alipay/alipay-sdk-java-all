package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务包订单取消接口
 *
 * @author auto create
 * @since 1.0, 2026-06-12 14:57:55
 */
public class AlipayCommerceMedicalServicepackageGrantbyphonenoCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6677676156954874367L;

	/**
	 * null
	 */
	@ApiListField("order_no_list")
	@ApiField("string")
	private List<String> orderNoList;

	public List<String> getOrderNoList() {
		return this.orderNoList;
	}
	public void setOrderNoList(List<String> orderNoList) {
		this.orderNoList = orderNoList;
	}

}
