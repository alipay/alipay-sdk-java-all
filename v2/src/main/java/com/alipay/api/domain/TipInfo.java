package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提示信息
 *
 * @author auto create
 * @since 1.0, 2023-07-14 16:19:33
 */
public class TipInfo extends AlipayObject {

	private static final long serialVersionUID = 2726971155967468328L;

	/**
	 * 提示内容
	 */
	@ApiField("info")
	private String info;

	/**
	 * 提示类型
	 */
	@ApiField("type")
	private String type;

	public String getInfo() {
		return this.info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
