package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 更新流程工单业务上下文
 *
 * @author auto create
 * @since 1.0, 2022-10-20 15:48:23
 */
public class AlipayBossBaseProcessTaskUpdatecontextModel extends AlipayObject {

	private static final long serialVersionUID = 6738728623886958565L;

	/**
	 * 业务上下文
	 */
	@ApiField("context")
	private String context;

	/**
	 * 优先级
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 流程全局唯一ID
	 */
	@ApiField("puid")
	private String puid;

	/**
	 * 子流程上下文
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
