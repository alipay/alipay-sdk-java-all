package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ebpp通用订单查询
 *
 * @author auto create
 * @since 1.0, 2017-07-20 17:39:54
 */
public class AlipayEbppCommonBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4432458317899765824L;

	/**
	 * 支付宝账单流水号（取自创建账单接口返回的alipay_order_no字段）
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
