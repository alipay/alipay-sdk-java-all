package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员卡核销有效线下店范围
 *
 * @author auto create
 * @since 1.0, 2022-10-31 21:54:41
 */
public class MemberCardPayEffectiveShopRule extends AlipayObject {

	private static final long serialVersionUID = 4153376644939197425L;

	/**
	 * 线下店id列表，列表最大长度5000
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * 商家id
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
