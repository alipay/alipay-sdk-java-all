package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-26 17:37:42
 */
public class InsurancePreAuthInfo extends AlipayObject {

	private static final long serialVersionUID = 3387359838327984421L;

	/**
	 * 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("apply_time")
	private String applyTime;

	/**
	 * 示例：100.00
单位：元
保留俩位小数
	 */
	@ApiField("pre_auth_quota")
	private String preAuthQuota;

	public String getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}

	public String getPreAuthQuota() {
		return this.preAuthQuota;
	}
	public void setPreAuthQuota(String preAuthQuota) {
		this.preAuthQuota = preAuthQuota;
	}

}
