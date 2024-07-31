package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货柜交易视频段信息
 *
 * @author auto create
 * @since 1.0, 2024-01-10 14:40:00
 */
public class AlipayMsaasMediarecogMmportalTransvideoinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3888613368774785836L;

	/**
	 * 交易id
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
