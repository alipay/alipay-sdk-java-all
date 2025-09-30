package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创作搬运信息
 *
 * @author auto create
 * @since 1.0, 2024-09-10 10:07:03
 */
public class TransportInfo extends AlipayObject {

	private static final long serialVersionUID = 5842487877278483347L;

	/**
	 * 创作搬运文件信息
	 */
	@ApiField("afts_url")
	private String aftsUrl;

	/**
	 * 搬运信息生成批次号
	 */
	@ApiField("batch_id")
	private String batchId;

	public String getAftsUrl() {
		return this.aftsUrl;
	}
	public void setAftsUrl(String aftsUrl) {
		this.aftsUrl = aftsUrl;
	}

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

}
