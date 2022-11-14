package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 在配送公司的门店状态
 *
 * @author auto create
 * @since 1.0, 2021-04-06 10:43:12
 */
public class LogisticsShopStatusDTO extends AlipayObject {

	private static final long serialVersionUID = 6212967468316245546L;

	/**
	 * 商家在配送公司的账户的审核说明.
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
	 * 门店状态，AUDITING:审核中，AUDIT_REJECT:审核驳回，VALID:已生效，UPDATING:更新中，WAIT_CREATE:待开通(存量门店若需要支持后面新增的配送公司，需要调用门店更新接口发起申请)
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
