package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-21 21:42:55
 */
public class InsurancePreAuthInfo extends AlipayObject {

	private static final long serialVersionUID = 8753777255981194174L;

	/**
	 * 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("apply_time")
	private String applyTime;

	/**
	 * 是否为主预授权单
	 */
	@ApiField("main_pre_auth")
	private Boolean mainPreAuth;

	/**
	 * 预授权单号
	 */
	@ApiField("pre_auth_no")
	private String preAuthNo;

	/**
	 * 示例：100.00
单位：元
保留俩位小数
	 */
	@ApiField("pre_auth_quota")
	private String preAuthQuota;

	/**
	 * 子预授权单号
	 */
	@ApiField("sub_pre_auth_no")
	private String subPreAuthNo;

	public String getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}

	public Boolean getMainPreAuth() {
		return this.mainPreAuth;
	}
	public void setMainPreAuth(Boolean mainPreAuth) {
		this.mainPreAuth = mainPreAuth;
	}

	public String getPreAuthNo() {
		return this.preAuthNo;
	}
	public void setPreAuthNo(String preAuthNo) {
		this.preAuthNo = preAuthNo;
	}

	public String getPreAuthQuota() {
		return this.preAuthQuota;
	}
	public void setPreAuthQuota(String preAuthQuota) {
		this.preAuthQuota = preAuthQuota;
	}

	public String getSubPreAuthNo() {
		return this.subPreAuthNo;
	}
	public void setSubPreAuthNo(String subPreAuthNo) {
		this.subPreAuthNo = subPreAuthNo;
	}

}
