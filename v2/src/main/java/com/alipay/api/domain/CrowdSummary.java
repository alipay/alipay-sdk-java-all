package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号人群摘要
 *
 * @author auto create
 * @since 1.0, 2020-06-01 10:06:16
 */
public class CrowdSummary extends AlipayObject {

	private static final long serialVersionUID = 8767442926271736818L;

	/**
	 * 人群数量
	 */
	@ApiField("crowd_count")
	private Long crowdCount;

	/**
	 * 生活号人群id
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/**
	 * 人群名称
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 人群状态
	 */
	@ApiField("status")
	private String status;

	public Long getCrowdCount() {
		return this.crowdCount;
	}
	public void setCrowdCount(Long crowdCount) {
		this.crowdCount = crowdCount;
	}

	public String getCrowdId() {
		return this.crowdId;
	}
	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
