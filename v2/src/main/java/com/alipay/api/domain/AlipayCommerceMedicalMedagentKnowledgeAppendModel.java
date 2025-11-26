package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医生智能体好大夫追加知识库内容接口
 *
 * @author auto create
 * @since 1.0, 2025-03-17 16:58:20
 */
public class AlipayCommerceMedicalMedagentKnowledgeAppendModel extends AlipayObject {

	private static final long serialVersionUID = 2698441653552383834L;

	/**
	 * 组装的医生唯一ID，用于标识知识库所属的代理
拼接规则为固定字符+好大夫医生ID
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 知识库数据ID，标识唯一数据
	 */
	@ApiField("id")
	private String id;

	/**
	 * metadata数据
	 */
	@ApiField("metadata")
	private String metadata;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 操作类型
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 问答模型，包含问题和答案
	 */
	@ApiField("qa")
	private FaqModel qa;

	/**
	 * 标签列表，用于对知识库内容进行分类或标记
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	/**
	 * 文本内容，用于存储问题或回答的文本
	 */
	@ApiField("text_content")
	private String textContent;

	/**
	 * 类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMetadata() {
		return this.metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public FaqModel getQa() {
		return this.qa;
	}
	public void setQa(FaqModel qa) {
		this.qa = qa;
	}

	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getTextContent() {
		return this.textContent;
	}
	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
