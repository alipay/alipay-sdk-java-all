package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单拓展信息
 *
 * @author auto create
 * @since 1.0, 2025-08-22 20:57:19
 */
public class RentOrderExtendInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7453222119128722635L;

	/**
	 * 芝麻租赁频道联营订单标
	 */
	@ApiField("union_rent_tag")
	private String unionRentTag;

	public String getUnionRentTag() {
		return this.unionRentTag;
	}
	public void setUnionRentTag(String unionRentTag) {
		this.unionRentTag = unionRentTag;
	}

}
