package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试
 *
 * @author auto create
 * @since 1.0, 2020-06-10 10:14:01
 */
public class AlipayGongyiModelTest extends AlipayObject {

	private static final long serialVersionUID = 2675195449183969744L;

	/**
	 * zhangsan
	 */
	@ApiField("buyer")
	private String buyer;

	/**
	 * buyer@163.com
	 */
	@ApiField("buyer_email")
	private String buyerEmail;

	/**
	 * 10.12
	 */
	@ApiField("price")
	private String price;

	/**
	 * asdf
	 */
	@ApiField("seller")
	private String seller;

	/**
	 * seller@email.com
	 */
	@ApiField("seller_email")
	private String sellerEmail;

	/**
	 * userfino
	 */
	@ApiField("userinfo")
	private AlipayGongyiUserInfoTest userinfo;

	public String getBuyer() {
		return this.buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getBuyerEmail() {
		return this.buyerEmail;
	}
	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSeller() {
		return this.seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}

	public String getSellerEmail() {
		return this.sellerEmail;
	}
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public AlipayGongyiUserInfoTest getUserinfo() {
		return this.userinfo;
	}
	public void setUserinfo(AlipayGongyiUserInfoTest userinfo) {
		this.userinfo = userinfo;
	}

}
