package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员购商品商详URL查询
 *
 * @author auto create
 * @since 1.0, 2026-01-09 17:42:45
 */
public class AlipayUserMemberbuyItemdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7832624518872348434L;

	/**
	 * 支付宝会员账户对应的用户ID对应的统一开放ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部商户侧的商品ID，由商户提供
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 支付宝会员账户对应的用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
