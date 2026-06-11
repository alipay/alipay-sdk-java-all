package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 正常页配置
 *
 * @author auto create
 * @since 1.0, 2026-03-24 11:07:45
 */
public class VerifyConfigCommonPageConfig extends AlipayObject {

	private static final long serialVersionUID = 8784122181264231374L;

	/**
	 * 背景图片
	 */
	@ApiField("back_ground_image")
	private String backGroundImage;

	/**
	 * 半浮层透明度，格式为整数百分比
	 */
	@ApiField("float_diaphaneity")
	private Long floatDiaphaneity;

	public String getBackGroundImage() {
		return this.backGroundImage;
	}
	public void setBackGroundImage(String backGroundImage) {
		this.backGroundImage = backGroundImage;
	}

	public Long getFloatDiaphaneity() {
		return this.floatDiaphaneity;
	}
	public void setFloatDiaphaneity(Long floatDiaphaneity) {
		this.floatDiaphaneity = floatDiaphaneity;
	}

}
