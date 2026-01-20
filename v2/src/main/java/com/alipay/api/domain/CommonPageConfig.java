package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通用页面配置
 *
 * @author auto create
 * @since 1.0, 2026-01-19 16:47:42
 */
public class CommonPageConfig extends AlipayObject {

	private static final long serialVersionUID = 7736622898796757231L;

	/**
	 * 背景图片
	 */
	@ApiField("background_image")
	private String backgroundImage;

	/**
	 * 半浮层透明度，整数百分比形式
	 */
	@ApiField("float_diaphaneity")
	private Long floatDiaphaneity;

	public String getBackgroundImage() {
		return this.backgroundImage;
	}
	public void setBackgroundImage(String backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	public Long getFloatDiaphaneity() {
		return this.floatDiaphaneity;
	}
	public void setFloatDiaphaneity(Long floatDiaphaneity) {
		this.floatDiaphaneity = floatDiaphaneity;
	}

}
