package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务包问诊类医生动作回调
 *
 * @author auto create
 * @since 1.0, 2026-04-30 18:32:45
 */
public class AlipayCommerceMedicalServicepackageOrderstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1815455617798933744L;

	/**
	 * 1接单
2拒单
3超时未接单
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 服务包订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
