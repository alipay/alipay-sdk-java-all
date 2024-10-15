package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 群消息操作处理器
 *
 * @author auto create
 * @since 1.0, 2024-07-30 11:41:28
 */
public class AlipayMerchantGroupGroupmsgStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2893833925844731255L;

	/**
	 * 消息id
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 操作类型，对指定消息操作干预。操作说明：1、删除操作delete，当前消息发送状态send_status 是 1初始 2等待发送，才能进行删除操作 2、撤回操作recall，当前消息发送状态send_status 是 4发送完成 6发送部分失败，才能进行撤回操作。
	 */
	@ApiField("operate_type")
	private String operateType;

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
