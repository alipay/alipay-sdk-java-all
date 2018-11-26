package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠活动状态修改
 *
 * @author auto create
 * @since 1.0, 2018-10-17 14:17:50
 */
public class AlipayMarketingCampaignDiscountStatusUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 5276783391459661655L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 状态CAMP_PAUSED：暂停,CAMP_GOING 启动,CAMP_ENDED结束
	 */
	@ApiField("status")
	private String status;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
