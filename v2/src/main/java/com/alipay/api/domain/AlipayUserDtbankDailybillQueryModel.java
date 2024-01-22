package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 日账单查询接口
 *
 * @author auto create
 * @since 1.0, 2024-01-19 10:17:27
 */
public class AlipayUserDtbankDailybillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5788541845728676872L;

	/**
	 * 账单id
	 */
	@ApiField("bill_id")
	private String billId;

	public String getBillId() {
		return this.billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}

}
