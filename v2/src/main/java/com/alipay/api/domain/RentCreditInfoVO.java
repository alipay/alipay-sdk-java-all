package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用产品信息
 *
 * @author auto create
 * @since 1.0, 2025-07-02 15:11:59
 */
public class RentCreditInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6192832345138686957L;

	/**
	 * 芝麻外部类目
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 芝麻信用服务ID
	 */
	@ApiField("zm_service_id")
	private String zmServiceId;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getZmServiceId() {
		return this.zmServiceId;
	}
	public void setZmServiceId(String zmServiceId) {
		this.zmServiceId = zmServiceId;
	}

}
