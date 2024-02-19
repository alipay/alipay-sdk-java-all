package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 法务AI对话，非流式
 *
 * @author auto create
 * @since 1.0, 2023-10-23 10:09:04
 */
public class AlipayBossProdAlusdpChatQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2537794343627848557L;

	/**
	 * 模型beamwidth参数，非必填
	 */
	@ApiField("beam_width")
	private String beamWidth;

	/**
	 * 模型版本号，必填，固定值
	 */
	@ApiField("chain_name")
	private String chainName;

	/**
	 * 历史记录list，格式为一问一答
	 */
	@ApiListField("history")
	@ApiField("legal_a_i_chat_history")
	private List<LegalAIChatHistory> history;

	/**
	 * 用户输入的问题内容
	 */
	@ApiField("query")
	private String query;

	/**
	 * 场景名，即模型服务名
	 */
	@ApiField("scene_name")
	private String sceneName;

	/**
	 * 模型temperature参数值，非必填
	 */
	@ApiField("temperature")
	private String temperature;

	/**
	 * 模型topK参数，非必填
	 */
	@ApiField("top_k")
	private String topK;

	/**
	 * 模型topP参数，非必填
	 */
	@ApiField("top_p")
	private String topP;

	public String getBeamWidth() {
		return this.beamWidth;
	}
	public void setBeamWidth(String beamWidth) {
		this.beamWidth = beamWidth;
	}

	public String getChainName() {
		return this.chainName;
	}
	public void setChainName(String chainName) {
		this.chainName = chainName;
	}

	public List<LegalAIChatHistory> getHistory() {
		return this.history;
	}
	public void setHistory(List<LegalAIChatHistory> history) {
		this.history = history;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getSceneName() {
		return this.sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

	public String getTemperature() {
		return this.temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getTopK() {
		return this.topK;
	}
	public void setTopK(String topK) {
		this.topK = topK;
	}

	public String getTopP() {
		return this.topP;
	}
	public void setTopP(String topP) {
		this.topP = topP;
	}

}
