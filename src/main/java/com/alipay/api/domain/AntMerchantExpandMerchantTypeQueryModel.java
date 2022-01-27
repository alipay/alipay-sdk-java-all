package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连绑定类型查询
 *
 * @author auto create
 * @since 1.0, 2019-08-26 10:49:01
 */
public class AntMerchantExpandMerchantTypeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8141148919924958977L;

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
