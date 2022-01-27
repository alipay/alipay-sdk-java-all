package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金存管账户开户接口
 *
 * @author auto create
 * @since 1.0, 2022-01-13 16:44:01
 */
public class AlipayFincoreFunddsAccountWitnessCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7665496737852962977L;

	/**
	 * COMPANY-公司，INDIVIDUAL-个人
	 */
	@ApiField("account_principal_type")
	private String accountPrincipalType;

	/**
	 * 账户类型,目前仅支持ENTRUST_SUB_ACC子户
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 可变ID，用来识别同一个user_id账户下面多维度账户。托管根据uid、productChannel、productCode、vid共同确定子户
	 */
	@ApiField("external_entity_id")
	private String externalEntityId;

	/**
	 * 开户备注
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
	 * 用户id或二级商户smid，子户维度。2088开头16位数字。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountPrincipalType() {
		return this.accountPrincipalType;
	}
	public void setAccountPrincipalType(String accountPrincipalType) {
		this.accountPrincipalType = accountPrincipalType;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getExternalEntityId() {
		return this.externalEntityId;
	}
	public void setExternalEntityId(String externalEntityId) {
		this.externalEntityId = externalEntityId;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
