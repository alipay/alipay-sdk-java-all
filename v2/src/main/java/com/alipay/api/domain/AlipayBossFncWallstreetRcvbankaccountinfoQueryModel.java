package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询收款银行账号信息
 *
 * @author auto create
 * @since 1.0, 2024-03-07 11:06:13
 */
public class AlipayBossFncWallstreetRcvbankaccountinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7759854579145257656L;

	/**
	 * 币种编码
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * 组织ID
	 */
	@ApiField("org_id")
	private Long orgId;

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Long getOrgId() {
		return this.orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

}
