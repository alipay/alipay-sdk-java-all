package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗商业化会员权益资格查询
 *
 * @author auto create
 * @since 1.0, 2024-07-18 18:50:16
 */
public class AlipayCommerceMedicalCommercialMemberQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5625961514542139626L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 会员卡订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * out_product_id为商户侧唯一权益id，和用户的业务子单一一对应
	 */
	@ApiField("out_product_id")
	private String outProductId;

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

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutProductId() {
		return this.outProductId;
	}
	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
