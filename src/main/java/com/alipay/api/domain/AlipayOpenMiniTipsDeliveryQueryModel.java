package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序收藏tips引导投放详情查询
 *
 * @author auto create
 * @since 1.0, 2022-05-25 20:31:34
 */
public class AlipayOpenMiniTipsDeliveryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7431778123246581243L;

	/**
	 * 收藏引导投放活动ID，查询收藏引导活动必填参数
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

}
