package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单数据处置
 *
 * @author auto create
 * @since 1.0, 2019-03-22 21:08:57
 */
public class AlipayBossOrderApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2287334119339687747L;

	/**
	 * synchronize
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

}
