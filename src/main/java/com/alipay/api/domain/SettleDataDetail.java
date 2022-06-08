package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算数据详情入参
 *
 * @author auto create
 * @since 1.0, 2022-04-21 09:46:54
 */
public class SettleDataDetail extends AlipayObject {

	private static final long serialVersionUID = 6663273332972389712L;

	/**
	 * 结算指标详情数据
	 */
	@ApiField("data_detail")
	private String dataDetail;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
