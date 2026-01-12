package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收估价信息
 *
 * @author auto create
 * @since 1.0, 2025-07-03 14:13:31
 */
public class RecycleOutAssessInfo extends AlipayObject {

	private static final long serialVersionUID = 7531122694143675693L;

	/**
	 * 估价结果ID
	 */
	@ApiField("estimate_result_id")
	private String estimateResultId;

	public String getEstimateResultId() {
		return this.estimateResultId;
	}
	public void setEstimateResultId(String estimateResultId) {
		this.estimateResultId = estimateResultId;
	}

}
