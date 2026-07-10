package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 大模型安全agent检测服务
 *
 * @author auto create
 * @since 1.0, 2026-07-08 16:42:55
 */
public class AlipaySecurityRiskGuardrailsAgentDetectModel extends AlipayObject {

	private static final long serialVersionUID = 3672471731298788591L;

	/**
	 * agent标识
	 */
	@ApiField("agent_code")
	private String agentCode;

	/**
	 * 业务属性
	 */
	@ApiField("agent_properties")
	private Agentproperties agentProperties;

	/**
	 * 调用系统code
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 业务唯一ID
	 */
	@ApiField("business_data_id")
	private String businessDataId;

	/**
	 * 业务名称
	 */
	@ApiField("business_name")
	private String businessName;

	/**
	 * 节点
	 */
	@ApiField("business_node")
	private String businessNode;

	/**
	 * 基本信息、配置信息等细化操作节点分类
	 */
	@ApiField("business_sub_scene")
	private String businessSubScene;

	/**
	 * null
	 */
	@ApiListField("check_contents")
	@ApiField("guardrails_content")
	private List<GuardrailsContent> checkContents;

	public String getAgentCode() {
		return this.agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public Agentproperties getAgentProperties() {
		return this.agentProperties;
	}
	public void setAgentProperties(Agentproperties agentProperties) {
		this.agentProperties = agentProperties;
	}

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getBusinessDataId() {
		return this.businessDataId;
	}
	public void setBusinessDataId(String businessDataId) {
		this.businessDataId = businessDataId;
	}

	public String getBusinessName() {
		return this.businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessNode() {
		return this.businessNode;
	}
	public void setBusinessNode(String businessNode) {
		this.businessNode = businessNode;
	}

	public String getBusinessSubScene() {
		return this.businessSubScene;
	}
	public void setBusinessSubScene(String businessSubScene) {
		this.businessSubScene = businessSubScene;
	}

	public List<GuardrailsContent> getCheckContents() {
		return this.checkContents;
	}
	public void setCheckContents(List<GuardrailsContent> checkContents) {
		this.checkContents = checkContents;
	}

}
