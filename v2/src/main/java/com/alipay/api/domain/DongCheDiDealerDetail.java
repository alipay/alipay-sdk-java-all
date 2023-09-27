package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 懂车帝经销商详情模型
 *
 * @author auto create
 * @since 1.0, 2023-09-20 21:22:15
 */
public class DongCheDiDealerDetail extends AlipayObject {

	private static final long serialVersionUID = 5456281654149136198L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 经销商全称
	 */
	@ApiField("dealer_full_name")
	private String dealerFullName;

	/**
	 * 经销商id
	 */
	@ApiField("dealer_id")
	private String dealerId;

	/**
	 * 经销商名称
	 */
	@ApiField("dealer_name")
	private String dealerName;

	/**
	 * 经销商类型
	 */
	@ApiField("dealer_type")
	private String dealerType;

	/**
	 * 距离
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 经销商最高报价单位：万元
	 */
	@ApiField("max_dealer_price")
	private String maxDealerPrice;

	/**
	 * 经销商最低报价单位：万元
	 */
	@ApiField("min_dealer_price")
	private String minDealerPrice;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getDealerFullName() {
		return this.dealerFullName;
	}
	public void setDealerFullName(String dealerFullName) {
		this.dealerFullName = dealerFullName;
	}

	public String getDealerId() {
		return this.dealerId;
	}
	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public String getDealerName() {
		return this.dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getDealerType() {
		return this.dealerType;
	}
	public void setDealerType(String dealerType) {
		this.dealerType = dealerType;
	}

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMaxDealerPrice() {
		return this.maxDealerPrice;
	}
	public void setMaxDealerPrice(String maxDealerPrice) {
		this.maxDealerPrice = maxDealerPrice;
	}

	public String getMinDealerPrice() {
		return this.minDealerPrice;
	}
	public void setMinDealerPrice(String minDealerPrice) {
		this.minDealerPrice = minDealerPrice;
	}

}
