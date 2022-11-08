package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询履约单信息
 *
 * @author auto create
 * @since 1.0, 2022-09-29 15:14:41
 */
public class AlipayEbppIndustryPerformOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8348817413575996126L;

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
