package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家群消息模型
 *
 * @author auto create
 * @since 1.0, 2025-11-25 14:39:22
 */
public class GroupMessageVO extends AlipayObject {

	private static final long serialVersionUID = 6642886166558125461L;

	/**
	 * 优惠券消息内容模型，当消息类型(msg_type)选 "COUPON" 的时候，这个内容必须得填充
	 */
	@ApiField("coupon_msg_content")
	private CouponMsgVO couponMsgContent;

	/**
	 * 商品消息内容模型，当消息类型(msg_type)选 "GOODS" 的时候，这个内容必须得填充
	 */
	@ApiField("goods_msg_content")
	private GoodsMsgVO goodsMsgContent;

	/**
	 * 图片消息内容模型，当消息类型(msg_type)选 "IMAGE" 的时候，这个内容必须得填充
	 */
	@ApiField("image_msg_content")
	private ImageMsgVO imageMsgContent;

	/**
	 * 图文消息内容模型，当消息类型(msg_type)选 "IMAGE_TEXT" 的时候，这个内容必须得填充
	 */
	@ApiField("image_text_msg_content")
	private ImageTextMsgVO imageTextMsgContent;

	/**
	 * 链接消息内容模型，当消息类型(msg_type) 选择"LINK"的时候，必须填充这个内容
	 */
	@ApiField("link_msg_content")
	private LinkMsgVO linkMsgContent;

	/**
	 * 群消息类型枚举，小程序消息:"APP"，图片消息:"IMAGE"，链接消息:"LINK"，纯文本消息:"TEXT"，优惠券消息:"COUPON"，商品消息:"GOODS"，图文消息:"IMAGE_TEXT"，红包消息："RED_PACKET"。
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 红包消息内容模型，当消息类型(msg_type)选 "RED_PACKET" 的时候，这个内容必须得填充
	 */
	@ApiField("red_packet_msg_content")
	private RedPacketMsgVO redPacketMsgContent;

	/**
	 * 纯文本消息内容模型，当消息类型(msg_type)选 "TEXT" 的时候，这个内容必须得填充
	 */
	@ApiField("text_msg_content")
	private TextMsgVO textMsgContent;

	/**
	 * 小程序消息内容模型，当消息类型(msg_type)选 "APP" 的时候，这个内容必须得填充
	 */
	@ApiField("tiny_app_msg_content")
	private TinyAppMsgVO tinyAppMsgContent;

	public CouponMsgVO getCouponMsgContent() {
		return this.couponMsgContent;
	}
	public void setCouponMsgContent(CouponMsgVO couponMsgContent) {
		this.couponMsgContent = couponMsgContent;
	}

	public GoodsMsgVO getGoodsMsgContent() {
		return this.goodsMsgContent;
	}
	public void setGoodsMsgContent(GoodsMsgVO goodsMsgContent) {
		this.goodsMsgContent = goodsMsgContent;
	}

	public ImageMsgVO getImageMsgContent() {
		return this.imageMsgContent;
	}
	public void setImageMsgContent(ImageMsgVO imageMsgContent) {
		this.imageMsgContent = imageMsgContent;
	}

	public ImageTextMsgVO getImageTextMsgContent() {
		return this.imageTextMsgContent;
	}
	public void setImageTextMsgContent(ImageTextMsgVO imageTextMsgContent) {
		this.imageTextMsgContent = imageTextMsgContent;
	}

	public LinkMsgVO getLinkMsgContent() {
		return this.linkMsgContent;
	}
	public void setLinkMsgContent(LinkMsgVO linkMsgContent) {
		this.linkMsgContent = linkMsgContent;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public RedPacketMsgVO getRedPacketMsgContent() {
		return this.redPacketMsgContent;
	}
	public void setRedPacketMsgContent(RedPacketMsgVO redPacketMsgContent) {
		this.redPacketMsgContent = redPacketMsgContent;
	}

	public TextMsgVO getTextMsgContent() {
		return this.textMsgContent;
	}
	public void setTextMsgContent(TextMsgVO textMsgContent) {
		this.textMsgContent = textMsgContent;
	}

	public TinyAppMsgVO getTinyAppMsgContent() {
		return this.tinyAppMsgContent;
	}
	public void setTinyAppMsgContent(TinyAppMsgVO tinyAppMsgContent) {
		this.tinyAppMsgContent = tinyAppMsgContent;
	}

}
