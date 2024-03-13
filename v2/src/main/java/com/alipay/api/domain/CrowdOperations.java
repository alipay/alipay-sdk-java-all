package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群对象及人群操作
 *
 * @author auto create
 * @since 1.0, 2023-02-28 17:17:11
 */
public class CrowdOperations extends AlipayObject {

	private static final long serialVersionUID = 4784265777191189782L;

	/**
	 * 人群ID
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/**
	 * 操作失效的时间戳，13位，消息接收方自转成long类型
	 */
	@ApiField("deadline")
	private String deadline;

	/**
	 * 操作，1: 加人群 2： 从人群移除
	 */
	@ApiField("operator")
	private Long operator;

	/**
	 * 操作失效的相对间隔时间，优先级高于deadline，消息接受方可自转类型
	 */
	@ApiField("ttl")
	private String ttl;

	public String getCrowdId() {
		return this.crowdId;
	}
	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}

	public String getDeadline() {
		return this.deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public Long getOperator() {
		return this.operator;
	}
	public void setOperator(Long operator) {
		this.operator = operator;
	}

	public String getTtl() {
		return this.ttl;
	}
	public void setTtl(String ttl) {
		this.ttl = ttl;
	}

}
