package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改账户状态
 *
 * @author auto create
 * @since 1.0, 2022-08-30 15:13:12
 */
public class AlipayFincoreFunddsAccountWitnessModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6578743735716981879L;

	/**
	 * 必填。账号,即开户时返回的asttshipcore账号。
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账户类型,ENTRUST_SUB_ACC目前仅支持子户
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 必填，操作员，调用方appname
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 签约产品码,唯一,区分资金存管服务产品类型
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 必填，账户状态，C：注销状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 必填，用户id或二级商户smid，子户维度。2088开头16位数字
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
