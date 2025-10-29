package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家处理服务咨询
 *
 * @author auto create
 * @since 1.0, 2023-01-12 10:59:09
 */
public class AlipayMerchantServiceconsultFeedbackSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 8115713888385991716L;

	/**
	 * 支付宝侧服务咨询工单号
	 */
	@ApiField("consult_event_id")
	private String consultEventId;

	/**
	 * 回复内容，最多不超过200个字
	 */
	@ApiField("reply_content")
	private String replyContent;

	/**
	 * 商家处理问题反馈时的回复凭证的图片id，多个逗号隔开（图片id可以通过"商户上传处理图片"接口获取）
	 */
	@ApiField("reply_images")
	private String replyImages;

	public String getConsultEventId() {
		return this.consultEventId;
	}
	public void setConsultEventId(String consultEventId) {
		this.consultEventId = consultEventId;
	}

	public String getReplyContent() {
		return this.replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public String getReplyImages() {
		return this.replyImages;
	}
	public void setReplyImages(String replyImages) {
		this.replyImages = replyImages;
	}

}
