package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 赊呗分月付用户准入查询
 *
 * @author auto create
 * @since 1.0, 2022-04-13 15:05:45
 */
public class MybankCreditLoanapplyFinleaseConsultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4697542631222451438L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("userid")
	private String userid;

	public String getUserid() {
		return this.userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

}
