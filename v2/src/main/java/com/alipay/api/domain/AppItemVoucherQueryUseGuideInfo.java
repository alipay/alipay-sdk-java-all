package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序引导查询信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:19
 */
public class AppItemVoucherQueryUseGuideInfo extends AlipayObject {

	private static final long serialVersionUID = 3117831748632635882L;

	/**
	 * 小程序核销详情
	 */
	@ApiField("app_item_mini_app_use_guide_info")
	private AppItemMiniAppQueryUseGuideInfo appItemMiniAppUseGuideInfo;

	/**
	 * 核销引导模式
	 */
	@ApiListField("use_guide_mode")
	@ApiField("string")
	private List<String> useGuideMode;

	public AppItemMiniAppQueryUseGuideInfo getAppItemMiniAppUseGuideInfo() {
		return this.appItemMiniAppUseGuideInfo;
	}
	public void setAppItemMiniAppUseGuideInfo(AppItemMiniAppQueryUseGuideInfo appItemMiniAppUseGuideInfo) {
		this.appItemMiniAppUseGuideInfo = appItemMiniAppUseGuideInfo;
	}

	public List<String> getUseGuideMode() {
		return this.useGuideMode;
	}
	public void setUseGuideMode(List<String> useGuideMode) {
		this.useGuideMode = useGuideMode;
	}

}
