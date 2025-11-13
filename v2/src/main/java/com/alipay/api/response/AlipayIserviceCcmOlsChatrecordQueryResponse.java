package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ChatMessage;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.ols.chatrecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:30
 */
public class AlipayIserviceCcmOlsChatrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7546475969349386814L;

	/** 
	 * 客服id
	 */
	@ApiField("agent_id")
	private String agentId;

	/** 
	 * 客服昵称
	 */
	@ApiField("agent_name")
	private String agentName;

	/** 
	 * 多个层级类目信息
	 */
	@ApiField("categories")
	private String categories;

	/** 
	 * 在线技能组id
	 */
	@ApiField("group_id")
	private String groupId;

	/** 
	 * 在线技能组名称
	 */
	@ApiField("group_name")
	private String groupName;

	/** 
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 聊天消息列表
	 */
	@ApiListField("messages")
	@ApiField("chat_message")
	private List<ChatMessage> messages;

	/** 
	 * 满意度。 0：非常满意 1：满意 2：一般 3：不满意 4：非常不满意
	 */
	@ApiField("satisfaction")
	private String satisfaction;

	/** 
	 * 服务记录状态。1：待处理 2：暂存 3：完结 4：废除 5：无效 6：未知
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 在线服务时长，单位秒
	 */
	@ApiField("talk_duration")
	private Long talkDuration;

	/** 
	 * 访客归属地
	 */
	@ApiField("visitor_province")
	private String visitorProvince;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getAgentId( ) {
		return this.agentId;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAgentName( ) {
		return this.agentName;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}
	public String getCategories( ) {
		return this.categories;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupId( ) {
		return this.groupId;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupName( ) {
		return this.groupName;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setMessages(List<ChatMessage> messages) {
		this.messages = messages;
	}
	public List<ChatMessage> getMessages( ) {
		return this.messages;
	}

	public void setSatisfaction(String satisfaction) {
		this.satisfaction = satisfaction;
	}
	public String getSatisfaction( ) {
		return this.satisfaction;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTalkDuration(Long talkDuration) {
		this.talkDuration = talkDuration;
	}
	public Long getTalkDuration( ) {
		return this.talkDuration;
	}

	public void setVisitorProvince(String visitorProvince) {
		this.visitorProvince = visitorProvince;
	}
	public String getVisitorProvince( ) {
		return this.visitorProvince;
	}

}
