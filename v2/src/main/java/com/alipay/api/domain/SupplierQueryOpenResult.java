package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于查询供应商信息
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:37:52
 */
public class SupplierQueryOpenResult extends AlipayObject {

	private static final long serialVersionUID = 5346148541612353176L;

	/**
	 * 支付宝账号类型
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 供应商支付宝账号
	 */
	@ApiField("supplier_account_no")
	private String supplierAccountNo;

	/**
	 * 供应商姓名
	 */
	@ApiField("supplier_name")
	private String supplierName;

	/**
	 * 供应商联系电话
	 */
	@ApiField("supplier_phone")
	private String supplierPhone;

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getSupplierAccountNo() {
		return this.supplierAccountNo;
	}
	public void setSupplierAccountNo(String supplierAccountNo) {
		this.supplierAccountNo = supplierAccountNo;
	}

	public String getSupplierName() {
		return this.supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierPhone() {
		return this.supplierPhone;
	}
	public void setSupplierPhone(String supplierPhone) {
		this.supplierPhone = supplierPhone;
	}

}
