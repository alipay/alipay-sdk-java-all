package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 即时配送，要更新的商家账户状态信息
 *
 * @author auto create
 * @since 1.0, 2020-09-26 22:42:01
 */
public class LogisticsAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 3272514284363673544L;

	/**
	 * 商家在配送公司的账户的审核说明
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/**
	 * 商家在配送公司的账户id。
	 */
	@ApiField("logistics_account_id")
	private String logisticsAccountId;

	/**
	 * 商家在配送公司的账户状态
	 */
	@ApiField("logistics_account_status")
	private String logisticsAccountStatus;

	/**
	 * 商家的pid。
	 */
	@ApiField("pid")
	private String pid;

	public String getAuditDesc() {
		return this.auditDesc;
	}
	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}

	public String getLogisticsAccountId() {
		return this.logisticsAccountId;
	}
	public void setLogisticsAccountId(String logisticsAccountId) {
		this.logisticsAccountId = logisticsAccountId;
	}

	public String getLogisticsAccountStatus() {
		return this.logisticsAccountStatus;
	}
	public void setLogisticsAccountStatus(String logisticsAccountStatus) {
		this.logisticsAccountStatus = logisticsAccountStatus;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
