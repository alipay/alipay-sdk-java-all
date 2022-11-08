package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 光华平台服务入驻修改服务状态接口
 *
 * @author auto create
 * @since 1.0, 2022-04-20 15:43:05
 */
public class AlipayEcoCityserviceOpeneventAppstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4727372956251423639L;

	/**
	 * 光华平台服务入驻接口返回的唯一编码
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 状态变更的原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * ONLINE / OFFLINE / MAINTAINING 中选择一个，分别对应 上架 / 下架/ 挂维护
	 */
	@ApiField("status")
	private String status;

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
