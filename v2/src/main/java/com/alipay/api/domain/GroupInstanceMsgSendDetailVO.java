package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 群发消息具体群内发送详情
 *
 * @author auto create
 * @since 1.0, 2024-12-13 10:25:56
 */
public class GroupInstanceMsgSendDetailVO extends AlipayObject {

	private static final long serialVersionUID = 1295181391356459758L;

	/**
	 * 群id
	 */
	@ApiField("group_instance_id")
	private String groupInstanceId;

	/**
	 * 用户在支付宝APP可见的群名称，自动建群时会使用“该名称+X群”来命名，无需手动输入群号。建议以品牌名称+分类方式命名，请勿添加数字。
	 */
	@ApiField("group_instance_name")
	private String groupInstanceName;

	/**
	 * chat侧群消息发送记录id
	 */
	@ApiField("group_instance_record_id")
	private String groupInstanceRecordId;

	/**
	 * 消息发送时间
	 */
	@ApiField("send_time")
	private Date sendTime;

	/**
	 * 发送状态， 2:待发送, 3: 发送中, 4: 发送成功, 5: 发送失败, 6: 部分失败, 7: 重发, 8: 待撤回, 9: 撤回中, 10: 已撤回, 12: 部分撤回, 13: 部分成功, 14: 部分删除, 15: 部分发送中
	 */
	@ApiField("status")
	private String status;

	/**
	 * 群发消息发送记录描述
	 */
	@ApiField("tips")
	private String tips;

	public String getGroupInstanceId() {
		return this.groupInstanceId;
	}
	public void setGroupInstanceId(String groupInstanceId) {
		this.groupInstanceId = groupInstanceId;
	}

	public String getGroupInstanceName() {
		return this.groupInstanceName;
	}
	public void setGroupInstanceName(String groupInstanceName) {
		this.groupInstanceName = groupInstanceName;
	}

	public String getGroupInstanceRecordId() {
		return this.groupInstanceRecordId;
	}
	public void setGroupInstanceRecordId(String groupInstanceRecordId) {
		this.groupInstanceRecordId = groupInstanceRecordId;
	}

	public Date getSendTime() {
		return this.sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTips() {
		return this.tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}

}
