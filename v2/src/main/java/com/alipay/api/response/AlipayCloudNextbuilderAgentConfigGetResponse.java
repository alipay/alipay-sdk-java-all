package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NbInput;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.nextbuilder.agent.config.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-27 13:57:01
 */
public class AlipayCloudNextbuilderAgentConfigGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6465356954963139396L;

	/** 
	 * 是否生成相关问题建议
	 */
	@ApiField("create_questions")
	private Boolean createQuestions;

	/** 
	 * 用户输入
	 */
	@ApiListField("inputs")
	@ApiField("nb_input")
	private List<NbInput> inputs;

	/** 
	 * 预置问题
	 */
	@ApiListField("prequestions")
	@ApiField("string")
	private List<String> prequestions;

	/** 
	 * 开场白
	 */
	@ApiField("prologue")
	private String prologue;

	public void setCreateQuestions(Boolean createQuestions) {
		this.createQuestions = createQuestions;
	}
	public Boolean getCreateQuestions( ) {
		return this.createQuestions;
	}

	public void setInputs(List<NbInput> inputs) {
		this.inputs = inputs;
	}
	public List<NbInput> getInputs( ) {
		return this.inputs;
	}

	public void setPrequestions(List<String> prequestions) {
		this.prequestions = prequestions;
	}
	public List<String> getPrequestions( ) {
		return this.prequestions;
	}

	public void setPrologue(String prologue) {
		this.prologue = prologue;
	}
	public String getPrologue( ) {
		return this.prologue;
	}

}
