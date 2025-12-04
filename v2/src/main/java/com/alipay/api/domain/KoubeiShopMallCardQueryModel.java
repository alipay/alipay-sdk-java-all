package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈会员卡信息查询
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:13:33
 */
public class KoubeiShopMallCardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3439767977269684513L;

	/**
	 * 商圈ID
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
