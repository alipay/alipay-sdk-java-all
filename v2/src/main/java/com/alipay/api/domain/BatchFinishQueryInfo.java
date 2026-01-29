package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算批次关账查询信息
 *
 * @author auto create
 * @since 1.0, 2024-04-17 17:00:27
 */
public class BatchFinishQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 3596255582573543789L;

	/**
	 * 支付宝侧结算批次id,全局唯一
	 */
	@ApiField("batch_id")
	private String batchId;

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

}
