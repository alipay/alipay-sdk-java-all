package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图片大小
 *
 * @author auto create
 * @since 1.0, 2024-07-05 10:28:52
 */
public class NbDrawSize extends AlipayObject {

	private static final long serialVersionUID = 4344486894735115398L;

	/**
	 * 图片高度，单位像素
	 */
	@ApiField("height")
	private Long height;

	/**
	 * 图片宽度，单位像素
	 */
	@ApiField("width")
	private Long width;

	public Long getHeight() {
		return this.height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}

	public Long getWidth() {
		return this.width;
	}
	public void setWidth(Long width) {
		this.width = width;
	}

}
