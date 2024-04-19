package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈开放页面投放内容查询
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:15:03
 */
public class KoubeiRetailMallCdpQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3842677465125469414L;

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
