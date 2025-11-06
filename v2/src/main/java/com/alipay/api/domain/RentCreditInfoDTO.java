package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用产品信息
 *
 * @author auto create
 * @since 1.0, 2025-09-26 11:46:43
 */
public class RentCreditInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2513893284421366785L;

	/**
	 * 芝麻外部类目 <a href="https://opendocs.alipay.com/open/10719" target="_blank">类目枚举文档</a>
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
