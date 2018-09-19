package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户历史合约
 *
 * @author auto create
 * @since 1.0, 2018-07-27 18:10:57
 */
public class ZhimaCreditPeContractUserhistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1137772647429316524L;

	/**
	 * 活动名
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 场景类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("uid")
	private String uid;

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
