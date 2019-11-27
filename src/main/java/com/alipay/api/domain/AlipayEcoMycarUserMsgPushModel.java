package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV推送消息接口
 *
 * @author auto create
 * @since 1.0, 2016-10-25 14:21:37
 */
public class AlipayEcoMycarUserMsgPushModel extends AlipayObject {

	private static final long serialVersionUID = 1541178793371113983L;

	/**
	 * ISV消息ID,去重使用，防止重复推送给用户
	 */
	@ApiField("isv_msg_id")
	private String isvMsgId;

	/**
	 * ISV名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 消息内容
	 */
	@ApiField("msg_data")
	private String msgData;

	/**
	 * 图标URL
	 */
	@ApiField("msg_img")
	private String msgImg;

	/**
	 * 资讯消息时间，格式YYYYmmDDHHMMSS
	 */
	@ApiField("msg_time")
	private String msgTime;

	/**
	 * 消息标题
	 */
	@ApiField("msg_title")
	private String msgTitle;

	/**
	 * 消息类型：1，普通； 2，推广
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 消息模板ID，由支付宝提供
	 */
	@ApiField("templet_id")
	private String templetId;

	public String getIsvMsgId() {
		return this.isvMsgId;
	}
	public void setIsvMsgId(String isvMsgId) {
		this.isvMsgId = isvMsgId;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getMsgData() {
		return this.msgData;
	}
	public void setMsgData(String msgData) {
		this.msgData = msgData;
	}

	public String getMsgImg() {
		return this.msgImg;
	}
	public void setMsgImg(String msgImg) {
		this.msgImg = msgImg;
	}

	public String getMsgTime() {
		return this.msgTime;
	}
	public void setMsgTime(String msgTime) {
		this.msgTime = msgTime;
	}

	public String getMsgTitle() {
		return this.msgTitle;
	}
	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getTempletId() {
		return this.templetId;
	}
	public void setTempletId(String templetId) {
		this.templetId = templetId;
	}

}
