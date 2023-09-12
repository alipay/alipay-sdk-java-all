package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AR里子账号及其绑定的信息集合
 *
 * @author auto create
 * @since 1.0, 2020-08-31 19:43:23
 */
public class SubAccountAndBindDTO extends AlipayObject {

	private static final long serialVersionUID = 6163544543794174668L;

	/**
	 * 银行子账号详情
	 */
	@ApiField("bank_sub_account_base_info_dto")
	private BankSubAccountBaseInfoDTO bankSubAccountBaseInfoDto;

	/**
	 * 业务唯一ID值。由业务方确保在同一个维度下值唯一。
	 */
	@ApiField("biz_unique_id")
	private String bizUniqueId;

	/**
	 * 业务唯一ID类型。用于识别子账号的不同维度。由AR平台预先分配
	 */
	@ApiField("biz_unique_type")
	private String bizUniqueType;

	/**
	 * 机构ID，如ZL6、ZL7
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 商户结算pid
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	public BankSubAccountBaseInfoDTO getBankSubAccountBaseInfoDto() {
		return this.bankSubAccountBaseInfoDto;
	}
	public void setBankSubAccountBaseInfoDto(BankSubAccountBaseInfoDTO bankSubAccountBaseInfoDto) {
		this.bankSubAccountBaseInfoDto = bankSubAccountBaseInfoDto;
	}

	public String getBizUniqueId() {
		return this.bizUniqueId;
	}
	public void setBizUniqueId(String bizUniqueId) {
		this.bizUniqueId = bizUniqueId;
	}

	public String getBizUniqueType() {
		return this.bizUniqueType;
	}
	public void setBizUniqueType(String bizUniqueType) {
		this.bizUniqueType = bizUniqueType;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

}
