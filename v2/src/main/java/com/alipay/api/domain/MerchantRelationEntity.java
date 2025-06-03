package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户关系实体
 *
 * @author auto create
 * @since 1.0, 2025-03-13 10:37:28
 */
public class MerchantRelationEntity extends AlipayObject {

	private static final long serialVersionUID = 8236822834483583968L;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 主商户支付宝id，对客提供服务方
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("seller_open_id")
	private String sellerOpenId;

	/**
	 * 合作商户支付宝id，不直接提供对客服务，与primary_id关系可能是分销等
	 */
	@ApiField("sub_seller_id")
	private String subSellerId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("sub_seller_open_id")
	private String subSellerOpenId;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerOpenId() {
		return this.sellerOpenId;
	}
	public void setSellerOpenId(String sellerOpenId) {
		this.sellerOpenId = sellerOpenId;
	}

	public String getSubSellerId() {
		return this.subSellerId;
	}
	public void setSubSellerId(String subSellerId) {
		this.subSellerId = subSellerId;
	}

	public String getSubSellerOpenId() {
		return this.subSellerOpenId;
	}
	public void setSubSellerOpenId(String subSellerOpenId) {
		this.subSellerOpenId = subSellerOpenId;
	}

}
