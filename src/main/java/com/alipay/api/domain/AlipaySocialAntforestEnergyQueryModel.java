package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询森林用户能量信息
 *
 * @author auto create
 * @since 1.0, 2020-03-03 00:38:05
 */
public class AlipaySocialAntforestEnergyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1555655594395999257L;

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
