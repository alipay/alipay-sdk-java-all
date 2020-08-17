package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店列表
 *
 * @author auto create
 * @since 1.0, 2019-08-22 15:59:38
 */
public class Shop extends AlipayObject {

	private static final long serialVersionUID = 1474211823735917814L;

	/**
	 * 地址信息
	 */
	@ApiField("address")
	private Address address;

	/**
	 * 店铺名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商户id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 门店类型，只能选择SMID/MID/PID其中一个
	 */
	@ApiField("type")
	private String type;

	public Address getAddress() {
		return this.address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
