package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员标签查询接口
 *
 * @author auto create
 * @since 1.0, 2018-04-24 18:43:10
 */
public class KoubeiMemberDataTagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8499698244328661881L;

	/**
	 * isv的pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
