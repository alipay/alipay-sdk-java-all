package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗商家商品库类目查询
 *
 * @author auto create
 * @since 1.0, 2022-08-11 18:46:39
 */
public class AlipayPcreditHuabeiGoodsCategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3188156575113955743L;

	/**
	 * 来源识别标识码
	 */
	@ApiField("biz_src")
	private String bizSrc;

	public String getBizSrc() {
		return this.bizSrc;
	}
	public void setBizSrc(String bizSrc) {
		this.bizSrc = bizSrc;
	}

}
