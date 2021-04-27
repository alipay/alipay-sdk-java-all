package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备中心消息发送
 *
 * @author auto create
 * @since 1.0, 2018-02-07 11:15:49
 */
public class AlipayCommerceIotMsgcenterSendModel extends AlipayObject {

	private static final long serialVersionUID = 3489162571217926919L;

	/**
	 * 消息内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 消息发送的时间，毫秒级的时间戳
	 */
	@ApiField("datetime")
	private Long datetime;

	/**
	 * 扩展参数，json序列化后的字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 消息是否支持跳转链接
	 */
	@ApiField("is_support_link")
	private Boolean isSupportLink;

	/**
	 * 消息跳转链接
	 */
	@ApiField("link")
	private String link;

	/**
	 * 消息标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 消息类型, 0：普通消息、1：发送push的消息
	 */
	@ApiField("type")
	private Long type;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Long getDatetime() {
		return this.datetime;
	}
	public void setDatetime(Long datetime) {
		this.datetime = datetime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Boolean getIsSupportLink() {
		return this.isSupportLink;
	}
	public void setIsSupportLink(Boolean isSupportLink) {
		this.isSupportLink = isSupportLink;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
