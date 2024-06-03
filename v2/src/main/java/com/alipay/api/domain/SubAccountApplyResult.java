package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财资子户申请结果返回结果
 *
 * @author auto create
 * @since 1.0, 2023-12-06 11:11:23
 */
public class SubAccountApplyResult extends AlipayObject {

	private static final long serialVersionUID = 3871647466967548925L;

	/**
	 * 支付宝虚拟账号，也称2088账号，在业财/结算系统内作为pid字段,并作为财资子户申请的依据
	 */
	@ApiField("alipay_virtual_id")
	private String alipayVirtualId;

	public String getAlipayVirtualId() {
		return this.alipayVirtualId;
	}
	public void setAlipayVirtualId(String alipayVirtualId) {
		this.alipayVirtualId = alipayVirtualId;
	}

}
