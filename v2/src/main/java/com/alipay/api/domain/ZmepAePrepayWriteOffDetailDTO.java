package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信AE提前收款服务平账通知模型
 *
 * @author auto create
 * @since 1.0, 2023-08-03 19:45:34
 */
public class ZmepAePrepayWriteOffDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 8836449466289972199L;

	/**
	 * 子单是否结清
	 */
	@ApiField("is_clearance")
	private Boolean isClearance;

	/**
	 * 主单号
	 */
	@ApiField("order_num")
	private String orderNum;

	/**
	 * 子单号
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
