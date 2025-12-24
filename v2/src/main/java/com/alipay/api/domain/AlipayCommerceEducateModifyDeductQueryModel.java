package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 是否允许服务商修改扣款渠道
 *
 * @author auto create
 * @since 1.0, 2025-10-14 14:05:35
 */
public class AlipayCommerceEducateModifyDeductQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2188297768816254836L;

	/**
	 * 用于描述业务类型
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 服务商PID，用于校验服务商是否可以修改扣款渠道
	 */
	@ApiField("isv_pid")
	private String isvPid;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

}
