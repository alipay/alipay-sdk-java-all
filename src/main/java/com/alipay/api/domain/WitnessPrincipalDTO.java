package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产主体模型
 *
 * @author auto create
 * @since 1.0, 2022-01-05 10:54:39
 */
public class WitnessPrincipalDTO extends AlipayObject {

	private static final long serialVersionUID = 1669689113492814638L;

	/**
	 * 主体账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 主体id(uid,smid等)
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 主体类型
SUPERVISED_ACC:资金监管账户,
ENTRUST_SUB_ACC:托管子户,
SIGN_ALIPAY_ACC:签约支付宝自有余额账户
	 */
	@ApiField("principal_type")
	private String principalType;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

}
