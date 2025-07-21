package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 呼叫详情数据对象
 *
 * @author auto create
 * @since 1.0, 2023-10-16 16:43:03
 */
public class CallDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 6197451877444693541L;

	/**
	 * 附加中间号码，双呼场景下可能用到。
	 */
	@ApiField("additional_broker")
	private String additionalBroker;

	/**
	 * 坐席ID列表
	 */
	@ApiListField("agent_ids")
	@ApiField("string")
	private List<String> agentIds;

	/**
	 * 通话涉及到的坐席名称列表
	 */
	@ApiListField("agent_names")
	@ApiField("string")
	private List<String> agentNames;

	/**
	 * 中间号码
	 */
	@ApiField("broker")
	private String broker;

	/**
	 * 通话时长，呼入从通话进入IVR开始计时，呼出从接通开始计时，单位秒。
	 */
	@ApiField("call_duration")
	private String callDuration;

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
	 * 通话结束原因
	 */
	@ApiField("contact_disposition")
	private String contactDisposition;

	/**
	 * 通话ID
	 */
	@ApiField("contact_id")
	private String contactId;

	/**
	 * 通话类型
	 */
	@ApiField("contact_type")
	private String contactType;

	/**
	 * 未接通原因
	 */
	@ApiField("early_media_state")
	private String earlyMediaState;

	/**
	 * 通话建立的时间，如果通话没有建立，此值为空，格式为Unix时间戳，单位毫秒。
	 */
	@ApiField("established_time")
	private Long establishedTime;

	/**
	 * 实例ID
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
	 * 录音时长，单位秒
	 */
	@ApiField("recording_duration")
	private Long recordingDuration;

	/**
	 * 录音是否已经生成，若通话没有建立，则返回false。
	 */
	@ApiField("recording_ready")
	private Boolean recordingReady;

	/**
	 * 挂断方
	 */
	@ApiField("release_initiator")
	private String releaseInitiator;

	/**
	 * 通话结束时间
	 */
	@ApiField("release_time")
	private Date releaseTime;

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
	 * 满意度调查渠道
	 */
	@ApiField("satisfaction_survey_channel")
	private String satisfactionSurveyChannel;

	/**
	 * 是否发起了满意度调查
	 */
	@ApiField("satisfaction_survey_offered")
	private Boolean satisfactionSurveyOffered;

	/**
	 * 参与通话的座席所属的技能组ID
	 */
	@ApiListField("skill_group_ids")
	@ApiField("string")
	private List<String> skillGroupIds;

	/**
	 * 参与通话的座席所属的技能组名称
	 */
	@ApiListField("skill_group_names")
	@ApiField("string")
	private List<String> skillGroupNames;

	/**
	 * 通话开始时间，内呼从进入IVR开始，外呼从拨号开始计算
	 */
	@ApiField("start_time")
	private Date startTime;

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

	public List<String> getAgentIds() {
		return this.agentIds;
	}
	public void setAgentIds(List<String> agentIds) {
		this.agentIds = agentIds;
	}

	public List<String> getAgentNames() {
		return this.agentNames;
	}
	public void setAgentNames(List<String> agentNames) {
		this.agentNames = agentNames;
	}

	public String getBroker() {
		return this.broker;
	}
	public void setBroker(String broker) {
		this.broker = broker;
	}

	public String getCallDuration() {
		return this.callDuration;
	}
	public void setCallDuration(String callDuration) {
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

	public Date getReleaseTime() {
		return this.releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
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

	public List<String> getSkillGroupIds() {
		return this.skillGroupIds;
	}
	public void setSkillGroupIds(List<String> skillGroupIds) {
		this.skillGroupIds = skillGroupIds;
	}

	public List<String> getSkillGroupNames() {
		return this.skillGroupNames;
	}
	public void setSkillGroupNames(List<String> skillGroupNames) {
		this.skillGroupNames = skillGroupNames;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Long getWaitTime() {
		return this.waitTime;
	}
	public void setWaitTime(Long waitTime) {
		this.waitTime = waitTime;
	}

}
