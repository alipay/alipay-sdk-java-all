package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询人工货柜层视频信息
 *
 * @author auto create
 * @since 1.0, 2022-03-25 17:36:19
 */
public class AlipayMsaasMediarecogMmtcaftscvManualfloorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6164137967142335729L;

	/**
	 * 视觉交易号
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
