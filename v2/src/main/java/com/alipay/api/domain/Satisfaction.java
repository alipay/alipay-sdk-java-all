package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 满意度评价
 *
 * @author auto create
 * @since 1.0, 2024-09-20 17:12:18
 */
public class Satisfaction extends AlipayObject {

	private static final long serialVersionUID = 5475746134578458124L;

	/**
	 * 客服2088id
	 */
	@ApiField("agent_alipay_uid")
	private String agentAlipayUid;

	/**
	 * 客服生命周期
	 */
	@ApiField("agent_new_old_type")
	private String agentNewOldType;

	/**
	 * 客服昵称
	 */
	@ApiField("agent_nickname")
	private String agentNickname;

	/**
	 * 客服名
	 */
	@ApiField("agent_real_name")
	private String agentRealName;

	/**
	 * 客服技能组
	 */
	@ApiField("agent_skill_group")
	private String agentSkillGroup;

	/**
	 * 智能助手答案有用吗得分（分）
	 */
	@ApiField("ai_assistant_score")
	private String aiAssistantScore;

	/**
	 * 评价触发id
	 */
	@ApiField("appraise_id")
	private String appraiseId;

	/**
	 * 评价问题数（个）
	 */
	@ApiField("appraise_question_cnt")
	private String appraiseQuestionCnt;

	/**
	 * 评价结果分类内容
	 */
	@ApiField("appraise_result")
	private String appraiseResult;

	/**
	 * 评价触发时间，非固定某一天
	 */
	@ApiField("appraise_trigger_time")
	private String appraiseTriggerTime;

	/**
	 * 评价触发类型名称
	 */
	@ApiField("appraise_type_name")
	private String appraiseTypeName;

	/**
	 * 均响时长（秒）
	 */
	@ApiField("avg_response_length")
	private String avgResponseLength;

	/**
	 * 业务线名称
	 */
	@ApiField("business_name")
	private String businessName;

	/**
	 * 二级业务线
	 */
	@ApiField("business_name_level_2")
	private String businessNameLevel2;

	/**
	 * 进线渠道
	 */
	@ApiField("call_in_user_type")
	private String callInUserType;

	/**
	 * 一级类目
	 */
	@ApiField("cat_name_level_1")
	private String catNameLevel1;

	/**
	 * 二级类目
	 */
	@ApiField("cat_name_level_2")
	private String catNameLevel2;

	/**
	 * 三级类目
	 */
	@ApiField("cat_name_level_3")
	private String catNameLevel3;

	/**
	 * 结案时长（秒）
	 */
	@ApiField("close_case_length")
	private String closeCaseLength;

	/**
	 * 关单类型
	 */
	@ApiField("close_ticket_type")
	private String closeTicketType;

	/**
	 * 服务入口容易找到吗得分(分)
	 */
	@ApiField("entry_difficulty_score")
	private String entryDifficultyScore;

	/**
	 * 首响时长（秒）
	 */
	@ApiField("first_response_length")
	private String firstResponseLength;

	/**
	 * 客服理解您的问题吗得分(分)
	 */
	@ApiField("grasp_score")
	private String graspScore;

	/**
	 * 是否中途断线
	 */
	@ApiField("is_discontinue")
	private String isDiscontinue;

	/**
	 * 是否解决
	 */
	@ApiField("is_solved")
	private String isSolved;

	/**
	 * 是否提交评价
	 */
	@ApiField("is_submitted")
	private String isSubmitted;

	/**
	 * 人工客服容易找到吗得分（分）
	 */
	@ApiField("manual_service_score")
	private String manualServiceScore;

	/**
	 * 关联订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 服务请求id蚂蚁
	 */
	@ApiField("origin_session_id_ant")
	private String originSessionIdAnt;

	/**
	 * 客户其它建议
	 */
	@ApiField("other_adv")
	private String otherAdv;

	/**
	 * 总评分（分）
	 */
	@ApiField("overall_score")
	private String overallScore;

	/**
	 * 客服处理速度够快吗得分(分)
	 */
	@ApiField("process_speed_score")
	private String processSpeedScore;

	/**
	 * 排队时长（秒）
	 */
	@ApiField("queue_length")
	private String queueLength;

	/**
	 * 统计日期,非固定某一天
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * 自助查询问题方便吗得分（分）
	 */
	@ApiField("self_service_score")
	private String selfServiceScore;

	/**
	 * 客服服务态度满意吗得分（分）
	 */
	@ApiField("service_attitude_score")
	private String serviceAttitudeScore;

	/**
	 * 传递的渠道
	 */
	@ApiField("service_channel")
	private String serviceChannel;

	/**
	 * 会话id蚂蚁
	 */
	@ApiField("session_id_ant")
	private String sessionIdAnt;

	/**
	 * 会话id哈啰
	 */
	@ApiField("session_id_hello")
	private String sessionIdHello;

	/**
	 * 会话状态
	 */
	@ApiField("session_type")
	private String sessionType;

	/**
	 * 客服解决方案满意吗得分(分)
	 */
	@ApiField("solution_score")
	private String solutionScore;

	/**
	 * 渠道细分
	 */
	@ApiField("sub_channel")
	private String subChannel;

	/**
	 * 客户guid
	 */
	@ApiField("user_guid")
	private String userGuid;

	/**
	 * 客户联系方式
	 */
	@ApiField("user_phone")
	private String userPhone;

	public String getAgentAlipayUid() {
		return this.agentAlipayUid;
	}
	public void setAgentAlipayUid(String agentAlipayUid) {
		this.agentAlipayUid = agentAlipayUid;
	}

	public String getAgentNewOldType() {
		return this.agentNewOldType;
	}
	public void setAgentNewOldType(String agentNewOldType) {
		this.agentNewOldType = agentNewOldType;
	}

	public String getAgentNickname() {
		return this.agentNickname;
	}
	public void setAgentNickname(String agentNickname) {
		this.agentNickname = agentNickname;
	}

	public String getAgentRealName() {
		return this.agentRealName;
	}
	public void setAgentRealName(String agentRealName) {
		this.agentRealName = agentRealName;
	}

	public String getAgentSkillGroup() {
		return this.agentSkillGroup;
	}
	public void setAgentSkillGroup(String agentSkillGroup) {
		this.agentSkillGroup = agentSkillGroup;
	}

	public String getAiAssistantScore() {
		return this.aiAssistantScore;
	}
	public void setAiAssistantScore(String aiAssistantScore) {
		this.aiAssistantScore = aiAssistantScore;
	}

	public String getAppraiseId() {
		return this.appraiseId;
	}
	public void setAppraiseId(String appraiseId) {
		this.appraiseId = appraiseId;
	}

	public String getAppraiseQuestionCnt() {
		return this.appraiseQuestionCnt;
	}
	public void setAppraiseQuestionCnt(String appraiseQuestionCnt) {
		this.appraiseQuestionCnt = appraiseQuestionCnt;
	}

	public String getAppraiseResult() {
		return this.appraiseResult;
	}
	public void setAppraiseResult(String appraiseResult) {
		this.appraiseResult = appraiseResult;
	}

	public String getAppraiseTriggerTime() {
		return this.appraiseTriggerTime;
	}
	public void setAppraiseTriggerTime(String appraiseTriggerTime) {
		this.appraiseTriggerTime = appraiseTriggerTime;
	}

	public String getAppraiseTypeName() {
		return this.appraiseTypeName;
	}
	public void setAppraiseTypeName(String appraiseTypeName) {
		this.appraiseTypeName = appraiseTypeName;
	}

	public String getAvgResponseLength() {
		return this.avgResponseLength;
	}
	public void setAvgResponseLength(String avgResponseLength) {
		this.avgResponseLength = avgResponseLength;
	}

	public String getBusinessName() {
		return this.businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessNameLevel2() {
		return this.businessNameLevel2;
	}
	public void setBusinessNameLevel2(String businessNameLevel2) {
		this.businessNameLevel2 = businessNameLevel2;
	}

	public String getCallInUserType() {
		return this.callInUserType;
	}
	public void setCallInUserType(String callInUserType) {
		this.callInUserType = callInUserType;
	}

	public String getCatNameLevel1() {
		return this.catNameLevel1;
	}
	public void setCatNameLevel1(String catNameLevel1) {
		this.catNameLevel1 = catNameLevel1;
	}

	public String getCatNameLevel2() {
		return this.catNameLevel2;
	}
	public void setCatNameLevel2(String catNameLevel2) {
		this.catNameLevel2 = catNameLevel2;
	}

	public String getCatNameLevel3() {
		return this.catNameLevel3;
	}
	public void setCatNameLevel3(String catNameLevel3) {
		this.catNameLevel3 = catNameLevel3;
	}

	public String getCloseCaseLength() {
		return this.closeCaseLength;
	}
	public void setCloseCaseLength(String closeCaseLength) {
		this.closeCaseLength = closeCaseLength;
	}

	public String getCloseTicketType() {
		return this.closeTicketType;
	}
	public void setCloseTicketType(String closeTicketType) {
		this.closeTicketType = closeTicketType;
	}

	public String getEntryDifficultyScore() {
		return this.entryDifficultyScore;
	}
	public void setEntryDifficultyScore(String entryDifficultyScore) {
		this.entryDifficultyScore = entryDifficultyScore;
	}

	public String getFirstResponseLength() {
		return this.firstResponseLength;
	}
	public void setFirstResponseLength(String firstResponseLength) {
		this.firstResponseLength = firstResponseLength;
	}

	public String getGraspScore() {
		return this.graspScore;
	}
	public void setGraspScore(String graspScore) {
		this.graspScore = graspScore;
	}

	public String getIsDiscontinue() {
		return this.isDiscontinue;
	}
	public void setIsDiscontinue(String isDiscontinue) {
		this.isDiscontinue = isDiscontinue;
	}

	public String getIsSolved() {
		return this.isSolved;
	}
	public void setIsSolved(String isSolved) {
		this.isSolved = isSolved;
	}

	public String getIsSubmitted() {
		return this.isSubmitted;
	}
	public void setIsSubmitted(String isSubmitted) {
		this.isSubmitted = isSubmitted;
	}

	public String getManualServiceScore() {
		return this.manualServiceScore;
	}
	public void setManualServiceScore(String manualServiceScore) {
		this.manualServiceScore = manualServiceScore;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOriginSessionIdAnt() {
		return this.originSessionIdAnt;
	}
	public void setOriginSessionIdAnt(String originSessionIdAnt) {
		this.originSessionIdAnt = originSessionIdAnt;
	}

	public String getOtherAdv() {
		return this.otherAdv;
	}
	public void setOtherAdv(String otherAdv) {
		this.otherAdv = otherAdv;
	}

	public String getOverallScore() {
		return this.overallScore;
	}
	public void setOverallScore(String overallScore) {
		this.overallScore = overallScore;
	}

	public String getProcessSpeedScore() {
		return this.processSpeedScore;
	}
	public void setProcessSpeedScore(String processSpeedScore) {
		this.processSpeedScore = processSpeedScore;
	}

	public String getQueueLength() {
		return this.queueLength;
	}
	public void setQueueLength(String queueLength) {
		this.queueLength = queueLength;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getSelfServiceScore() {
		return this.selfServiceScore;
	}
	public void setSelfServiceScore(String selfServiceScore) {
		this.selfServiceScore = selfServiceScore;
	}

	public String getServiceAttitudeScore() {
		return this.serviceAttitudeScore;
	}
	public void setServiceAttitudeScore(String serviceAttitudeScore) {
		this.serviceAttitudeScore = serviceAttitudeScore;
	}

	public String getServiceChannel() {
		return this.serviceChannel;
	}
	public void setServiceChannel(String serviceChannel) {
		this.serviceChannel = serviceChannel;
	}

	public String getSessionIdAnt() {
		return this.sessionIdAnt;
	}
	public void setSessionIdAnt(String sessionIdAnt) {
		this.sessionIdAnt = sessionIdAnt;
	}

	public String getSessionIdHello() {
		return this.sessionIdHello;
	}
	public void setSessionIdHello(String sessionIdHello) {
		this.sessionIdHello = sessionIdHello;
	}

	public String getSessionType() {
		return this.sessionType;
	}
	public void setSessionType(String sessionType) {
		this.sessionType = sessionType;
	}

	public String getSolutionScore() {
		return this.solutionScore;
	}
	public void setSolutionScore(String solutionScore) {
		this.solutionScore = solutionScore;
	}

	public String getSubChannel() {
		return this.subChannel;
	}
	public void setSubChannel(String subChannel) {
		this.subChannel = subChannel;
	}

	public String getUserGuid() {
		return this.userGuid;
	}
	public void setUserGuid(String userGuid) {
		this.userGuid = userGuid;
	}

	public String getUserPhone() {
		return this.userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

}
