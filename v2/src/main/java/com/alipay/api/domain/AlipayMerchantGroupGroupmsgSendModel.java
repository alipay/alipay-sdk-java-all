package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发送商家群内群发消息
 *
 * @author auto create
 * @since 1.0, 2025-05-30 14:58:15
 */
public class AlipayMerchantGroupGroupmsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 3643265395264789183L;

	/**
	 * 是否需要@所有人，不传默认false(不需要@所有人)
	 */
	@ApiField("at_all")
	private Boolean atAll;

	/**
	 * 商家自定义的业务id，会记录下来，在查询消息记录列表的时候返回
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
	 * 用于描述周期消息的发送时间
	 */
	@ApiField("group_msg_schedule_config")
	private GroupMsgScheduleConfigVO groupMsgScheduleConfig;

	/**
	 * 群发消息内容模型
	 */
	@ApiField("msg_data")
	private GroupMessageVO msgData;

	/**
	 * 群发复合消息内容模型
	 */
	@ApiListField("msg_data_list")
	@ApiField("group_message_v_o")
	private List<GroupMessageVO> msgDataList;

	/**
	 * 该参数用于修改时传入创建得到的msgId字段，创建时无需传入，且只有定时发送消息在发送之前可以进行修改，立即发送不支持修改
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 该参数用于描述群发消息是立即发送还是定时发送，0表示立即发送，1表示定时发送，2表示周期发送，不填表示定时发送
	 */
	@ApiField("send_strategy")
	private String sendStrategy;

	/**
	 * 该参数使用 yyyy-MM-dd HH:mm:ss 格式的日期，用于设置定时发送的时间，若不填则默认采用当前时间
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

	public List<String> getGroupIds() {
		return this.groupIds;
	}
	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}

	public GroupMsgScheduleConfigVO getGroupMsgScheduleConfig() {
		return this.groupMsgScheduleConfig;
	}
	public void setGroupMsgScheduleConfig(GroupMsgScheduleConfigVO groupMsgScheduleConfig) {
		this.groupMsgScheduleConfig = groupMsgScheduleConfig;
	}

	public GroupMessageVO getMsgData() {
		return this.msgData;
	}
	public void setMsgData(GroupMessageVO msgData) {
		this.msgData = msgData;
	}

	public List<GroupMessageVO> getMsgDataList() {
		return this.msgDataList;
	}
	public void setMsgDataList(List<GroupMessageVO> msgDataList) {
		this.msgDataList = msgDataList;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
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
