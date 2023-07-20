package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券商代销信托用户信息查询
 *
 * @author auto create
 * @since 1.0, 2023-05-19 15:20:46
 */
public class AntfortuneStockTrustUserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4124523624654265878L;

	/**
	 * 券商代销信托业务用户ID
	 */
	@ApiField("trust_user_id")
	private String trustUserId;

	public String getTrustUserId() {
		return this.trustUserId;
	}
	public void setTrustUserId(String trustUserId) {
		this.trustUserId = trustUserId;
	}

}
