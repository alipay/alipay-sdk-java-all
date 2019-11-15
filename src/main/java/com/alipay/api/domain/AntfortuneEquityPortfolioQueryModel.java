package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个基金组合详情查询接口
 *
 * @author auto create
 * @since 1.0, 2019-10-23 10:13:27
 */
public class AntfortuneEquityPortfolioQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4277328745666346335L;

	/**
	 * 组合ID
	 */
	@ApiField("product_id")
	private String productId;

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

}
