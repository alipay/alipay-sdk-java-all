package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家银行托管账户查询接口
 *
 * @author auto create
 * @since 1.0, 2026-04-03 11:37:44
 */
public class AlipayCommerceLifeserviceBankaccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1286135838246994331L;

	/**
	 * 商家账号 2088
	 */
	@ApiField("pid")
	private String pid;

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
