package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈地址查询接口
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:10:32
 */
public class KoubeiShopMallPageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2134322931327726155L;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

}
