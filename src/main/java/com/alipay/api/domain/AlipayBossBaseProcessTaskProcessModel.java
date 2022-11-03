package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 流程任务处理
 *
 * @author auto create
 * @since 1.0, 2022-10-18 19:29:09
 */
public class AlipayBossBaseProcessTaskProcessModel extends AlipayObject {

	private static final long serialVersionUID = 8864625351925579323L;

	/**
	 * 更新的业务上下文。和原有业务上下文同key覆盖，新增key新增。
	 */
	@ApiField("context")
	private String context;

	/**
	 * 处理幂等值，特别注意这个值的使用，不能依赖于流程中的任何值。
	 */
	@ApiField("idempotent_id")
	private String idempotentId;

	/**
	 * 处理备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 当前需要推进的节点
	 */
	@ApiField("node")
	private String node;

	/**
	 * 操作名称
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 当前处理人域账号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 更新的优先级。填写0则不更新，使用原值
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 流程全局唯一ID
	 */
	@ApiField("puid")
	private String puid;

	/**
	 * 更新的子流程上下文。完全覆盖原值。若不需要覆盖，则传null
	 */
	@ApiListField("sub_contexts")
	@ApiField("string")
	private List<String> subContexts;

	public String getContext() {
		return this.context;
	}
	public void setContext(String context) {
		this.context = context;
	}

	public String getIdempotentId() {
		return this.idempotentId;
	}
	public void setIdempotentId(String idempotentId) {
		this.idempotentId = idempotentId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getNode() {
		return this.node;
	}
	public void setNode(String node) {
		this.node = node;
	}

	public String getOperate() {
		return this.operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getPuid() {
		return this.puid;
	}
	public void setPuid(String puid) {
		this.puid = puid;
	}

	public List<String> getSubContexts() {
		return this.subContexts;
	}
	public void setSubContexts(List<String> subContexts) {
		this.subContexts = subContexts;
	}

}
