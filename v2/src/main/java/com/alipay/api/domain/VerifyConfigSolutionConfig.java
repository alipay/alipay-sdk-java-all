package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核验方案配置
 *
 * @author auto create
 * @since 1.0, 2026-01-19 16:47:43
 */
public class VerifyConfigSolutionConfig extends AlipayObject {

	private static final long serialVersionUID = 1242428441756174921L;

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
