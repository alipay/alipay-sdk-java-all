package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询蛋仔派对联动公益林相关汇总数据
 *
 * @author auto create
 * @since 1.0, 2023-09-01 10:02:07
 */
public class AlipaySocialAntforestEggypartyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2313974689674961384L;

	/**
	 * 蚂蚁统一会员ID
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
