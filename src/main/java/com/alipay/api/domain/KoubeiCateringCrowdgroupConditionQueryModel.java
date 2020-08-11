package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv创建用户规则查询
 *
 * @author auto create
 * @since 1.0, 2018-04-04 11:04:02
 */
public class KoubeiCateringCrowdgroupConditionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2591437576692777555L;

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
