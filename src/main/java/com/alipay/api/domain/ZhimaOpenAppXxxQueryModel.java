package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * xxxxxx
 *
 * @author auto create
 * @since 1.0, 2019-05-09 09:25:27
 */
public class ZhimaOpenAppXxxQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2739831981654982526L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
