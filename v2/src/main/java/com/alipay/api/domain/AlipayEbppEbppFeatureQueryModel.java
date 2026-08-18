package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代扣质量检测特征值查询
 *
 * @author auto create
 * @since 1.0, 2026-08-17 15:25:56
 */
public class AlipayEbppEbppFeatureQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2429424544179668819L;

	/**
	 * 批次id 即文件名
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
