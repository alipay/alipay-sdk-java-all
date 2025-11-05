package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广发放规则
 *
 * @author auto create
 * @since 1.0, 2025-02-11 14:47:12
 */
public class NDeliveryPalyConfig extends AlipayObject {

	private static final long serialVersionUID = 7676268524564871813L;

	/**
	 * 碰一下支付成功页展示的卡片内容
	 */
	@ApiField("n_delivery_content_info")
	private NDeliveryContentInfo nDeliveryContentInfo;

	/**
	 * 枚举值：
·支付即送（任意支付均可，无订单金额限制）
	 */
	@ApiField("n_delivery_send_mode")
	private String nDeliverySendMode;

	public NDeliveryContentInfo getnDeliveryContentInfo() {
		return this.nDeliveryContentInfo;
	}
	public void setnDeliveryContentInfo(NDeliveryContentInfo nDeliveryContentInfo) {
		this.nDeliveryContentInfo = nDeliveryContentInfo;
	}

	public String getnDeliverySendMode() {
		return this.nDeliverySendMode;
	}
	public void setnDeliverySendMode(String nDeliverySendMode) {
		this.nDeliverySendMode = nDeliverySendMode;
	}

}
