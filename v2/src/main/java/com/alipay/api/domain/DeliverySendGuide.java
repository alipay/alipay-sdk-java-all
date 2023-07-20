package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广投放引导
 *
 * @author auto create
 * @since 1.0, 2023-06-29 12:29:07
 */
public class DeliverySendGuide extends AlipayObject {

	private static final long serialVersionUID = 2682626163584728221L;

	/**
	 * 引导链接，从支付宝公域跳转到服务商(商户)承接页的引导链接。
	 */
	@ApiField("delivery_guide_url")
	private String deliveryGuideUrl;

	public String getDeliveryGuideUrl() {
		return this.deliveryGuideUrl;
	}
	public void setDeliveryGuideUrl(String deliveryGuideUrl) {
		this.deliveryGuideUrl = deliveryGuideUrl;
	}

}
