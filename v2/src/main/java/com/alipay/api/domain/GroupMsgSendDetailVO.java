package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 群消息发送详情
 *
 * @author auto create
 * @since 1.0, 2024-09-30 17:58:12
 */
public class GroupMsgSendDetailVO extends AlipayObject {

	private static final long serialVersionUID = 3576859364353718418L;

	/**
	 * 消息详情
	 */
	@ApiField("msg_detail")
	private GroupMsgDetailVO msgDetail;

	/**
	 * 发送记录列表
	 */
	@ApiListField("send_record_list")
	@ApiField("group_msg_send_record_v_o")
	private List<GroupMsgSendRecordVO> sendRecordList;

	public GroupMsgDetailVO getMsgDetail() {
		return this.msgDetail;
	}
	public void setMsgDetail(GroupMsgDetailVO msgDetail) {
		this.msgDetail = msgDetail;
	}

	public List<GroupMsgSendRecordVO> getSendRecordList() {
		return this.sendRecordList;
	}
	public void setSendRecordList(List<GroupMsgSendRecordVO> sendRecordList) {
		this.sendRecordList = sendRecordList;
	}

}
