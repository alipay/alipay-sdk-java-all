package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算数据详情入参
 *
 * @author auto create
 * @since 1.0, 2022-09-21 10:03:24
 */
public class SettleDataDetail extends AlipayObject {

	private static final long serialVersionUID = 2347995151186869741L;

	/**
	 * 结算指标详情数据
	 */
	@ApiField("data_detail")
	private String dataDetail;

	/**
	 * openid
	 */
	@ApiField("openid")
	private String openid;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getDataDetail() {
		return this.dataDetail;
	}
	public void setDataDetail(String dataDetail) {
		this.dataDetail = dataDetail;
	}

	public String getOpenid() {
		return this.openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
