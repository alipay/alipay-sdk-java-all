package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小票信息
 *
 * @author auto create
 * @since 1.0, 2022-02-21 14:27:13
 */
public class ExpenseRecepitInfo extends AlipayObject {

	private static final long serialVersionUID = 8882869838433459391L;

	/**
	 * 商品单价（单位：分）
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 所属员工uid
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 商品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * product_count
	 */
	@ApiField("product_count")
	private Long productCount;

	/**
	 * 商品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 商品总价（单位：分）
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/**
	 * 凭证id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Long getProductCount() {
		return this.productCount;
	}
	public void setProductCount(Long productCount) {
		this.productCount = productCount;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
