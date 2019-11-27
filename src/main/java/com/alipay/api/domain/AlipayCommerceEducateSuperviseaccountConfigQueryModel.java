package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 监管专户配置查询
 *
 * @author auto create
 * @since 1.0, 2019-07-31 15:42:03
 */
public class AlipayCommerceEducateSuperviseaccountConfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6888269439261794699L;

	/**
	 * 配置类型，如WITHDRAWAL（大额提现通知）、MARGIN（最低保证金）
	 */
	@ApiField("config_type")
	private String configType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getConfigType() {
		return this.configType;
	}
	public void setConfigType(String configType) {
		this.configType = configType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
