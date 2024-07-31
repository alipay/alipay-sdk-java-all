package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核身初始化业务数据
 *
 * @author auto create
 * @since 1.0, 2023-06-30 10:21:24
 */
public class InitBizData extends AlipayObject {

	private static final long serialVersionUID = 2697496915434566618L;

	/**
	 * 不可用核身产品
	 */
	@ApiField("un_valid_prods")
	private String unValidProds;

	public String getUnValidProds() {
		return this.unValidProds;
	}
	public void setUnValidProds(String unValidProds) {
		this.unValidProds = unValidProds;
	}

}
