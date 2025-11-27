package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 日账单查询接口
 *
 * @author auto create
 * @since 1.0, 2025-01-23 11:02:17
 */
public class AlipayUserDtbankDailybillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1187917268231334781L;

	/**
	 * 账单id
	 */
	@ApiField("bill_id")
	private String billId;

	/**
	 * 账单类型 当前字段已废弃(该参数已废弃，若继续上传，系统也不会消费该参数，存量业务不受影响)
	 */
	@ApiField("bill_type")
	@Deprecated
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
