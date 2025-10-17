package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 热线渠道通话详情数据结构
 *
 * @author auto create
 * @since 1.0, 2023-12-11 10:40:59
 */
public class CallDetail extends AlipayObject {

	private static final long serialVersionUID = 7555316381233316968L;

	/**
	 * 附加中间号码，双呼场景下可能用到
	 */
	@ApiField("additional_broker")
	private String additionalBroker;

	/**
	 * 坐席ID列表，多个值用逗号分隔
	 */
	@ApiField("agent_ids")
	private String agentIds;

	/**
	 * 通话涉及到的坐席名称列表，多个坐席之间使用英文逗号隔开。
	 */
	@ApiField("agent_names")
	private String agentNames;

	/**
	 * 中间号码
	 */
	@ApiField("broker")
	private String broker;

	/**
	 * 通话时长，呼入从通话进入IVR开始计时，呼出从接通开始计时，单位秒。
	 */
	@ApiField("call_duration")
	private Long callDuration;

	/**
	 * 被叫号码
	 */
	@ApiField("called_number")
	private String calledNumber;

	/**
	 * 被叫归属地
	 */
	@ApiField("callee_location")
	private String calleeLocation;

	/**
	 * 主叫归属地
	 */
	@ApiField("caller_location")
	private String callerLocation;

	/**
	 * 主叫号码
	 */
	@ApiField("calling_number")
	private String callingNumber;

	/**
	 * 通话结束原因。
枚举值：
● AbandonedInQueue：排队放弃。
● NoAnswer：客户未接。
● QueuingTimeout：排队超时。
● Voicemail：转语音邮箱。
● QueuingFailed：转人工失败。
● QueuingOverflow：排队溢出。
● AbandonedInVoiceNavigator：智能导航中放弃。
● Success：正常结束。
● IVRException：IVR异常。
● AbandonedInRing：振铃放弃。
● AbandonedInIVR：IVR放弃。
● Reject：客户拒接。
● ForwardToOutsideNumber：转外线。
	 */
	@ApiField("contact_disposition")
	private String contactDisposition;

	/**
	 * 热线渠道通话id
	 */
	@ApiField("contact_id")
	private String contactId;

	/**
	 * 通话类型
枚举值：
● Outbound：呼出。
● Back2Back：双呼。
● PrivacyDial：加密通话。
● Internal：内部呼叫。
● Predictive：预测式外呼。
● Inbound：呼入。
● Conference：会议。
	 */
	@ApiField("contact_type")
	private String contactType;

	/**
	 * 未接通原因。
枚举值：
● NoAnswer：无人接听。
● OutOfService：停机。
● NotExist：空号。
● Restricted：呼叫受限。
● Busy：占线。
● NotConnected：无法接通。
● PowerOff：关机。
	 */
	@ApiField("early_media_state")
	private String earlyMediaState;

	/**
	 * 通话建立的时间，如果通话没有建立，此值为空，格式为Unix时间戳，单位毫秒。
	 */
	@ApiField("established_time")
	private Long establishedTime;

	/**
	 * 热线渠道服务实例id
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * IVR时长，即从开始进入IVR到开始进入转人工队列（或客户放弃）之间的时长，单位秒。
	 */
	@ApiField("ivr_time")
	private Long ivrTime;

	/**
	 * 排队时长，即从开始进入转人工队列到坐席开始振铃（或客户放弃，队列超时，队列溢出）之间的时长，单位秒。
	 */
	@ApiField("queue_time")
	private Long queueTime;

	/**
	 * 录音时长，单位秒。
	 */
	@ApiField("recording_duration")
	private Long recordingDuration;

	/**
	 * 录音是否已经生成，若通话没有建立，则返回false。
	 */
	@ApiField("recording_ready")
	private Boolean recordingReady;

	/**
	 * 挂断方。
枚举值：
● agent：坐席。
● customer：客户
	 */
	@ApiField("release_initiator")
	private String releaseInitiator;

	/**
	 * 务通道的挂断原因，表示当前话务通道为什么会被挂断，取值来自SIP协议中定义的响应码，请客户参考SIP协议分析挂断原因
	 */
	@ApiField("release_reason")
	private String releaseReason;

	/**
	 * 通话结束时间，格式为Unix时间戳，单位毫秒。
	 */
	@ApiField("release_time")
	private Long releaseTime;

	/**
	 * 振铃时长，即从坐席振铃到坐席接起（或客户放弃）之间的时长，单位秒。
	 */
	@ApiField("ring_time")
	private Long ringTime;

	/**
	 * 满意度描述，对应于满意度IVR中满意度模块的配置，客户自行定义。
	 */
	@ApiField("satisfaction_description")
	private String satisfactionDescription;

	/**
	 * 满意度，即满意度按键数字（1位数字）的值。
	 */
	@ApiField("satisfaction_index")
	private Long satisfactionIndex;

	/**
	 * 满意度调查渠道。
枚举值：
● IVR：语音满意度。
● SMS：短信满意度。
	 */
	@ApiField("satisfaction_survey_channel")
	private String satisfactionSurveyChannel;

	/**
	 * 是否发起了满意度调查
	 */
	@ApiField("satisfaction_survey_offered")
	private Boolean satisfactionSurveyOffered;

	/**
	 * 参与通话的座席所属的技能组ID，多个技能组以逗号分隔。
	 */
	@ApiField("skill_group_ids")
	private String skillGroupIds;

	/**
	 * 参与通话的座席所属的技能组名称，多个技能组以英文逗号分隔。
	 */
	@ApiField("skill_group_names")
	private String skillGroupNames;

	/**
	 * 通话开始时间，内呼从进入IVR开始，外呼从拨号开始计算，格式为Unix字符串，单位毫秒。
	 */
	@ApiField("start_time")
	private Long startTime;

	/**
	 * 客户等待时长，即QueueTime+RingTime，若客户等待期间放弃，则为0，单位秒。
	 */
	@ApiField("wait_time")
	private Long waitTime;

	public String getAdditionalBroker() {
		return this.additionalBroker;
	}
	public void setAdditionalBroker(String additionalBroker) {
		this.additionalBroker = additionalBroker;
	}

	public String getAgentIds() {
		return this.agentIds;
	}
	public void setAgentIds(String agentIds) {
		this.agentIds = agentIds;
	}

	public String getAgentNames() {
		return this.agentNames;
	}
	public void setAgentNames(String agentNames) {
		this.agentNames = agentNames;
	}

	public String getBroker() {
		return this.broker;
	}
	public void setBroker(String broker) {
		this.broker = broker;
	}

	public Long getCallDuration() {
		return this.callDuration;
	}
	public void setCallDuration(Long callDuration) {
		this.callDuration = callDuration;
	}

	public String getCalledNumber() {
		return this.calledNumber;
	}
	public void setCalledNumber(String calledNumber) {
		this.calledNumber = calledNumber;
	}

	public String getCalleeLocation() {
		return this.calleeLocation;
	}
	public void setCalleeLocation(String calleeLocation) {
		this.calleeLocation = calleeLocation;
	}

	public String getCallerLocation() {
		return this.callerLocation;
	}
	public void setCallerLocation(String callerLocation) {
		this.callerLocation = callerLocation;
	}

	public String getCallingNumber() {
		return this.callingNumber;
	}
	public void setCallingNumber(String callingNumber) {
		this.callingNumber = callingNumber;
	}

	public String getContactDisposition() {
		return this.contactDisposition;
	}
	public void setContactDisposition(String contactDisposition) {
		this.contactDisposition = contactDisposition;
	}

	public String getContactId() {
		return this.contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getContactType() {
		return this.contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getEarlyMediaState() {
		return this.earlyMediaState;
	}
	public void setEarlyMediaState(String earlyMediaState) {
		this.earlyMediaState = earlyMediaState;
	}

	public Long getEstablishedTime() {
		return this.establishedTime;
	}
	public void setEstablishedTime(Long establishedTime) {
		this.establishedTime = establishedTime;
	}

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Long getIvrTime() {
		return this.ivrTime;
	}
	public void setIvrTime(Long ivrTime) {
		this.ivrTime = ivrTime;
	}

	public Long getQueueTime() {
		return this.queueTime;
	}
	public void setQueueTime(Long queueTime) {
		this.queueTime = queueTime;
	}

	public Long getRecordingDuration() {
		return this.recordingDuration;
	}
	public void setRecordingDuration(Long recordingDuration) {
		this.recordingDuration = recordingDuration;
	}

	public Boolean getRecordingReady() {
		return this.recordingReady;
	}
	public void setRecordingReady(Boolean recordingReady) {
		this.recordingReady = recordingReady;
	}

	public String getReleaseInitiator() {
		return this.releaseInitiator;
	}
	public void setReleaseInitiator(String releaseInitiator) {
		this.releaseInitiator = releaseInitiator;
	}

	public String getReleaseReason() {
		return this.releaseReason;
	}
	public void setReleaseReason(String releaseReason) {
		this.releaseReason = releaseReason;
	}

	public Long getReleaseTime() {
		return this.releaseTime;
	}
	public void setReleaseTime(Long releaseTime) {
		this.releaseTime = releaseTime;
	}

	public Long getRingTime() {
		return this.ringTime;
	}
	public void setRingTime(Long ringTime) {
		this.ringTime = ringTime;
	}

	public String getSatisfactionDescription() {
		return this.satisfactionDescription;
	}
	public void setSatisfactionDescription(String satisfactionDescription) {
		this.satisfactionDescription = satisfactionDescription;
	}

	public Long getSatisfactionIndex() {
		return this.satisfactionIndex;
	}
	public void setSatisfactionIndex(Long satisfactionIndex) {
		this.satisfactionIndex = satisfactionIndex;
	}

	public String getSatisfactionSurveyChannel() {
		return this.satisfactionSurveyChannel;
	}
	public void setSatisfactionSurveyChannel(String satisfactionSurveyChannel) {
		this.satisfactionSurveyChannel = satisfactionSurveyChannel;
	}

	public Boolean getSatisfactionSurveyOffered() {
		return this.satisfactionSurveyOffered;
	}
	public void setSatisfactionSurveyOffered(Boolean satisfactionSurveyOffered) {
		this.satisfactionSurveyOffered = satisfactionSurveyOffered;
	}

	public String getSkillGroupIds() {
		return this.skillGroupIds;
	}
	public void setSkillGroupIds(String skillGroupIds) {
		this.skillGroupIds = skillGroupIds;
	}

	public String getSkillGroupNames() {
		return this.skillGroupNames;
	}
	public void setSkillGroupNames(String skillGroupNames) {
		this.skillGroupNames = skillGroupNames;
	}

	public Long getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getWaitTime() {
		return this.waitTime;
	}
	public void setWaitTime(Long waitTime) {
		this.waitTime = waitTime;
	}

}
