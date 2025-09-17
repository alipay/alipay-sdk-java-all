package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能导诊机器人对话通用接口
 *
 * @author auto create
 * @since 1.0, 2023-12-04 20:17:54
 */
public class AlipayCommerceMedicalIndustrydataIntelligentdiagnosisSendModel extends AlipayObject {

	private static final long serialVersionUID = 7465536765178918693L;

	/**
	 * 对话chatId，若是修改的，则传，正常流程不传
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 用户id映射
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部用户user的唯一表示：
1. 如果能获取到用户uid就传支付宝uid
2. 如果获取不到支付宝uid，就用内部用户id，看是否可以加个通用标识，比如ET（外端）；
3. 获取不到用户id时，不同的用户访问时，不能传固定id，可以生成一个随机不重复的数，前缀增加个ET-UR-xxx，以便后续区分
	 */
	@ApiField("outer_user_no")
	private String outerUserNo;

	/**
	 * 外部用户类型，用于区分是2088xxx支付宝用户或其他数值
	 */
	@ApiField("outer_user_type")
	private String outerUserType;

	/**
	 * 回答内容
	 */
	@ApiField("question")
	private String question;

	/**
	 * 问题类型
	 */
	@ApiField("question_type")
	private String questionType;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 请求来源，固定参数
	 */
	@ApiField("source_type")
	private String sourceType;

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOuterUserNo() {
		return this.outerUserNo;
	}
	public void setOuterUserNo(String outerUserNo) {
		this.outerUserNo = outerUserNo;
	}

	public String getOuterUserType() {
		return this.outerUserType;
	}
	public void setOuterUserType(String outerUserType) {
		this.outerUserType = outerUserType;
	}

	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public String getQuestionType() {
		return this.questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

}
