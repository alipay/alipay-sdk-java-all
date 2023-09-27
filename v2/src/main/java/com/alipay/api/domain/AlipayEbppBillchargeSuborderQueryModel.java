package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子订单查询接口
 *
 * @author auto create
 * @since 1.0, 2022-11-18 13:39:15
 */
public class AlipayEbppBillchargeSuborderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1871558747358924445L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 主订单流水号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 来源渠道
	 */
	@ApiField("source")
	private String source;

	/**
	 * 子订单流水号
	 */
	@ApiField("sub_order_no")
	private String subOrderNo;

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

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSubOrderNo() {
		return this.subOrderNo;
	}
	public void setSubOrderNo(String subOrderNo) {
		this.subOrderNo = subOrderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
