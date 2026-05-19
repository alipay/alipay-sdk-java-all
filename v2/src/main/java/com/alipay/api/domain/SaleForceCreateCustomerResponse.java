package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建客户结果
 *
 * @author auto create
 * @since 1.0, 2026-05-13 15:42:45
 */
public class SaleForceCreateCustomerResponse extends AlipayObject {

	private static final long serialVersionUID = 3314453717559486449L;

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

}
