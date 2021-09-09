package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易开票申请简要模型
 *
 * @author auto create
 * @since 1.0, 2020-08-27 22:53:48
 */
public class OrderApplyStatusBriefDTO extends AlipayObject {

	private static final long serialVersionUID = 7256195553672268633L;

	/**
	 * SUCCESS：开票成功
FAIL：开票失败
PROCESS：开票中
NOTEXIST：申请不存在
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 开票申请时传入订单号（支持主单号、子单号），不限是否为支付宝体内交易单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
