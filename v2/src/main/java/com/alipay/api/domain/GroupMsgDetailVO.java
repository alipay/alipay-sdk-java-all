package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 群发消息详情
 *
 * @author auto create
 * @since 1.0, 2024-09-30 17:58:10
 */
public class GroupMsgDetailVO extends AlipayObject {

	private static final long serialVersionUID = 6343572556865982172L;

	/**
	 * 是否@所有人
	 */
	@ApiField("at_all")
	private Boolean atAll;

	/**
	 * 商家自定义的业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 群组id列表，创建群组时对应的一个群组id
	 */
	@ApiListField("group_ids")
	@ApiField("string")
	private List<String> groupIds;

	/**
	 * 创建者
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 群发消息内容模型
	 */
	@ApiField("msg_data")
	private GroupMessageVO msgData;

	/**
	 * 消息id
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 发送状态， 2:待发送, 3: 发送中, 4: 发送成功, 5: 发送失败, 6: 部分失败, 7: 重发, 8: 待撤回, 9: 撤回中, 10: 已撤回, 12: 部分撤回, 13: 部分成功, 14: 部分删除, 15: 部分发送中
	 */
	@ApiField("send_status")
	private Long sendStatus;

	/**
	 * 发送策略。目前支持0（立即发送）。
	 */
	@ApiField("send_strategy")
	private String sendStrategy;

	/**
	 * 发送时间
	 */
	@ApiField("send_time")
	private Date sendTime;

	/**
	 * 推送的消息文案标题（参考：好物分享来咯！）
	 */
	@ApiField("title")
	private String title;

	public Boolean getAtAll() {
		return this.atAll;
	}
	public void setAtAll(Boolean atAll) {
		this.atAll = atAll;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public List<String> getGroupIds() {
		return this.groupIds;
	}
	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public GroupMessageVO getMsgData() {
		return this.msgData;
	}
	public void setMsgData(GroupMessageVO msgData) {
		this.msgData = msgData;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public Long getSendStatus() {
		return this.sendStatus;
	}
	public void setSendStatus(Long sendStatus) {
		this.sendStatus = sendStatus;
	}

	public String getSendStrategy() {
		return this.sendStrategy;
	}
	public void setSendStrategy(String sendStrategy) {
		this.sendStrategy = sendStrategy;
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
