package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放基础模拟C端用户授权接口
 *
 * @author auto create
 * @since 1.0, 2019-08-05 12:05:20
 */
public class AlipayOpenAppOpenbizmockUserauthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5242915797575975876L;

	/**
	 * 门店编码
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
