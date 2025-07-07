package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝直连商户进件检查
 *
 * @author auto create
 * @since 1.0, 2024-12-25 19:47:51
 */
public class AntMerchantExpandDirectAgentCheckModel extends AlipayObject {

	private static final long serialVersionUID = 6679383966492139682L;

	/**
	 * 商机线索ID，从支付宝Leads下发接口中获取
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 商户支付宝账号，一般为手机号或邮箱
	 */
	@ApiField("merchant_account")
	private String merchantAccount;

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	public String getMerchantAccount() {
		return this.merchantAccount;
	}
	public void setMerchantAccount(String merchantAccount) {
		this.merchantAccount = merchantAccount;
	}

}
