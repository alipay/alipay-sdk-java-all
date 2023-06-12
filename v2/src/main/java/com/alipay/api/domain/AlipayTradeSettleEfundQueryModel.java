package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集团电商待结算户查询
 *
 * @author auto create
 * @since 1.0, 2023-03-02 13:10:50
 */
public class AlipayTradeSettleEfundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3488781838116342696L;

	/**
	 * 卖家openId
	 */
	@ApiField("seller_open_id")
	private String sellerOpenId;

	/**
	 * 卖家userId
	 */
	@ApiField("seller_user_id")
	private String sellerUserId;

	/**
	 * 管控资金业务类型
	 */
	@ApiField("settle_biz_type")
	private String settleBizType;

	public String getSellerOpenId() {
		return this.sellerOpenId;
	}
	public void setSellerOpenId(String sellerOpenId) {
		this.sellerOpenId = sellerOpenId;
	}

	public String getSellerUserId() {
		return this.sellerUserId;
	}
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}

	public String getSettleBizType() {
		return this.settleBizType;
	}
	public void setSettleBizType(String settleBizType) {
		this.settleBizType = settleBizType;
	}

}
