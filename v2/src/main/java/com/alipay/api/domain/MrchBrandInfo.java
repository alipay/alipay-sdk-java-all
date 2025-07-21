package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌信息
 *
 * @author auto create
 * @since 1.0, 2024-10-09 11:27:00
 */
public class MrchBrandInfo extends AlipayObject {

	private static final long serialVersionUID = 8538633411939715697L;

	/**
	 * 具体值需由支付宝分配
	 */
	@ApiField("brand_id")
	private String brandId;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

}
