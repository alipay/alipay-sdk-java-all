package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌删除接口
 *
 * @author auto create
 * @since 1.0, 2017-08-30 10:55:14
 */
public class KoubeiItemExtitemBrandDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6536653174125564243L;

	/**
	 * 品牌编码
	 */
	@ApiField("brand_code")
	private String brandCode;

	public String getBrandCode() {
		return this.brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

}
