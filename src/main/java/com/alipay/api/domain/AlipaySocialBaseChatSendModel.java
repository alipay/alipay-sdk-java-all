package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发送分享消息
 *
 * @author auto create
 * @since 1.0, 2018-02-26 17:56:05
 */
public class AlipaySocialBaseChatSendModel extends AlipayObject {

	private static final long serialVersionUID = 7884237118884197928L;

	/**
	 * 消息简短描述，显示在会话列表上，必填
	 */
	@ApiField("biz_memo")
	private String bizMemo;

	/**
	 * 客户端的消息id，需要全局唯一，必填
	 */
	@ApiField("client_msg_id")
	private String clientMsgId;

	/**
	 * 点击消息card跳转的地址，选填
	 */
	@ApiField("link")
	private String link;

	/**
	 * 如果是个人消息，是接收消息者的userid，如果是群消息，是群的id，必填
	 */
	@ApiField("receiver_id")
	private String receiverId;

	/**
	 * 接受者的用户类型，支付宝1，群组2，讨论组3，必填
	 */
	@ApiField("receiver_usertype")
	private String receiverUsertype;

	/**
	 * 消息体的内容，形式为json字符串，必填
分享模板
{
	"title":支付宝聊天,
	"desc":"支付宝聊天",
	"image":"图片地址",
	"thumb":"缩略图地址"
}
文本模板
{
         "m":"文本消息"
}
	 */
	@ApiField("template_data")
	private String templateData;

	/**
	 * 消息模板的类型，分享SHARE，文本TEXT，图片IMAGE，必填
	 */
	@ApiField("template_type")
	private String templateType;

	public String getBizMemo() {
		return this.bizMemo;
	}
	public void setBizMemo(String bizMemo) {
		this.bizMemo = bizMemo;
	}

	public String getClientMsgId() {
		return this.clientMsgId;
	}
	public void setClientMsgId(String clientMsgId) {
		this.clientMsgId = clientMsgId;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getReceiverId() {
		return this.receiverId;
	}
	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	public String getReceiverUsertype() {
		return this.receiverUsertype;
	}
	public void setReceiverUsertype(String receiverUsertype) {
		this.receiverUsertype = receiverUsertype;
	}

	public String getTemplateData() {
		return this.templateData;
	}
	public void setTemplateData(String templateData) {
		this.templateData = templateData;
	}

	public String getTemplateType() {
		return this.templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

}
