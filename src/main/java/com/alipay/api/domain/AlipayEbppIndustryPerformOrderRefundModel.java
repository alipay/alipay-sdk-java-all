package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约单退款
 *
 * @author auto create
 * @since 1.0, 2022-09-29 14:40:33
 */
public class AlipayEbppIndustryPerformOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 3451697149131456897L;

	/**
	 * 订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

}
