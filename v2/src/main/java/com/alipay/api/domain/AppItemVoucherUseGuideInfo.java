package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券核销引导
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:31
 */
public class AppItemVoucherUseGuideInfo extends AlipayObject {

	private static final long serialVersionUID = 3653383899452617412L;

	/**
	 * 小程序核销详情
	 */
	@ApiField("app_item_mini_app_use_guide_info")
	private AppItemMiniAppUseGuideInfo appItemMiniAppUseGuideInfo;

	/**
	 * 【描述】核销引导模式；根据不同引导模式，决定用户在支付宝卡包中使用优惠券的跳转页面。“标准商品列表”模式，跳转至可用券商品的汇总列表页；“小程序线上核销”模式，则跳转至商家提供的小程序页面，需要结合mini_app_url字段使用。
【枚举值】
● 标准商品列表：STANDARD_ITEM_LIST
● 小程序线上核销：MINI_APP
	 */
	@ApiListField("use_guide_mode")
	@ApiField("string")
	private List<String> useGuideMode;

	public AppItemMiniAppUseGuideInfo getAppItemMiniAppUseGuideInfo() {
		return this.appItemMiniAppUseGuideInfo;
	}
	public void setAppItemMiniAppUseGuideInfo(AppItemMiniAppUseGuideInfo appItemMiniAppUseGuideInfo) {
		this.appItemMiniAppUseGuideInfo = appItemMiniAppUseGuideInfo;
	}

	public List<String> getUseGuideMode() {
		return this.useGuideMode;
	}
	public void setUseGuideMode(List<String> useGuideMode) {
		this.useGuideMode = useGuideMode;
	}

}
