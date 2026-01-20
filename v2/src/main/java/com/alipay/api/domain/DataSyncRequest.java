package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-13 14:37:42
 */
public class DataSyncRequest extends AlipayObject {

	private static final long serialVersionUID = 1259591794546112479L;

	/**
	 * 业务唯一键，格式为tenant_type_id
	 */
	@ApiField("biz_key")
	private String bizKey;

	/**
	 * 数据内容
	 */
	@ApiField("data_content")
	private String dataContent;

	/**
	 * 数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 分区时间，格式"yyyyMMdd"
	 */
	@ApiField("dt")
	private String dt;

	public String getBizKey() {
		return this.bizKey;
	}
	public void setBizKey(String bizKey) {
		this.bizKey = bizKey;
	}

	public String getDataContent() {
		return this.dataContent;
	}
	public void setDataContent(String dataContent) {
		this.dataContent = dataContent;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDt() {
		return this.dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}

}
