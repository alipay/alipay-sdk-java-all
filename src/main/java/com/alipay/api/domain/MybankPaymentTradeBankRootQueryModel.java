package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 总行查询
 *
 * @author auto create
 * @since 1.0, 2019-12-10 21:55:10
 */
public class MybankPaymentTradeBankRootQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8611113893754273553L;

	/**
	 * 支持全称，或部分名称

如果不传名称，系统默认将返回热门银行，如果用户期望的银行不是热门银行，可以建议用户输入银行名称进行查询。
	 */
	@ApiField("bank_name")
	private String bankName;

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
