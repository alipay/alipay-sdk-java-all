package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扣款单详情查询
 *
 * @author auto create
 * @since 1.0, 2024-11-14 19:50:54
 */
public class AlipayMerchantSolcreditserviceprodDeductionorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1276618149241635558L;

	/**
	 * 系统生成扣款单唯一编号
	 */
	@ApiField("deduction_order_no")
	private String deductionOrderNo;

	/**
	 * 系统生成订单唯一编号，查询该订单下所有扣款单
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getDeductionOrderNo() {
		return this.deductionOrderNo;
	}
	public void setDeductionOrderNo(String deductionOrderNo) {
		this.deductionOrderNo = deductionOrderNo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
