package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordermaterialsapply.materialsrecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-06 14:27:45
 */
public class AlipayOpenSpNordermaterialsapplyMaterialsrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7376869145981513429L;

	/** 
	 * 铺设记录ID
	 */
	@ApiField("record_id")
	private String recordId;

	/** 
	 * 驳回原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/** 
	 * 剩余可重试次数
	 */
	@ApiField("remain_retry_count")
	private Long remainRetryCount;

	/** 
	 * 审核状态
	 */
	@ApiField("status")
	private String status;

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

	public void setRemainRetryCount(Long remainRetryCount) {
		this.remainRetryCount = remainRetryCount;
	}
	public Long getRemainRetryCount( ) {
		return this.remainRetryCount;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
