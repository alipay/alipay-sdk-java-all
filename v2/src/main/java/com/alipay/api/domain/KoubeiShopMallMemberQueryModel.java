package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈会员信息查询接口
 *
 * @author auto create
 * @since 1.0, 2018-06-16 21:13:42
 */
public class KoubeiShopMallMemberQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3148855574263494663L;

	/**
	 * 商圈ID
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
