package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DocumentInfo;
import com.alipay.api.domain.FaqInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.anttech.dtspark.chat.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-09 16:33:34
 */
public class DatadigitalAnttechDtsparkChatQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7722463755486346979L;

	/** 
	 * 会话流式输出结果
	 */
	@ApiField("content")
	private String content;

	/** 
	 * RAG引用文档详情
	 */
	@ApiListField("doc_infos")
	@ApiField("document_info")
	private List<DocumentInfo> docInfos;

	/** 
	 * RAG引用FAQ详情
	 */
	@ApiListField("faqs")
	@ApiField("faq_info")
	private List<FaqInfo> faqs;

	/** 
	 * 标识同一次多轮对话的id，session_id相同表示用户在同一会话中
	 */
	@ApiField("session_id")
	private String sessionId;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setDocInfos(List<DocumentInfo> docInfos) {
		this.docInfos = docInfos;
	}
	public List<DocumentInfo> getDocInfos( ) {
		return this.docInfos;
	}

	public void setFaqs(List<FaqInfo> faqs) {
		this.faqs = faqs;
	}
	public List<FaqInfo> getFaqs( ) {
		return this.faqs;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionId( ) {
		return this.sessionId;
	}

}
