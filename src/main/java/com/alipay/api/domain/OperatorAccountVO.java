package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁操作员关联账号信息
 *
 * @author auto create
 * @since 1.0, 2020-08-20 19:35:43
 */
public class OperatorAccountVO extends AlipayObject {

	private static final long serialVersionUID = 7133636455774418385L;

	/**
	 * 关联账号ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 关联账号类型。枚举值参考OperatorRelAccountTypeEnum
account_type=01，则account_id为支付宝userId
account_type=02，则account_id为钉钉账号id
account_type=03，则account_id为支付宝oid
	 */
	@ApiField("account_type")
	private String accountType;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

}
