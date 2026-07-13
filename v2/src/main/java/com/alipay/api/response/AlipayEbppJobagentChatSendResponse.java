package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jobagent.chat.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-08 16:47:56
 */
public class AlipayEbppJobagentChatSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3841511566652181738L;

	/** 
	 * 大模型流式输出内容
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 流式输出
	 */
	@ApiField("session_id")
	private String sessionId;

	/** 
	 * 岗位模板编码
	 */
	@ApiField("tpl_code")
	private String tplCode;

	/** 
	 * 推荐岗位信息
	 */
	@ApiField("tpl_data")
	private String tplData;

	/** 
	 * 返回字段类型。枚举值有：text 文本
template 模板
	 */
	@ApiField("type")
	private String type;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionId( ) {
		return this.sessionId;
	}

	public void setTplCode(String tplCode) {
		this.tplCode = tplCode;
	}
	public String getTplCode( ) {
		return this.tplCode;
	}

	public void setTplData(String tplData) {
		this.tplData = tplData;
	}
	public String getTplData( ) {
		return this.tplData;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
