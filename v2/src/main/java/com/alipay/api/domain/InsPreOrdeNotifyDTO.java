package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预下单通知结构体
 *
 * @author auto create
 * @since 1.0, 2026-07-09 14:47:32
 */
public class InsPreOrdeNotifyDTO extends AlipayObject {

	private static final long serialVersionUID = 1829655685393368645L;

	/**
	 * 预下单外部幂等key
	 */
	@ApiField("out_employee_biz_no")
	private String outEmployeeBizNo;

	/**
	 * 预下单ID
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	public String getOutEmployeeBizNo() {
		return this.outEmployeeBizNo;
	}
	public void setOutEmployeeBizNo(String outEmployeeBizNo) {
		this.outEmployeeBizNo = outEmployeeBizNo;
	}

	public String getPreOrderId() {
		return this.preOrderId;
	}
	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}

}
