package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 积分兑换奖品处理结果
 *
 * @author auto create
 * @since 1.0, 2021-10-09 11:18:21
 */
public class ExchangeOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 1586876832645387917L;

	/**
	 * 奖品code,唯一标识
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 处理结果描述
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * 订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 处理结果,true:成功，false:失败
	 */
	@ApiField("result")
	private Boolean result;

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Boolean getResult() {
		return this.result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}

}
