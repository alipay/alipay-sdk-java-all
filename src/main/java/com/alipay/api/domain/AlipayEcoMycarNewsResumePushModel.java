package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV资讯概要信息推送
 *
 * @author auto create
 * @since 1.0, 2016-10-25 14:21:20
 */
public class AlipayEcoMycarNewsResumePushModel extends AlipayObject {

	private static final long serialVersionUID = 4836678855789152937L;

	/**
	 * 支付宝生活好信息返回的ID
	 */
	@ApiField("alipay_msg_id")
	private String alipayMsgId;

	/**
	 * 消息分类，请传入对应分类编码值
	 */
	@ApiField("category")
	private String category;

	/**
	 * 消息概述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 标签列表，品牌标签，车型等
	 */
	@ApiField("keyword_list")
	private String keywordList;

	/**
	 * 热门资讯标识： 1， 是； 0，否；
	 */
	@ApiField("msg_hot")
	private String msgHot;

	/**
	 * 简介图，图片url不允许使用外链，先使用车主平台图片上接口将所需图片上传
	 */
	@ApiField("msg_pic")
	private String msgPic;

	/**
	 * 媒体资讯类生活号消息类型
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 生活号id
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 消息标题
	 */
	@ApiField("title")
	private String title;

	public String getAlipayMsgId() {
		return this.alipayMsgId;
	}
	public void setAlipayMsgId(String alipayMsgId) {
		this.alipayMsgId = alipayMsgId;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getKeywordList() {
		return this.keywordList;
	}
	public void setKeywordList(String keywordList) {
		this.keywordList = keywordList;
	}

	public String getMsgHot() {
		return this.msgHot;
	}
	public void setMsgHot(String msgHot) {
		this.msgHot = msgHot;
	}

	public String getMsgPic() {
		return this.msgPic;
	}
	public void setMsgPic(String msgPic) {
		this.msgPic = msgPic;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
