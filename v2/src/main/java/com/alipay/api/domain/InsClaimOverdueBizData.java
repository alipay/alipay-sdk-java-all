package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 追偿业务扩展字段
 *
 * @author auto create
 * @since 1.0, 2025-10-23 21:15:57
 */
public class InsClaimOverdueBizData extends AlipayObject {

	private static final long serialVersionUID = 3877582588164473891L;

	/**
	 * 买家手机号
	 */
	@ApiField("buyer_phone")
	private String buyerPhone;

	/**
	 * 当前游戏账户绑定手机号
	 */
	@ApiField("game_account_phone")
	private String gameAccountPhone;

	/**
	 * 追偿账单标题
	 */
	@ApiField("overdue_bill_title")
	private String overdueBillTitle;

	/**
	 * 卖家手机号
	 */
	@ApiField("seller_phone")
	private String sellerPhone;

	public String getBuyerPhone() {
		return this.buyerPhone;
	}
	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}

	public String getGameAccountPhone() {
		return this.gameAccountPhone;
	}
	public void setGameAccountPhone(String gameAccountPhone) {
		this.gameAccountPhone = gameAccountPhone;
	}

	public String getOverdueBillTitle() {
		return this.overdueBillTitle;
	}
	public void setOverdueBillTitle(String overdueBillTitle) {
		this.overdueBillTitle = overdueBillTitle;
	}

	public String getSellerPhone() {
		return this.sellerPhone;
	}
	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}

}
