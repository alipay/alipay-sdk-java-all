package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取用户基金资产简报
 *
 * @author auto create
 * @since 1.0, 2018-12-06 09:31:54
 */
public class AntfortuneMarketingWshopUserassetbriefQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3393292898514366525L;

	/**
	 * 用户ID
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
