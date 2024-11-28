package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建流程实例
 *
 * @author auto create
 * @since 1.0, 2021-08-26 10:02:07
 */
public class AlipayBossBaseProcessInstanceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1717489533736885168L;

	/**
	 * 加签内容
	 */
	@ApiListField("add_sign_content")
	@ApiField("b_p_open_api_add_sign_content")
	private List<BPOpenApiAddSignContent> addSignContent;

	/**
	 * 业务上下文，JSON格式
	 */
	@ApiField("context")
	private String context;

	/**
	 * 创建人的域账号
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 描述信息
	 */
	@ApiField("description")
	private String description;

	/**
	 * 2088账号
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 流程配置名称。需要先在流程平台配置流程
	 */
	@ApiField("name")
	private String name;

	/**
	 * 优先级，数字越大优先级越高，最大不超过29
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 流程全局唯一ID，和业务一一对应
	 */
	@ApiField("puid")
	private BPOpenApiPUID puid;

	/**
	 * 前置流程从哪个节点发起的本流程
	 */
	@ApiField("source_node_name")
	private String sourceNodeName;

	/**
	 * 前置流程的PUID。用于串连起两个流程
	 */
	@ApiField("source_puid")
	private String sourcePuid;

	/**
	 * 子流程的上下文。每一个上下文都使用JSON格式
	 */
	@ApiListField("sub_contexts")
	@ApiField("string")
	private List<String> subContexts;

	public List<BPOpenApiAddSignContent> getAddSignContent() {
		return this.addSignContent;
	}
	public void setAddSignContent(List<BPOpenApiAddSignContent> addSignContent) {
		this.addSignContent = addSignContent;
	}

	public String getContext() {
		return this.context;
	}
	public void setContext(String context) {
		this.context = context;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public BPOpenApiPUID getPuid() {
		return this.puid;
	}
	public void setPuid(BPOpenApiPUID puid) {
		this.puid = puid;
	}

	public String getSourceNodeName() {
		return this.sourceNodeName;
	}
	public void setSourceNodeName(String sourceNodeName) {
		this.sourceNodeName = sourceNodeName;
	}

	public String getSourcePuid() {
		return this.sourcePuid;
	}
	public void setSourcePuid(String sourcePuid) {
		this.sourcePuid = sourcePuid;
	}

	public List<String> getSubContexts() {
		return this.subContexts;
	}
	public void setSubContexts(List<String> subContexts) {
		this.subContexts = subContexts;
	}

}
