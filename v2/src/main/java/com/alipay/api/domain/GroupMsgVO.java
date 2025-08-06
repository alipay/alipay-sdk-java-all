package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 群消息。用于编辑群组的群消息，分为图文消息和小程序消息，用户进群时展示。
 *
 * @author auto create
 * @since 1.0, 2024-09-05 17:19:59
 */
public class GroupMsgVO extends AlipayObject {

	private static final long serialVersionUID = 3191747776289162449L;

	/**
	 * 图文消息内容
	 */
	@ApiField("image_text_msg_content")
	private ImageTextMsgVO imageTextMsgContent;

	/**
	 * 群消息类型枚举，图文消息"image-text"，小程序消息"tiny"。
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 小程序消息内容
	 */
	@ApiField("tiny_app_msg_content")
	private TinyAppMsgVO tinyAppMsgContent;

	public ImageTextMsgVO getImageTextMsgContent() {
		return this.imageTextMsgContent;
	}
	public void setImageTextMsgContent(ImageTextMsgVO imageTextMsgContent) {
		this.imageTextMsgContent = imageTextMsgContent;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public TinyAppMsgVO getTinyAppMsgContent() {
		return this.tinyAppMsgContent;
	}
	public void setTinyAppMsgContent(TinyAppMsgVO tinyAppMsgContent) {
		this.tinyAppMsgContent = tinyAppMsgContent;
	}

}
