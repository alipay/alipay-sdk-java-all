package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈会员卡信息查询
 *
 * @author auto create
 * @since 1.0, 2018-06-22 11:26:57
 */
public class KoubeiShopMallCardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1488546785196888218L;

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
