package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过uid查询用户信息
 *
 * @author auto create
 * @since 1.0, 2023-10-30 11:40:16
 */
public class AlipayIserviceIsresourceUserquerybyuidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8223686575131845249L;

	/**
	 * 客服小二的2088id
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 是否查询用户关联账户信息
	 */
	@ApiField("query_ref_account")
	private Boolean queryRefAccount;

	/**
	 * 是否查询用户角色信息
	 */
	@ApiField("query_role")
	private Boolean queryRole;

	/**
	 * 是否查询服务
	 */
	@ApiField("query_serve")
	private Boolean queryServe;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public Boolean getQueryRefAccount() {
		return this.queryRefAccount;
	}
	public void setQueryRefAccount(Boolean queryRefAccount) {
		this.queryRefAccount = queryRefAccount;
	}

	public Boolean getQueryRole() {
		return this.queryRole;
	}
	public void setQueryRole(Boolean queryRole) {
		this.queryRole = queryRole;
	}

	public Boolean getQueryServe() {
		return this.queryServe;
	}
	public void setQueryServe(Boolean queryServe) {
		this.queryServe = queryServe;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
