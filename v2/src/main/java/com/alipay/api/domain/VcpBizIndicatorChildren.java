package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销目标数据子集
 *
 * @author auto create
 * @since 1.0, 2026-08-11 14:39:20
 */
public class VcpBizIndicatorChildren extends AlipayObject {

	private static final long serialVersionUID = 4176796772575446696L;

	/**
	 * 指标code
	 */
	@ApiField("target_code")
	private String targetCode;

	/**
	 * 指标名称
	 */
	@ApiField("target_name")
	private String targetName;

	public String getTargetCode() {
		return this.targetCode;
	}
	public void setTargetCode(String targetCode) {
		this.targetCode = targetCode;
	}

	public String getTargetName() {
		return this.targetName;
	}
	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

}
