package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会话
 *
 * @author auto create
 * @since 1.0, 2024-05-21 11:40:39
 */
public class NbConversation extends AlipayObject {

	private static final long serialVersionUID = 5728193957652265161L;

	/**
	 * 创作者平台agentId
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部用户标识
	 */
	@ApiField("outer_user_id")
	private String outerUserId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOuterUserId() {
		return this.outerUserId;
	}
	public void setOuterUserId(String outerUserId) {
		this.outerUserId = outerUserId;
	}

}
