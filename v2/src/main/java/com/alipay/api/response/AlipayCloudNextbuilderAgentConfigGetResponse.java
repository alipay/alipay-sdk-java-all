package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NbDrawSize;
import com.alipay.api.domain.NbInput;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.nextbuilder.agent.config.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-05 11:12:04
 */
public class AlipayCloudNextbuilderAgentConfigGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6857954528331528157L;

	/** 
	 * 配置版本号
	 */
	@ApiField("config_version")
	private String configVersion;

	/** 
	 * 是否生成相关问题建议
	 */
	@ApiField("create_questions")
	private Boolean createQuestions;

	/** 
	 * 生图大小
	 */
	@ApiField("draw_size")
	private NbDrawSize drawSize;

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

	/** 
	 * 配置发布时间
	 */
	@ApiField("published_time")
	private Date publishedTime;

	public void setConfigVersion(String configVersion) {
		this.configVersion = configVersion;
	}
	public String getConfigVersion( ) {
		return this.configVersion;
	}

	public void setCreateQuestions(Boolean createQuestions) {
		this.createQuestions = createQuestions;
	}
	public Boolean getCreateQuestions( ) {
		return this.createQuestions;
	}

	public void setDrawSize(NbDrawSize drawSize) {
		this.drawSize = drawSize;
	}
	public NbDrawSize getDrawSize( ) {
		return this.drawSize;
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

	public void setPublishedTime(Date publishedTime) {
		this.publishedTime = publishedTime;
	}
	public Date getPublishedTime( ) {
		return this.publishedTime;
	}

}
