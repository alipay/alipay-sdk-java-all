package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IDP解决方案查询商品基本信息
 *
 * @author auto create
 * @since 1.0, 2023-09-20 14:49:42
 */
public class AlipayDataIotdataIdpsolutionProductinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2339464381446945373L;

	/**
	 * 商品编码+商品查询
	 */
	@ApiField("bar_code")
	private String barCode;

	public String getBarCode() {
		return this.barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

}
