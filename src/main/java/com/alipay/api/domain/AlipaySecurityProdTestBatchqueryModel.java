package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 啊啊
 *
 * @author auto create
 * @since 1.0, 2018-10-24 22:09:39
 */
public class AlipaySecurityProdTestBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4567798725497597944L;

	/**
	 * afd
	 */
	@ApiField("aaa")
	private String aaa;

	public String getAaa() {
		return this.aaa;
	}
	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

}
