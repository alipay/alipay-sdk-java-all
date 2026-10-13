package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 输出户号信息
 *
 * @author auto create
 * @since 1.0, 2026-10-08 14:21:58
 */
public class TransferBillkey extends AlipayObject {

	private static final long serialVersionUID = 7856531961733269664L;

	/**
	 * 户号信息
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 户号所属的出账机构
	 */
	@ApiField("inst_id")
	private String instId;

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

}
