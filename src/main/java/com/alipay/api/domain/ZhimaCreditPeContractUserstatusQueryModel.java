package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户签约状态查询
 *
 * @author auto create
 * @since 1.0, 2018-07-27 18:10:11
 */
public class ZhimaCreditPeContractUserstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7215271371458119319L;

	/**
	 * 我承诺消费活动名字
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 场景类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 用户支付宝ID
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
