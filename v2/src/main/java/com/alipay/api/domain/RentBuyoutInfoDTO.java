package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单购买信息
 *
 * @author auto create
 * @since 1.0, 2025-06-10 11:42:10
 */
public class RentBuyoutInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5549654241299342794L;

	/**
	 * 租赁阶梯购买分期号
	 */
	@ApiField("buyout_installment_no")
	private Long buyoutInstallmentNo;

	/**
	 * 原租赁交易组件订单号
	 */
	@ApiField("origin_order_id")
	private String originOrderId;

	public Long getBuyoutInstallmentNo() {
		return this.buyoutInstallmentNo;
	}
	public void setBuyoutInstallmentNo(Long buyoutInstallmentNo) {
		this.buyoutInstallmentNo = buyoutInstallmentNo;
	}

	public String getOriginOrderId() {
		return this.originOrderId;
	}
	public void setOriginOrderId(String originOrderId) {
		this.originOrderId = originOrderId;
	}

}
