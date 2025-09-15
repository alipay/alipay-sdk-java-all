package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费贷还款机构未能关联数据部分
 *
 * @author auto create
 * @since 1.0, 2024-08-06 11:22:26
 */
public class ConsumerLoanNotMatchData extends AlipayObject {

	private static final long serialVersionUID = 4338992448592158577L;

	/**
	 * 未能匹配上的用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 未能匹配上的用户手机号
	 */
	@ApiField("phone")
	private String phone;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
