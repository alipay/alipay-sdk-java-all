package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货柜交易重力段信息
 *
 * @author auto create
 * @since 1.0, 2024-01-10 15:07:36
 */
public class AlipayMsaasMediarecogMmportalTransweightinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7793187769555459941L;

	/**
	 * 交易ID
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
