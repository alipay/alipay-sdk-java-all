package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码凭证详情
 *
 * @author auto create
 * @since 1.0, 2022-08-18 23:43:37
 */
public class EcVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 5369418222146429986L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 员工ID，汇总发票该字段无效
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 员工支付宝UID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 凭证内容
	 */
	@ApiField("voucher_content")
	private String voucherContent;

	/**
	 * 凭证创建时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("voucher_date")
	private String voucherDate;

	/**
	 * 凭证ID，幂等用
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 凭证来源
	 */
	@ApiField("voucher_source")
	private String voucherSource;

	/**
	 * 凭证类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVoucherContent() {
		return this.voucherContent;
	}
	public void setVoucherContent(String voucherContent) {
		this.voucherContent = voucherContent;
	}

	public String getVoucherDate() {
		return this.voucherDate;
	}
	public void setVoucherDate(String voucherDate) {
		this.voucherDate = voucherDate;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherSource() {
		return this.voucherSource;
	}
	public void setVoucherSource(String voucherSource) {
		this.voucherSource = voucherSource;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
