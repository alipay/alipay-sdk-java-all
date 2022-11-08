package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户信息查询
 *
 * @author auto create
 * @since 1.0, 2022-01-13 16:42:30
 */
public class AlipayFincoreFunddsAccountWitnessQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7323125299412914141L;

	/**
	 * 监管户不需要填写,子户必填，账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账户类型,支持监管户(SUPERVISED_ACC)和子户(ENTRUST_SUB_ACC)
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 签约产品码,唯一,区分资金存管服务产品类型
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 监管户不需要填写,子户必填。
蚂蚁统一会员ID,用户id或二级商户smid，子户维度。2088开头16位数字。
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
