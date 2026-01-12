package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通用页面配置
 *
 * @author auto create
 * @since 1.0, 2025-12-31 17:50:54
 */
public class CommonPageConfig extends AlipayObject {

	private static final long serialVersionUID = 5557136553634872642L;

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
