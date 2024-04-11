package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 展位疲劳度上报
 *
 * @author auto create
 * @since 1.0, 2023-05-22 16:29:34
 */
public class AntfortuneStockDeliveryFatigueSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7119787551867794281L;

	/**
	 * 签约协议号（uid在某个机构处的唯一标识）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 投放疲劳度内容，包含展位码、行为以及疲劳度配置信息
	 */
	@ApiListField("delivery_fatigue")
	@ApiField("delivery_fatigue")
	private List<DeliveryFatigue> deliveryFatigue;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public List<DeliveryFatigue> getDeliveryFatigue() {
		return this.deliveryFatigue;
	}
	public void setDeliveryFatigue(List<DeliveryFatigue> deliveryFatigue) {
		this.deliveryFatigue = deliveryFatigue;
	}

}
