package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询antest云测任务状态
 *
 * @author auto create
 * @since 1.0, 2020-04-21 15:47:10
 */
public class AlipayCommerceAntestTaskstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1318228781858823472L;

	/**
	 * 任务id
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
