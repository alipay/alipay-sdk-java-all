package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户订单激活确认接口
 *
 * @author auto create
 * @since 1.0, 2018-09-04 16:32:53
 */
public class AlipaySocialGiftOrderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5548566946235496574L;

	/**
	 * 卡生效截止时间，可用于卡包中卡展示
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 商户再送礼平台的唯一ID，用于标识具体的调用业务方，需要先在送礼平台进行业务类型的分配之后才看使用。
	 */
	@ApiField("mid")
	private String mid;

	/**
	 * 送礼平台方的主订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 卡码的有效起始时间，可用于卡包展示
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 卡的金额字段，可用于在支付宝进行显示（比如卡包中卡金额）
	 */
	@ApiField("total_price")
	private String totalPrice;

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getMid() {
		return this.mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTotalPrice() {
		return this.totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

}
