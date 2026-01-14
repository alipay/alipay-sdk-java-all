package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟卡通用数据查询
 *
 * @author auto create
 * @since 1.0, 2025-08-04 17:01:51
 */
public class AlipayCommerceTransportVirtualcardCardlistdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4187354882518124171L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 查询数据标识是什么类型的数据，eg：SPECIAL_IDENTIFICATION特种人群数据
	 */
	@ApiField("query_action")
	private String queryAction;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getQueryAction() {
		return this.queryAction;
	}
	public void setQueryAction(String queryAction) {
		this.queryAction = queryAction;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
