package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 超级导购券包信息
 *
 * @author auto create
 * @since 1.0, 2022-06-27 14:24:44
 */
public class YunTaskVoucherPackageInfo extends AlipayObject {

	private static final long serialVersionUID = 8844519879241993348L;

	/**
	 * 券包名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 券包id
	 */
	@ApiField("product_id")
	private String productId;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

}
