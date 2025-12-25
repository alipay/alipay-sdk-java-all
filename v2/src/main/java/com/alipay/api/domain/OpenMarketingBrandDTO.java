package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌信息
 *
 * @author auto create
 * @since 1.0, 2025-11-06 17:01:31
 */
public class OpenMarketingBrandDTO extends AlipayObject {

	private static final long serialVersionUID = 5589427372537747898L;

	/**
	 * 品牌ID
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
