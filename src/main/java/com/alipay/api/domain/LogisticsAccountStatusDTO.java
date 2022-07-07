package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流公司账户状态信息
 *
 * @author auto create
 * @since 1.0, 2021-02-03 12:10:33
 */
public class LogisticsAccountStatusDTO extends AlipayObject {

	private static final long serialVersionUID = 3194433797794854365L;

	/**
	 * 商家在配送公司的账户的审核说明
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/**
	 * 配送公司物流编码。
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 配送公司名称。
	 */
	@ApiField("logistics_name")
	private String logisticsName;

	/**
	 * 账户状态，AUDITING:审核中，AUDIT_REJECT:审核驳回，VALID:已生效
	 */
	@ApiField("status")
	private String status;

	public String getAuditDesc() {
		return this.auditDesc;
	}
	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getLogisticsName() {
		return this.logisticsName;
	}
	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
