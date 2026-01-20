package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * BusinessId
 *
 * @author auto create
 * @since 1.0, 2023-09-15 10:00:12
 */
public class BusinessId extends AlipayObject {

	private static final long serialVersionUID = 3788655811462697171L;

	/**
	 * 接入任务中心，系统分类二级code
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 接入任务中心，系统分类一级code
	 */
	@ApiField("system_type")
	private String systemType;

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSystemType() {
		return this.systemType;
	}
	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}

}
