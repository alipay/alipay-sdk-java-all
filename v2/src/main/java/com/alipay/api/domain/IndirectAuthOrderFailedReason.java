package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间联意愿申请单审核失败原因
 *
 * @author auto create
 * @since 1.0, 2024-07-09 16:18:52
 */
public class IndirectAuthOrderFailedReason extends AlipayObject {

	private static final long serialVersionUID = 4332854953455645411L;

	/**
	 * 审核失败字段
	 */
	@ApiField("fail_param")
	private String failParam;

	/**
	 * 描述申请单审核失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	public String getFailParam() {
		return this.failParam;
	}
	public void setFailParam(String failParam) {
		this.failParam = failParam;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

}
