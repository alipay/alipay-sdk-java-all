package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-07-24 16:12:33
 */
public class WorkPlace extends AlipayObject {

	private static final long serialVersionUID = 6258559599352223233L;

	/**
	 * 物流行业作业平台线圈作业时的最小铺设单位。
例如：蚂蚁A空间北门的柜组下有3个柜子需要铺设线圈。柜组ID=点位ID，柜子ID=铺设点ID
	 */
	@ApiField("work_place_id")
	private String workPlaceId;

	public String getWorkPlaceId() {
		return this.workPlaceId;
	}
	public void setWorkPlaceId(String workPlaceId) {
		this.workPlaceId = workPlaceId;
	}

}
