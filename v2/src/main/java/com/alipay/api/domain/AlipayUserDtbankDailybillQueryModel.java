package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 日账单查询接口
 *
 * @author auto create
 * @since 1.0, 2024-01-30 11:14:15
 */
public class AlipayUserDtbankDailybillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2153152162831933684L;

	/**
	 * 账单id
	 */
	@ApiField("bill_id")
	private String billId;

	/**
	 * 账单类型
	 */
	@ApiField("bill_type")
	private String billType;

	public String getBillId() {
		return this.billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

}
