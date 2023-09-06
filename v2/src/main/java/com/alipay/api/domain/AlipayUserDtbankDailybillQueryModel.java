package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 日账单查询接口
 *
 * @author auto create
 * @since 1.0, 2023-04-19 14:12:23
 */
public class AlipayUserDtbankDailybillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7219382263873297738L;

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
