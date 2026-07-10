package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * nfc展会碰一下打卡点位删除接口
 *
 * @author auto create
 * @since 1.0, 2026-05-25 17:58:07
 */
public class AlipayOfflineProviderExpoCheckplaceDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5637793167548739665L;

	/**
	 * 活动code
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 打卡点id
	 */
	@ApiField("place_id")
	private String placeId;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getPlaceId() {
		return this.placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

}
