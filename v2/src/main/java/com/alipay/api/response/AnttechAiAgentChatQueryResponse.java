package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DTAgentChatResult;
import com.alipay.api.domain.DTAgentChatStream;
import com.alipay.api.domain.DTAgentTagInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.agent.chat.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-17 18:37:21
 */
public class AnttechAiAgentChatQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3565297269632231488L;

	/** 
	 * 最终完整结果的内容
	 */
	@ApiField("chat_result")
	private DTAgentChatResult chatResult;

	/** 
	 * 输出状态
	 */
	@ApiField("process_status")
	private String processStatus;

	/** 
	 * 流式输出结构
	 */
	@ApiField("stream")
	private DTAgentChatStream stream;

	/** 
	 * 会话结果标签
	 */
	@ApiListField("tags")
	@ApiField("d_t_agent_tag_info")
	private List<DTAgentTagInfo> tags;

	public void setChatResult(DTAgentChatResult chatResult) {
		this.chatResult = chatResult;
	}
	public DTAgentChatResult getChatResult( ) {
		return this.chatResult;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}
	public String getProcessStatus( ) {
		return this.processStatus;
	}

	public void setStream(DTAgentChatStream stream) {
		this.stream = stream;
	}
	public DTAgentChatStream getStream( ) {
		return this.stream;
	}

	public void setTags(List<DTAgentTagInfo> tags) {
		this.tags = tags;
	}
	public List<DTAgentTagInfo> getTags( ) {
		return this.tags;
	}

}
