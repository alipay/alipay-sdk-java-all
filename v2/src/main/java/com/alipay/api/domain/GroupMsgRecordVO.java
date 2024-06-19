package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家群群内消息发送记录模型
 *
 * @author auto create
 * @since 1.0, 2024-05-27 20:03:28
 */
public class GroupMsgRecordVO extends AlipayObject {

	private static final long serialVersionUID = 3775345176351949115L;

	/**
	 * 业务自己定义的业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 群组id列表
	 */
	@ApiListField("group_ids")
	@ApiField("string")
	private List<String> groupIds;

	/**
	 * 消息id
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 群消息类型枚举，小程序消息:"APP"，图片消息:"IMAGE"，链接消息:"LINK"，纯文本消息:"TEXT"
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 发送状态，
2:待发送, 
3: 发送中, 
4: 发送成功, 
5: 发送失败, 
6: 部分失败, 
7: 重发, 
8: 待撤回, 
9: 撤回中, 
10: 已撤回, 
12: 部分撤回, 
13: 部分成功, 
14: 部分删除, 
15: 部分发送中
	 */
	@ApiField("send_status")
	private Long sendStatus;

	/**
	 * 消息发送时间
	 */
	@ApiField("send_time")
	private Date sendTime;

	/**
	 * 消息所属标题
	 */
	@ApiField("title")
	private String title;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public List<String> getGroupIds() {
		return this.groupIds;
	}
	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public Long getSendStatus() {
		return this.sendStatus;
	}
	public void setSendStatus(Long sendStatus) {
		this.sendStatus = sendStatus;
	}

	public Date getSendTime() {
		return this.sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
