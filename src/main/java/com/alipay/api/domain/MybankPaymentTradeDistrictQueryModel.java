package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行政地区编码查询
 *
 * @author auto create
 * @since 1.0, 2019-11-26 11:57:12
 */
public class MybankPaymentTradeDistrictQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2199544625816746713L;

	/**
	 * 父级行政地区编码。
不填则默认查询省级行政地区编码，支持省市县三级查询。
	 */
	@ApiField("parent_code")
	private String parentCode;

	public String getParentCode() {
		return this.parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

}
