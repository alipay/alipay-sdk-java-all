package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-09-11 15:42:40
 */
public class GroupScheduleMsgVO extends AlipayObject {

	private static final long serialVersionUID = 1233467741437887243L;

	/**
	 * 业务自己定义的业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 用于描述定时群发消息发送失败的原因包括校验异常或者是消息内容异常等信息, 一般与send_status一起判断, 当send_status不等于成功时, 可以查看该字段是否有校验错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * null
	 */
	@ApiListField("group_ids")
	@ApiField("string")
	private List<String> groupIds;

	/**
	 * 用于描述周期消息发送配置
	 */
	@ApiField("group_msg_schedule_config")
	private GroupMsgScheduleConfigVO groupMsgScheduleConfig;

	/**
	 * 消息id
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 群消息类型枚举，小程序消息:"APP"，图片消息:"IMAGE"，链接消息:"LINK"，纯文本消息:"TEXT"，优惠券消息:"COUPON"，商品消息:"GOODS"，图文消息:"IMAGE_TEXT"。
当发送消息类型为复合消息（send_batch为true时），返回结果为几种消息类型的组合，示例:["APP", "COUPON", "IMAGE"]
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 描述发送的是单条消息还是复合消息
	 */
	@ApiField("send_batch")
	private Boolean sendBatch;

	/**
	 * 发送状态，
100:等待发送, 
101: 生效中, 
102: 周期消息到期停止, 
103: 营销活动失效周期消息停止, 
104: 周期消息取消, 
105: 周期消息删除
	 */
	@ApiField("send_status")
	private Long sendStatus;

	/**
	 * 发送策略，0立即发送，1定时发送，2周期发送
	 */
	@ApiField("send_strategy")
	private String sendStrategy;

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

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
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

	public Boolean getSendBatch() {
		return this.sendBatch;
	}
	public void setSendBatch(Boolean sendBatch) {
		this.sendBatch = sendBatch;
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
