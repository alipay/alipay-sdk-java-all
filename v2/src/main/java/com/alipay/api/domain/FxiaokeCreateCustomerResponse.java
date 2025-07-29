package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * FxiaokeCreateCustomerResponse
 *
 * @author auto create
 * @since 1.0, 2025-03-03 14:54:17
 */
public class FxiaokeCreateCustomerResponse extends AlipayObject {

	private static final long serialVersionUID = 2175178118684542557L;

	/**
	 * 客户bid
	 */
	@ApiField("bid")
	private String bid;

	/**
	 * 客户id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 蚂蚁关联方代码文本值
	 */
	@ApiField("intertrade_ou_code")
	private String intertradeOuCode;

	/**
	 * 关联交易类型文本值
	 */
	@ApiField("intertrade_type")
	private String intertradeType;

	public String getBid() {
		return this.bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getIntertradeOuCode() {
		return this.intertradeOuCode;
	}
	public void setIntertradeOuCode(String intertradeOuCode) {
		this.intertradeOuCode = intertradeOuCode;
	}

	public String getIntertradeType() {
		return this.intertradeType;
	}
	public void setIntertradeType(String intertradeType) {
		this.intertradeType = intertradeType;
	}

}
