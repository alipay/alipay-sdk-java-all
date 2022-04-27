package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停止antest云测任务
 *
 * @author auto create
 * @since 1.0, 2020-04-21 15:46:51
 */
public class AlipayCommerceAntestTaskCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1292636296242499351L;

	/**
	 * 任务id
	 */
	@ApiField("batch_id")
	private Long batchId;

	public Long getBatchId() {
		return this.batchId;
	}
	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

}
