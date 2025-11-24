package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 天鉴大模型防御-回答检测服务
 *
 * @author auto create
 * @since 1.0, 2025-11-03 14:01:32
 */
public class AlipaySecurityRiskGuardrailsAnswerDetectModel extends AlipayObject {

	private static final long serialVersionUID = 8268476566614599549L;

	/**
	 * 当前回答内容，最大长度10000个字符。回答时必传
	 */
	@ApiField("answer")
	private String answer;

	/**
	 * 流式回答关联ID, 用于关联流失回答中一组完整的回答内容
	 */
	@ApiField("answer_flow_id")
	private String answerFlowId;

	/**
	 * 回答内容格式
	 */
	@ApiField("answer_format")
	private String answerFormat;

	/**
	 * 当前回答流式次序
	 */
	@ApiField("answer_index")
	private Long answerIndex;

	/**
	 * 正常回答: NORMAL
流式回答: FLOW
	 */
	@ApiField("answer_type")
	private String answerType;

	/**
	 * 扩展属性Map，key限定为：aigcType、serviceScene、triggerSource、bizOwner，对应的value取值为： 
aigcType： 
● 文生文：text_text 
● 文生图：text_pic 
● 图生文：pic_text
 ● 图生图：pic_pic 

serviceScene: 根据业务使用的不同情况支持自定义入参做策略个性化配置，私域或者公域，以及不同的业务应用 比如领域： serviceScene = insurance 表示保险 serviceScene = medical 表示医疗 serviceScene = government 表示政务 比如业务活动应用： serviceScene = xiacu 表示夏促 serviceScene = qixi 表示七夕 

triggerSource: 
不同的来源，比如移动端、web端、API
	 */
	@ApiField("business_properties")
	private KeyValueMap businessProperties;

	/**
	 * 大模型ID，表示大模型版本等
	 */
	@ApiField("model_code")
	private String modelCode;

	/**
	 * 当前提问内容，最大长度800个字符。
	 */
	@ApiField("question")
	private String question;

	/**
	 * 提问内容格式
	 */
	@ApiField("question_format")
	private String questionFormat;

	/**
	 * 数据唯一标识，能够根据该值定位到该条数据
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 大模型提问护栏服务, 用于区分提供的服务类别，当前支持：TJ_QUESTION_BASIC、TJ_ANSWER_BASIC 两种
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 会话ID，用于匹配多轮对话上下文
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 用户ID，用于主体风险判断，如为2088阿里体系用户，建议传入2088相关账户
	 */
	@ApiField("user_id")
	private String userId;

	public String getAnswer() {
		return this.answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnswerFlowId() {
		return this.answerFlowId;
	}
	public void setAnswerFlowId(String answerFlowId) {
		this.answerFlowId = answerFlowId;
	}

	public String getAnswerFormat() {
		return this.answerFormat;
	}
	public void setAnswerFormat(String answerFormat) {
		this.answerFormat = answerFormat;
	}

	public Long getAnswerIndex() {
		return this.answerIndex;
	}
	public void setAnswerIndex(Long answerIndex) {
		this.answerIndex = answerIndex;
	}

	public String getAnswerType() {
		return this.answerType;
	}
	public void setAnswerType(String answerType) {
		this.answerType = answerType;
	}

	public KeyValueMap getBusinessProperties() {
		return this.businessProperties;
	}
	public void setBusinessProperties(KeyValueMap businessProperties) {
		this.businessProperties = businessProperties;
	}

	public String getModelCode() {
		return this.modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public String getQuestionFormat() {
		return this.questionFormat;
	}
	public void setQuestionFormat(String questionFormat) {
		this.questionFormat = questionFormat;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
