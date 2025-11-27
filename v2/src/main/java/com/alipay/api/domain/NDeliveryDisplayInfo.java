package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序服务对客内容表达
 *
 * @author auto create
 * @since 1.0, 2025-02-13 14:37:54
 */
public class NDeliveryDisplayInfo extends AlipayObject {

	private static final long serialVersionUID = 5226137838493349174L;

	/**
	 * 枚举值：
OPEN_DAILY_OPERATION：日常运营模版
OPEN_SALES_PROMOTION：活动促销模版
OPEN_FESTIVE_ATMOSPHERE：节日氛围模版
模板示例见：接入指南-碰一下支付成功页卡片视觉风格
	 */
	@ApiField("card_visual_style")
	private String cardVisualStyle;

	/**
	 * 在碰一下支付成功页卡片上展示的主标题
	 */
	@ApiField("main_title")
	private String mainTitle;

	/**
	 * 在碰一下支付成功页卡片上展示的副标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	public String getCardVisualStyle() {
		return this.cardVisualStyle;
	}
	public void setCardVisualStyle(String cardVisualStyle) {
		this.cardVisualStyle = cardVisualStyle;
	}

	public String getMainTitle() {
		return this.mainTitle;
	}
	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

}
