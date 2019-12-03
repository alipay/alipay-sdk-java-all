package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询森林用户能量信息
 *
 * @author auto create
 * @since 1.0, 2019-10-25 17:43:50
 */
public class AlipaySocialAntforestEnergyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6214471579639317723L;

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
