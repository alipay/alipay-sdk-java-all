package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包外部账户信息
 *
 * @author auto create
 * @since 1.0, 2026-01-22 15:10:42
 */
public class WalletExternalAccount extends AlipayObject {

	private static final long serialVersionUID = 6682593573229555178L;

	/**
	 * 外部账户id
	 */
	@ApiField("external_account_no")
	private String externalAccountNo;

	/**
	 * 外部账户类型
	 */
	@ApiField("external_account_type")
	private String externalAccountType;

	/**
	 * 状态:
成功为E
删除为D
	 */
	@ApiField("status")
	private String status;

	public String getExternalAccountNo() {
		return this.externalAccountNo;
	}
	public void setExternalAccountNo(String externalAccountNo) {
		this.externalAccountNo = externalAccountNo;
	}

	public String getExternalAccountType() {
		return this.externalAccountType;
	}
	public void setExternalAccountType(String externalAccountType) {
		this.externalAccountType = externalAccountType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
