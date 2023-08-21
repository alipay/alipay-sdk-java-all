package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单优惠信息
 *
 * @author auto create
 * @since 1.0, 2023-07-17 10:39:33
 */
public class PromoDetailInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4324988586319892326L;

	/**
	 * 优惠前置咨询组件返回的优惠活动咨询ID
	 */
	@ApiField("activity_consult_id")
	private String activityConsultId;

	public String getActivityConsultId() {
		return this.activityConsultId;
	}
	public void setActivityConsultId(String activityConsultId) {
		this.activityConsultId = activityConsultId;
	}

}
