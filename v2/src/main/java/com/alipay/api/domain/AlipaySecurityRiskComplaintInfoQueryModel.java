package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询消费者投诉详情
 *
 * @author auto create
 * @since 1.0, 2026-01-30 17:31:51
 */
public class AlipaySecurityRiskComplaintInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5881969875694177337L;

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
