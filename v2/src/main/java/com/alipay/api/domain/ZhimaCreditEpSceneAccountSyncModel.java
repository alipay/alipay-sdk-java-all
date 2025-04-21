package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用场景账户结果同步
 *
 * @author auto create
 * @since 1.0, 2025-03-06 11:53:27
 */
public class ZhimaCreditEpSceneAccountSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4696781896898284483L;

	/**
	 * 芝麻企业信用赋予的唯一业务单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 统一社会信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 开通场景账户失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 开通场景账户结果
	 */
	@ApiField("open_status")
	private String openStatus;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getOpenStatus() {
		return this.openStatus;
	}
	public void setOpenStatus(String openStatus) {
		this.openStatus = openStatus;
	}

}
