package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询antest测试报告
 *
 * @author auto create
 * @since 1.0, 2020-04-21 15:48:01
 */
public class AlipayCommerceAntestReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4594615321975723475L;

	/**
	 * 测试任务id
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
