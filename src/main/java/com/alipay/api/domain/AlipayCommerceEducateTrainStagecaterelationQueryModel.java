package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询学段类目关系
 *
 * @author auto create
 * @since 1.0, 2022-10-26 11:09:08
 */
public class AlipayCommerceEducateTrainStagecaterelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5269125917483217179L;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 子产品码
	 */
	@ApiField("sub_product_code")
	private String subProductCode;

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSubProductCode() {
		return this.subProductCode;
	}
	public void setSubProductCode(String subProductCode) {
		this.subProductCode = subProductCode;
	}

}
