package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一体化作业商户小程序信息
 *
 * @author auto create
 * @since 1.0, 2026-01-09 18:33:09
 */
public class InteOpMiniAppInfo extends AlipayObject {

	private static final long serialVersionUID = 6227553595395539738L;

	/**
	 * 被签约商家下任意小程序APPID ID编号。
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序名称。
	 */
	@ApiField("mini_app_name")
	private String miniAppName;

	/**
	 * 上传商家小程序截图信息，最小5KB ，最大5M（暂不限制图片宽高），图片格式必须为：png、bmp、gif、jpg、jpeg。传入 alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("mini_app_screenshot")
	private String miniAppScreenshot;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getMiniAppName() {
		return this.miniAppName;
	}
	public void setMiniAppName(String miniAppName) {
		this.miniAppName = miniAppName;
	}

	public String getMiniAppScreenshot() {
		return this.miniAppScreenshot;
	}
	public void setMiniAppScreenshot(String miniAppScreenshot) {
		this.miniAppScreenshot = miniAppScreenshot;
	}

}
