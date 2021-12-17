package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销投放渠道
 *
 * @author auto create
 * @since 1.0, 2018-01-22 16:20:18
 */
public class InteligentPublishChannel extends AlipayObject {

	private static final long serialVersionUID = 1736797479569398416L;

	/**
	 * 当type为MERCHANT_CROWD时，config需填入口令送的密码和图片，样例如下："config":"{\"PASSWORD\":\"口令送密码\",\"BACKGROUND_LOGO\":\"1T8Pp00AT7eo9NoAJkMR3AAAACMAAQEC\"}"
	 */
	@ApiField("config")
	private String config;

	/**
	 * 扩展信息，无需配置
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 渠道名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 渠道类型，目前支持以下类型：
QR_CODE：二维码投放；
SHORT_LINK：短连接投放；
SHOP_DETAIL：店铺页投放；
PAYMENT_RESULT：支付成功页；
MERCHANT_CROWD：口令送；
URL_WITH_TOKEN：外部发奖活动，
只有活动类型为DIRECT_SEND时才支持；
	 */
	@ApiField("type")
	private String type;

	public String getConfig() {
		return this.config;
	}
	public void setConfig(String config) {
		this.config = config;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
