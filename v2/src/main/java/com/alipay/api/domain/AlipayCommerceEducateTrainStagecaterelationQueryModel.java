package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询学段类目关系
 *
 * @author auto create
 * @since 1.0, 2023-04-14 10:15:30
 */
public class AlipayCommerceEducateTrainStagecaterelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5539941671749663974L;

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
