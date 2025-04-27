package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户投诉留言
 *
 * @author auto create
 * @since 1.0, 2025-03-26 10:44:12
 */
public class AlipaySecurityRiskComplaintReplySendModel extends AlipayObject {

	private static final long serialVersionUID = 2517193656118669276L;

	/**
	 * 本次进行留言回复的投诉id(主表主键)
	 */
	@ApiField("complaint_id")
	private String complaintId;

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

	public String getReplyContent() {
		return this.replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

}
