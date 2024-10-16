package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.nextbuilder.agent.metainfo.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-05 16:42:05
 */
public class AlipayCloudNextbuilderAgentMetainfoGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8343526384194475784L;

	/** 
	 * 创作者平台agentId
	 */
	@ApiField("agent_id")
	private String agentId;

	/** 
	 * AI创作平台agent名称
	 */
	@ApiField("agent_name")
	private String agentName;

	/** 
	 * agent业务类型
	 */
	@ApiField("agent_type")
	private String agentType;

	/** 
	 * AI创作平台agent功能描述
	 */
	@ApiField("description")
	private String description;

	/** 
	 * agent图标
	 */
	@ApiField("icon")
	private String icon;

	/** 
	 * agent类型：chat/draw/completion
	 */
	@ApiField("mode")
	private String mode;

	/** 
	 * 已上架的平台列表
	 */
	@ApiListField("platforms")
	@ApiField("string")
	private List<String> platforms;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getAgentId( ) {
		return this.agentId;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAgentName( ) {
		return this.agentName;
	}

	public void setAgentType(String agentType) {
		this.agentType = agentType;
	}
	public String getAgentType( ) {
		return this.agentType;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getIcon( ) {
		return this.icon;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getMode( ) {
		return this.mode;
	}

	public void setPlatforms(List<String> platforms) {
		this.platforms = platforms;
	}
	public List<String> getPlatforms( ) {
		return this.platforms;
	}

}
