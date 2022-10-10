package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图片消息数据
 *
 * @author auto create
 * @since 1.0, 2022-01-24 19:53:23
 */
public class ImageTemplateData extends AlipayObject {

	private static final long serialVersionUID = 6222584657812945583L;

	/**
	 * 图片高度
	 */
	@ApiField("h")
	private String h;

	/**
	 * 图片的url地址
	 */
	@ApiField("i")
	private String i;

	/**
	 * 原图大小
	 */
	@ApiField("s")
	private String s;

	/**
	 * 图片宽度
	 */
	@ApiField("w")
	private String w;

	public String getH() {
		return this.h;
	}
	public void setH(String h) {
		this.h = h;
	}

	public String getI() {
		return this.i;
	}
	public void setI(String i) {
		this.i = i;
	}

	public String getS() {
		return this.s;
	}
	public void setS(String s) {
		this.s = s;
	}

	public String getW() {
		return this.w;
	}
	public void setW(String w) {
		this.w = w;
	}

}
