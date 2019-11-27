package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户信息
 *
 * @author auto create
 * @since 1.0, 2017-09-01 12:48:14
 */
public class AccountDetail extends AlipayObject {

	private static final long serialVersionUID = 1646585389551134731L;

	/**
	 * 账户创建时间
	 */
	@ApiField("created_date")
	private Date createdDate;

	/**
	 * 描述
	 */
	@ApiField("created_ip")
	private String createdIp;

	public Date getCreatedDate() {
		return this.createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedIp() {
		return this.createdIp;
	}
	public void setCreatedIp(String createdIp) {
		this.createdIp = createdIp;
	}

}
