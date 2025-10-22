package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IDP解决方案查询商品基本信息
 *
 * @author auto create
 * @since 1.0, 2023-09-26 17:30:18
 */
public class AlipayDataIotdataIdpsolutionProductinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4593816687731352573L;

	/**
	 * 商品编码
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
