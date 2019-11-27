package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试查询
 *
 * @author auto create
 * @since 1.0, 2018-11-16 16:37:08
 */
public class MybankFinanceTestProductQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5175821139484672391L;

	/**
	 * 23
	 */
	@ApiField("image")
	private String image;

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

}
