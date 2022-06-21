package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询森林用户能量信息
 *
 * @author auto create
 * @since 1.0, 2020-09-14 10:56:30
 */
public class AlipaySocialAntforestEnergyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1189952145921618244L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
