package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ChatReference;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.aichat.syncmsg.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-08 17:52:05
 */
public class AlipayCloudCloudpromoAichatSyncmsgCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1565422621532444821L;

	/** 
	 * 答案
	 */
	@ApiField("answer")
	private String answer;

	/** 
	 * 业务场景信息
	 */
	@ApiField("biz_trans_data")
	private String bizTransData;

	/** 
	 * 用户提问内容
	 */
	@ApiField("question")
	private String question;

	/** 
	 * 引用来源
	 */
	@ApiListField("references")
	@ApiField("chat_reference")
	private List<ChatReference> references;

	/** 
	 * 关联问
	 */
	@ApiListField("related_questions")
	@ApiField("string")
	private List<String> relatedQuestions;

	/** 
	 * 请求唯一标识
	 */
	@ApiField("request_id")
	private String requestId;

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnswer( ) {
		return this.answer;
	}

	public void setBizTransData(String bizTransData) {
		this.bizTransData = bizTransData;
	}
	public String getBizTransData( ) {
		return this.bizTransData;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	public String getQuestion( ) {
		return this.question;
	}

	public void setReferences(List<ChatReference> references) {
		this.references = references;
	}
	public List<ChatReference> getReferences( ) {
		return this.references;
	}

	public void setRelatedQuestions(List<String> relatedQuestions) {
		this.relatedQuestions = relatedQuestions;
	}
	public List<String> getRelatedQuestions( ) {
		return this.relatedQuestions;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
