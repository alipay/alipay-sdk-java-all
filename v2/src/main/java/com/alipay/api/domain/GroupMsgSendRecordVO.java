package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 群发消息发送记录
 *
 * @author auto create
 * @since 1.0, 2024-09-30 17:58:11
 */
public class GroupMsgSendRecordVO extends AlipayObject {

	private static final long serialVersionUID = 7739927176742246384L;

	/**
	 * 群组id，表里唯一键，创建群组自动生成
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 定义群组分类，便于后台管理运营识别，可与下面设置的群名称保持一致；例：xx门店群，内部测试群
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 群组下群实例发送详情列表
	 */
	@ApiListField("send_detail_list")
	@ApiField("group_instance_msg_send_detail_v_o")
	private List<GroupInstanceMsgSendDetailVO> sendDetailList;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<GroupInstanceMsgSendDetailVO> getSendDetailList() {
		return this.sendDetailList;
	}
	public void setSendDetailList(List<GroupInstanceMsgSendDetailVO> sendDetailList) {
		this.sendDetailList = sendDetailList;
	}

}
