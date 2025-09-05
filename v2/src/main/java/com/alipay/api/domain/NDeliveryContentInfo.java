package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N支付成功页展示内容
 *
 * @author auto create
 * @since 1.0, 2025-02-11 14:47:12
 */
public class NDeliveryContentInfo extends AlipayObject {

	private static final long serialVersionUID = 2597642933354784888L;

	/**
	 * 小程序对象
	 */
	@ApiField("n_delivery_app_content")
	private NDeliveryAppContent nDeliveryAppContent;

	/**
	 * 枚举值：
·MINI_APP_SERVICE：小程序服务
	 */
	@ApiField("n_delivery_content_type")
	private String nDeliveryContentType;

	/**
	 * 小程序服务对客内容表达
	 */
	@ApiField("n_delivery_display_info")
	private NDeliveryDisplayInfo nDeliveryDisplayInfo;

	public NDeliveryAppContent getnDeliveryAppContent() {
		return this.nDeliveryAppContent;
	}
	public void setnDeliveryAppContent(NDeliveryAppContent nDeliveryAppContent) {
		this.nDeliveryAppContent = nDeliveryAppContent;
	}

	public String getnDeliveryContentType() {
		return this.nDeliveryContentType;
	}
	public void setnDeliveryContentType(String nDeliveryContentType) {
		this.nDeliveryContentType = nDeliveryContentType;
	}

	public NDeliveryDisplayInfo getnDeliveryDisplayInfo() {
		return this.nDeliveryDisplayInfo;
	}
	public void setnDeliveryDisplayInfo(NDeliveryDisplayInfo nDeliveryDisplayInfo) {
		this.nDeliveryDisplayInfo = nDeliveryDisplayInfo;
	}

}
