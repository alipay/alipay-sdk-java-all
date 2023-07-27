package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗分期商家贴息活动查询接口
 *
 * @author auto create
 * @since 1.0, 2023-07-17 11:32:39
 */
public class AlipayPcreditHuabeiMerchantActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1189548319747747557L;

	/**
	 * 模版ID
	 */
	@ApiField("aggr_id")
	private String aggrId;

	/**
	 * MERCHANT_INTEREST_SUBSIDY_MIXED 代表新活动，模版ID以mixed开头；其他为 MERCHANT_INTEREST_SUBSIDY_THIRDPARTY 代表老活动
	 */
	@ApiField("product_id")
	private String productId;

	public String getAggrId() {
		return this.aggrId;
	}
	public void setAggrId(String aggrId) {
		this.aggrId = aggrId;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

}
