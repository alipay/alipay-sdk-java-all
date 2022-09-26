package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 11121212
 *
 * @author auto create
 * @since 1.0, 2022-07-22 17:19:01
 */
public class AntOcrTesConsultModel extends AlipayObject {

	private static final long serialVersionUID = 8594971473969294697L;

	/**
	 * 111
	 */
	@ApiField("out")
	private ActivityGoods out;

	/**
	 * 1
	 */
	@ApiField("yyy")
	private String yyy;

	public ActivityGoods getOut() {
		return this.out;
	}
	public void setOut(ActivityGoods out) {
		this.out = out;
	}

	public String getYyy() {
		return this.yyy;
	}
	public void setYyy(String yyy) {
		this.yyy = yyy;
	}

}
