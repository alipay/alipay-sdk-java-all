package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大模型围栏(风险防控)提问检测接口
 *
 * @author auto create
 * @since 1.0, 2024-02-27 17:44:11
 */
public class AlipaySecurityRiskGuardrailsAskDetectModel extends AlipayObject {

	private static final long serialVersionUID = 8226715939933464469L;

	/**
	 * 扩展属性Map，key限定为：aigcType、serviceScene、triggerSource、bizOwner，对应的value取值为：

aigcType：
● 文生文：text_text
● 文生图：text_pic
● 图生文：pic_text
● 图生图：pic_pic

serviceScene:
根据业务使用的不同情况支持自定义入参做策略个性化配置，私域或者公域，以及不同的业务应用 
比如领域：
serviceScene = insurance 表示保险
serviceScene = medical 表示医疗
serviceScene = government 表示政务
比如业务活动应用：
serviceScene = xiacu  表示夏促
serviceScene = qixi 表示七夕

triggerSource:
不同的来源，比如移动端、web端、API
	 */
	@ApiField("business_properties")
	private KeyValueMap businessProperties;

	/**
	 * 大模型ID，表示大模型版本
	 */
	@ApiField("model_code")
	private String modelCode;

	/**
	 * 当前提问内容，最大长度10000个字符。
	 */
	@ApiField("question")
	private String question;

	/**
	 * 提问内容类型
	 */
	@ApiField("question_format")
	private String questionFormat;

	/**
	 * 数据唯一标识，能够根据该值定位到该条数据
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 场景码，非必填，可联系蚂蚁运营同学获取
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
	 * 用户ID，用于主体风险判断，如果是2088开头的阿里体系用户，请传入2088开头的用户ID
	 */
	@ApiField("user_id")
	private String userId;

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
