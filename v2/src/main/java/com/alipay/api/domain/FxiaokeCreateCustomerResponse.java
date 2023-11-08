package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * FxiaokeCreateCustomerResponse
 *
 * @author auto create
 * @since 1.0, 2023-10-19 09:49:33
 */
public class FxiaokeCreateCustomerResponse extends AlipayObject {

	private static final long serialVersionUID = 2568322758245737467L;

	/**
	 * bid
	 */
	@ApiField("bid")
	private String bid;

	/**
	 * id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 蚂蚁关联方代码
	 */
	@ApiField("intertrade_ou_code")
	private String intertradeOuCode;

	/**
	 * 关联交易类型
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
