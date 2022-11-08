package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 监管专户信息
 *
 * @author auto create
 * @since 1.0, 2022-01-18 16:06:30
 */
public class MonitorInfo extends AlipayObject {

	private static final long serialVersionUID = 3833865397327257541L;

	/**
	 * 监管户名
	 */
	@ApiField("monitor_account_name")
	private String monitorAccountName;

	/**
	 * 监管户号
	 */
	@ApiField("monitor_account_no")
	private String monitorAccountNo;

	/**
	 * 监管户所在银行联行号
	 */
	@ApiField("monitor_bank_code")
	private String monitorBankCode;

	public String getMonitorAccountName() {
		return this.monitorAccountName;
	}
	public void setMonitorAccountName(String monitorAccountName) {
		this.monitorAccountName = monitorAccountName;
	}

	public String getMonitorAccountNo() {
		return this.monitorAccountNo;
	}
	public void setMonitorAccountNo(String monitorAccountNo) {
		this.monitorAccountNo = monitorAccountNo;
	}

	public String getMonitorBankCode() {
		return this.monitorBankCode;
	}
	public void setMonitorBankCode(String monitorBankCode) {
		this.monitorBankCode = monitorBankCode;
	}

}
