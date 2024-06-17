package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家查询自运营计划列表
 *
 * @author auto create
 * @since 1.0, 2019-08-13 17:13:11
 */
public class AlipayCommerceIotAdvertiserAdQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4474619419976862916L;

	/**
	 * 投放计划id
	 */
	@ApiField("id")
	private Long id;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
