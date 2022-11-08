package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询账户余额
 *
 * @author auto create
 * @since 1.0, 2021-12-31 16:34:35
 */
public class AlipayEbppAccountBalanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2669284248293462413L;

	/**
	 * 机构的子户账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 查询余额的日终日期，20211101代表查询2021年11月1日的日终余额
	 */
	@ApiField("date")
	private String date;

	/**
	 * 机构本次调用说明
	 */
	@ApiField("description")
	private String description;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
