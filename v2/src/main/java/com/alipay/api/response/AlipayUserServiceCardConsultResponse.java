package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.service.card.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-29 15:32:42
 */
public class AlipayUserServiceCardConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7155297318216596743L;

	/** 
	 * 智能体id
	 */
	@ApiField("agent_id")
	private String agentId;

	/** 
	 * 卡片失效时间，如果长期有效，则为kong
	 */
	@ApiField("expire_time")
	private String expireTime;

	/** 
	 * null
	 */
	@ApiListField("service_list")
	@ApiField("string")
	private List<String> serviceList;

	/** 
	 * 模版id
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 卡片下的服务地址
	 */
	@ApiField("url")
	private String url;

	/** 
	 * 占位符id
	 */
	@ApiField("uuid")
	private String uuid;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getAgentId( ) {
		return this.agentId;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public String getExpireTime( ) {
		return this.expireTime;
	}

	public void setServiceList(List<String> serviceList) {
		this.serviceList = serviceList;
	}
	public List<String> getServiceList( ) {
		return this.serviceList;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getUuid( ) {
		return this.uuid;
	}

}
