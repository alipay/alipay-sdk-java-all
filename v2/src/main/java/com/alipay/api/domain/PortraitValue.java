package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 棋盘人群洞察画像值
 *
 * @author auto create
 * @since 1.0, 2023-01-12 20:57:15
 */
public class PortraitValue extends AlipayObject {

	private static final long serialVersionUID = 3792879644948584372L;

	/**
	 * 棋盘人群画像值对应的数量
	 */
	@ApiField("num")
	private String num;

	/**
	 * 棋盘人群画像值
	 */
	@ApiField("value")
	private String value;

	public String getNum() {
		return this.num;
	}
	public void setNum(String num) {
		this.num = num;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
