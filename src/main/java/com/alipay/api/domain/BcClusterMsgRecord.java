package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分组消息记录
 *
 * @author auto create
 * @since 1.0, 2022-10-31 17:44:21
 */
public class BcClusterMsgRecord extends AlipayObject {

	private static final long serialVersionUID = 5259674753857916811L;

	/**
	 * 业务方id，消息发送时可传入，消息列表返回
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 发送消息名称
	 */
	@ApiField("msg_name")
	private String msgName;

	/**
	 * 发送分组ids；客户群分组id，此id唯一，分组下会管理一系列的客户群
	 */
	@ApiListField("send_cluster_ids")
	@ApiField("string")
	private List<String> sendClusterIds;

	/**
	 * 发送时间
	 */
	@ApiField("send_time")
	private Date sendTime;

	/**
	 * 发送状态；SENDING,SEND_SUCCESS,SEND_FAILED,SEND_PART_FAILED
	 */
	@ApiField("status")
	private String status;

	/**
	 * 发送模板code，可选以下值 TEXT,IMAGE,LINKS,MINIAPP
	 */
	@ApiField("template_code")
	private String templateCode;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getMsgName() {
		return this.msgName;
	}
	public void setMsgName(String msgName) {
		this.msgName = msgName;
	}

	public List<String> getSendClusterIds() {
		return this.sendClusterIds;
	}
	public void setSendClusterIds(List<String> sendClusterIds) {
		this.sendClusterIds = sendClusterIds;
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

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}
