package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家留言回复
 *
 * @author auto create
 * @since 1.0, 2022-04-01 19:49:08
 */
public class AlipayMerchantTradecomplainReplySubmitModel extends AlipayObject {

	private static final long serialVersionUID = 8574724273141298893L;

	/**
	 * 支付宝侧投诉单号
	 */
	@ApiField("complain_event_id")
	private String complainEventId;

	/**
	 * 回复留言内容
	 */
	@ApiField("reply_content")
	private String replyContent;

	/**
	 * 商家处理问题反馈时的回复凭证的图片id，多个逗号隔开（图片id可以通过"商户上传处理图片"接口获取）
	 */
	@ApiField("reply_images")
	private String replyImages;

	public String getComplainEventId() {
		return this.complainEventId;
	}
	public void setComplainEventId(String complainEventId) {
		this.complainEventId = complainEventId;
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
