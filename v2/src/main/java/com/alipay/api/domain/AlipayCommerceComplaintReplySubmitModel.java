package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 处理投诉
 *
 * @author auto create
 * @since 1.0, 2023-11-10 10:36:07
 */
public class AlipayCommerceComplaintReplySubmitModel extends AlipayObject {

	private static final long serialVersionUID = 7443221789554559427L;

	/**
	 * 投诉ID
	 */
	@ApiField("complaint_id")
	private String complaintId;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 回复内容
	 */
	@ApiField("reply_content")
	private String replyContent;

	public String getComplaintId() {
		return this.complaintId;
	}
	public void setComplaintId(String complaintId) {
		this.complaintId = complaintId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getReplyContent() {
		return this.replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

}
