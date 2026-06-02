package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店主题样式配置
 *
 * @author auto create
 * @since 1.0, 2026-04-29 14:57:48
 */
public class HotelThemeVO extends AlipayObject {

	private static final long serialVersionUID = 4449882235743527744L;

	/**
	 * 背景颜色
	 */
	@ApiField("hotelmind_bg")
	private String hotelmindBg;

	/**
	 * 主按钮文字颜色
	 */
	@ApiField("hotelmind_btn_text")
	private String hotelmindBtnText;

	/**
	 * 标题文字颜色、按钮文字颜色、边框颜色、主按钮颜色
	 */
	@ApiField("hotelmind_title")
	private String hotelmindTitle;

	/**
	 * 智能体形象图片链接
	 */
	@ApiField("person_logo")
	private String personLogo;

	public String getHotelmindBg() {
		return this.hotelmindBg;
	}
	public void setHotelmindBg(String hotelmindBg) {
		this.hotelmindBg = hotelmindBg;
	}

	public String getHotelmindBtnText() {
		return this.hotelmindBtnText;
	}
	public void setHotelmindBtnText(String hotelmindBtnText) {
		this.hotelmindBtnText = hotelmindBtnText;
	}

	public String getHotelmindTitle() {
		return this.hotelmindTitle;
	}
	public void setHotelmindTitle(String hotelmindTitle) {
		this.hotelmindTitle = hotelmindTitle;
	}

	public String getPersonLogo() {
		return this.personLogo;
	}
	public void setPersonLogo(String personLogo) {
		this.personLogo = personLogo;
	}

}
