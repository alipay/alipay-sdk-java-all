package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询森林亚运碳中和相关数据
 *
 * @author auto create
 * @since 1.0, 2023-07-05 18:07:11
 */
public class AlipaySocialAntforestCarbonneutralityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2622742823837718462L;

	/**
	 * 蚂蚁统一会员ID，执行该查询操作的支付宝用户
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
