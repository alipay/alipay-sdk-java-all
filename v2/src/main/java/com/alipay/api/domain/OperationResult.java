package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 操作结果对象
 *
 * @author auto create
 * @since 1.0, 2025-02-24 15:08:35
 */
public class OperationResult extends AlipayObject {

	private static final long serialVersionUID = 7758781693487895113L;

	/**
	 * 失败的数量
	 */
	@ApiField("failure_count")
	private Long failureCount;

	/**
	 * 存储失败的IDs
	 */
	@ApiListField("failure_ids")
	@ApiField("string")
	private List<String> failureIds;

	/**
	 * 成功的数量
	 */
	@ApiField("success_count")
	private Long successCount;

	/**
	 * 存储成功的IDs
	 */
	@ApiListField("success_ids")
	@ApiField("string")
	private List<String> successIds;

	public Long getFailureCount() {
		return this.failureCount;
	}
	public void setFailureCount(Long failureCount) {
		this.failureCount = failureCount;
	}

	public List<String> getFailureIds() {
		return this.failureIds;
	}
	public void setFailureIds(List<String> failureIds) {
		this.failureIds = failureIds;
	}

	public Long getSuccessCount() {
		return this.successCount;
	}
	public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}

	public List<String> getSuccessIds() {
		return this.successIds;
	}
	public void setSuccessIds(List<String> successIds) {
		this.successIds = successIds;
	}

}
