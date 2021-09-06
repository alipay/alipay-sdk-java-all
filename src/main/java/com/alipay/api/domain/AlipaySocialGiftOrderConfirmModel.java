package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户订单激活确认接口
 *
 * @author auto create
 * @since 1.0, 2018-10-11 21:12:50
 */
public class AlipaySocialGiftOrderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 8474176168483217967L;

	/**
	 * 商户通过该接口落卡包后，其支付宝卡包中对应实体（卡、券）的失效时间。该值可以选填。【注意：如果不填写，默认为生效时间后3年】。其时间规则可以在商户后台进行配置。
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
	 * 商户通过该接口落卡包后，其支付宝卡包中对应实体（卡、券）的生效时间。该值可以选填。默认生效时间为当前时间。其规则可以在商户后台进行配置。
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 订单确认金额，用户可选填，如果不填则使用SKU票面价值。如果填写则使用该填写的价格在卡包中展示（如果后台配置为落卡包）。注意支付宝端不会校验该金额的有效性（但会校验是否不小于零），需要商户自行保证。
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
