package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * lite货柜人工识别结果
 *
 * @author auto create
 * @since 1.0, 2022-10-19 09:59:17
 */
public class AlipayMsaasMediarecogMmtcaftscvLiteresultSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5328248863459575412L;

	/**
	 * 人工识别结果
	 */
	@ApiListField("contrast_result")
	@ApiField("contrast_result")
	private List<ContrastResult> contrastResult;

	/**
	 * 货柜交易号
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public List<ContrastResult> getContrastResult() {
		return this.contrastResult;
	}
	public void setContrastResult(List<ContrastResult> contrastResult) {
		this.contrastResult = contrastResult;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
