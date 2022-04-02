package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AE销账订单信息
 *
 * @author auto create
 * @since 1.0, 2018-11-19 15:36:13
 */
public class WriteoffOrderParam extends AlipayObject {

	private static final long serialVersionUID = 1386715426862385542L;

	/**
	 * 当前子订单是否已结清
	 */
	@ApiField("is_clearance")
	private Boolean isClearance;

	/**
	 * 主订单号
	 */
	@ApiField("order_num")
	private String orderNum;

	/**
	 * 子订单号
	 */
	@ApiField("sub_order_num")
	private String subOrderNum;

	public Boolean getIsClearance() {
		return this.isClearance;
	}
	public void setIsClearance(Boolean isClearance) {
		this.isClearance = isClearance;
	}

	public String getOrderNum() {
		return this.orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getSubOrderNum() {
		return this.subOrderNum;
	}
	public void setSubOrderNum(String subOrderNum) {
		this.subOrderNum = subOrderNum;
	}

}
