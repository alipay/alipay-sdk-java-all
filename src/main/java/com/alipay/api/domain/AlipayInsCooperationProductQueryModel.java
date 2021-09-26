package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险产品查询
 *
 * @author auto create
 * @since 1.0, 2019-08-26 17:24:59
 */
public class AlipayInsCooperationProductQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6497825944117258424L;

	/**
	 * 产品编码;由蚂蚁保险平台分配,商户通过该产品编码投保特定的保险产品
	 */
	@ApiField("prod_code")
	private String prodCode;

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

}
