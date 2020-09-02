package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单条合约订购查询条件
 *
 * @author auto create
 * @since 1.0, 2020-07-01 09:43:41
 */
public class ProductOrderQueryItem extends AlipayObject {

	private static final long serialVersionUID = 1336481665433585148L;

	/**
	 * 订购渠道
	 */
	@ApiField("ordered_channel")
	private String orderedChannel;

	/**
	 * 产品码
	 */
	@ApiField("ps_code")
	private String psCode;

	public String getOrderedChannel() {
		return this.orderedChannel;
	}
	public void setOrderedChannel(String orderedChannel) {
		this.orderedChannel = orderedChannel;
	}

	public String getPsCode() {
		return this.psCode;
	}
	public void setPsCode(String psCode) {
		this.psCode = psCode;
	}

}
