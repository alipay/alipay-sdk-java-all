package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询消费者投诉详情
 *
 * @author auto create
 * @since 1.0, 2025-11-07 19:15:40
 */
public class AlipaySecurityRiskComplaintInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1329451153257686848L;

	/**
	 * 投诉主表主键id
	 */
	@ApiField("complain_id")
	private String complainId;

	/**
	 * 主键ID
	 */
	@ApiField("record_id")
	private Long recordId;

	public String getComplainId() {
		return this.complainId;
	}
	public void setComplainId(String complainId) {
		this.complainId = complainId;
	}

	public Long getRecordId() {
		return this.recordId;
	}
	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

}
