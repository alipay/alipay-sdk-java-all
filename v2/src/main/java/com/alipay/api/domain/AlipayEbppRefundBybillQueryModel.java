package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询退款单
 *
 * @author auto create
 * @since 1.0, 2026-09-22 16:09:05
 */
public class AlipayEbppRefundBybillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1445854268249578844L;

	/**
	 * 业务受理平台业务28位订单号
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
