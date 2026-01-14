package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核验方案配置
 *
 * @author auto create
 * @since 1.0, 2025-12-31 17:50:56
 */
public class VerifyConfigSolutionConfig extends AlipayObject {

	private static final long serialVersionUID = 7149162986583549493L;

	/**
	 * 是否允许传输参数
	 */
	@ApiField("allow_transfer_param")
	private Boolean allowTransferParam;

	public Boolean getAllowTransferParam() {
		return this.allowTransferParam;
	}
	public void setAllowTransferParam(Boolean allowTransferParam) {
		this.allowTransferParam = allowTransferParam;
	}

}
