package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序收藏tips引导投放修改
 *
 * @author auto create
 * @since 1.0, 2023-06-28 10:07:52
 */
public class AlipayOpenMiniTipsDeliveryModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8217674284597776941L;

	/**
	 * 收藏引导投放活动ID
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 活动投放操作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
