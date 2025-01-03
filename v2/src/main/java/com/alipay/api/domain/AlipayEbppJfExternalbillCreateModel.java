package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费外部账单
 *
 * @author auto create
 * @since 1.0, 2023-11-16 11:32:39
 */
public class AlipayEbppJfExternalbillCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1859923122315214326L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易申请明细
	 */
	@ApiField("order_detail")
	private PucExternalOrder orderDetail;

	/**
	 * 用于区分下单来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public PucExternalOrder getOrderDetail() {
		return this.orderDetail;
	}
	public void setOrderDetail(PucExternalOrder orderDetail) {
		this.orderDetail = orderDetail;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
