package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户已获得的优惠信息查询接口
 *
 * @author auto create
 * @since 1.0, 2018-05-10 13:54:20
 */
public class KoubeiMarketingDataMallDiscountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6767281547555365568L;

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
