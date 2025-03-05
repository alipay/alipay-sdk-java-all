package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询游历记录
 *
 * @author auto create
 * @since 1.0, 2025-01-08 15:27:25
 */
public class AlipayCloudCloudpromoTravelRecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4626755778824861129L;

	/**
	 * 游历记录ID
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 等同appid
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 来源客户
	 */
	@ApiField("source_u_id")
	private String sourceUId;

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceUId() {
		return this.sourceUId;
	}
	public void setSourceUId(String sourceUId) {
		this.sourceUId = sourceUId;
	}

}
