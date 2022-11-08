package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot应急日志上传请求
 *
 * @author auto create
 * @since 1.0, 2022-10-21 15:09:55
 */
public class IotEmergencyLogIndexSaveOpenMqRequest extends AlipayObject {

	private static final long serialVersionUID = 1822999294576779282L;

	/**
	 * 指标id
	 */
	@ApiField("index_id")
	private String indexId;

	/**
	 * 指标值
	 */
	@ApiField("value")
	private String value;

	public String getIndexId() {
		return this.indexId;
	}
	public void setIndexId(String indexId) {
		this.indexId = indexId;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
