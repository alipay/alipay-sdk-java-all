package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合作方提供芝麻车主名片的顺风车主订单信息
 *
 * @author auto create
 * @since 1.0, 2025-10-21 20:37:42
 */
public class ZmCarOwnerOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 6563447994861361583L;

	/**
	 * 由合作方生成的标识唯一一笔订单的编号
	 */
	@ApiField("biz_order_no")
	private String bizOrderNo;

	/**
	 * 订单状态：
乘客上车/到达
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 合作方当前顺风车主已成功完成的订单量
	 */
	@ApiField("service_order_cnt")
	private Long serviceOrderCnt;

	public String getBizOrderNo() {
		return this.bizOrderNo;
	}
	public void setBizOrderNo(String bizOrderNo) {
		this.bizOrderNo = bizOrderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getServiceOrderCnt() {
		return this.serviceOrderCnt;
	}
	public void setServiceOrderCnt(Long serviceOrderCnt) {
		this.serviceOrderCnt = serviceOrderCnt;
	}

}
