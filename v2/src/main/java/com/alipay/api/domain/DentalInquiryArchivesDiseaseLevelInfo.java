package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口腔健康档案病症严重程度对象
 *
 * @author auto create
 * @since 1.0, 2025-05-27 17:09:02
 */
public class DentalInquiryArchivesDiseaseLevelInfo extends AlipayObject {

	private static final long serialVersionUID = 3672494727512199565L;

	/**
	 * 描述病症严重程度的数字化表达
	 */
	@ApiField("level_code")
	private String levelCode;

	/**
	 * 描述病症名称
	 */
	@ApiField("level_name")
	private String levelName;

	/**
	 * 描述病症严重程度的文字描述
	 */
	@ApiField("level_text")
	private String levelText;

	public String getLevelCode() {
		return this.levelCode;
	}
	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

	public String getLevelName() {
		return this.levelName;
	}
	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getLevelText() {
		return this.levelText;
	}
	public void setLevelText(String levelText) {
		this.levelText = levelText;
	}

}
