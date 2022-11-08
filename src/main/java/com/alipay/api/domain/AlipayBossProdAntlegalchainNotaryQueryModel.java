package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询合同存证信息
 *
 * @author auto create
 * @since 1.0, 2022-07-07 18:58:36
 */
public class AlipayBossProdAntlegalchainNotaryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6365916548344581524L;

	/**
	 * 业务应用英文名
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 业务唯一流水id，业务数据请求唯一标识
	 */
	@ApiField("business_unique_id")
	private String businessUniqueId;

	/**
	 * 业务系统被分配的密钥key
	 */
	@ApiField("token_key")
	private String tokenKey;

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getBusinessUniqueId() {
		return this.businessUniqueId;
	}
	public void setBusinessUniqueId(String businessUniqueId) {
		this.businessUniqueId = businessUniqueId;
	}

	public String getTokenKey() {
		return this.tokenKey;
	}
	public void setTokenKey(String tokenKey) {
		this.tokenKey = tokenKey;
	}

}
