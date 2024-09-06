package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新增文档验证
 *
 * @author auto create
 * @since 1.0, 2020-02-07 13:47:07
 */
public class AlipayOpenOperationSsffDeeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7885731655946412623L;

	/**
	 * 1
	 */
	@ApiField("df")
	private String df;

	public String getDf() {
		return this.df;
	}
	public void setDf(String df) {
		this.df = df;
	}

}
