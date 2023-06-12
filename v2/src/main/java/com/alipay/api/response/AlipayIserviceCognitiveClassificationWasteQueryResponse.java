package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KeyWordDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.classification.waste.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:58:26
 */
public class AlipayIserviceCognitiveClassificationWasteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6215836916521229412L;

	/** 
	 * 识别类型
	 */
	@ApiField("cognition_type")
	private String cognitionType;

	/** 
	 * 错误编码
	 */
	@ApiField("err_code")
	private String errCode;

	/** 
	 * 错误描述
	 */
	@ApiField("err_msg")
	private String errMsg;

	/** 
	 * 关键字识别列表
	 */
	@ApiListField("key_words")
	@ApiField("key_word_d_t_o")
	private List<KeyWordDTO> keyWords;

	/** 
	 * 原始输入内容
	 */
	@ApiField("origin_content")
	private String originContent;

	/** 
	 * 纠错后的文本
	 */
	@ApiField("rewrite_content")
	private String rewriteContent;

	/** 
	 * 接口是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * traceid
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setCognitionType(String cognitionType) {
		this.cognitionType = cognitionType;
	}
	public String getCognitionType( ) {
		return this.cognitionType;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrCode( ) {
		return this.errCode;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getErrMsg( ) {
		return this.errMsg;
	}

	public void setKeyWords(List<KeyWordDTO> keyWords) {
		this.keyWords = keyWords;
	}
	public List<KeyWordDTO> getKeyWords( ) {
		return this.keyWords;
	}

	public void setOriginContent(String originContent) {
		this.originContent = originContent;
	}
	public String getOriginContent( ) {
		return this.originContent;
	}

	public void setRewriteContent(String rewriteContent) {
		this.rewriteContent = rewriteContent;
	}
	public String getRewriteContent( ) {
		return this.rewriteContent;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
