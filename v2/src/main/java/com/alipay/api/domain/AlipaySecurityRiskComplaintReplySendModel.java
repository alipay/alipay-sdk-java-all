package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户投诉留言
 *
 * @author auto create
 * @since 1.0, 2026-02-28 16:07:24
 */
public class AlipaySecurityRiskComplaintReplySendModel extends AlipayObject {

	private static final long serialVersionUID = 7796533132844578334L;

	/**
	 * 本次进行留言回复的投诉id(主表主键)
	 */
	@ApiField("complaint_id")
	private String complaintId;

	/**
	 * 本次进行留言回复的投诉id（主表主键）
	 */
	@ApiField("record_id")
	private Long recordId;

	/**
	 * 商户留言内容。
	 */
	@ApiField("reply_content")
	private String replyContent;

	public String getComplaintId() {
		return this.complaintId;
	}
	public void setComplaintId(String complaintId) {
		this.complaintId = complaintId;
	}

	public Long getRecordId() {
		return this.recordId;
	}
	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public String getReplyContent() {
		return this.replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

}
