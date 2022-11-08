package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构账户信息
 *
 * @author auto create
 * @since 1.0, 2020-03-05 17:34:31
 */
public class InstAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 4112579439325217247L;

	/**
	 * 机构二类户账户号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 工单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 账户工单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

}
