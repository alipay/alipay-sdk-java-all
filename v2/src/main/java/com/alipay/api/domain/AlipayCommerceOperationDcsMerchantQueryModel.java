package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户门店信息获取
 *
 * @author auto create
 * @since 1.0, 2024-01-23 15:22:12
 */
public class AlipayCommerceOperationDcsMerchantQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7775257276757519577L;

	/**
	 * 品牌标识
	 */
	@ApiField("brander_id")
	private String branderId;

	public String getBranderId() {
		return this.branderId;
	}
	public void setBranderId(String branderId) {
		this.branderId = branderId;
	}

}
