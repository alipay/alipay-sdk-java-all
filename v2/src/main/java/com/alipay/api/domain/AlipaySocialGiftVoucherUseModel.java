package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 送礼平台商户进行核销调用
 *
 * @author auto create
 * @since 1.0, 2018-10-11 21:13:15
 */
public class AlipaySocialGiftVoucherUseModel extends AlipayObject {

	private static final long serialVersionUID = 4252446134446278169L;

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
	 * 主订单id，核销对应的送礼平台主订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 当前用户剩余的金额，该金额会作为剩余金额显示到卡包中。注意，需要由商户自行保证该金额的正确性。平台不会存这个剩余金额，也不会做相关校验（除了必须不能小于零外）
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商户通过该接口落卡包后，其支付宝卡包中对应实体（卡、券）的生效时间。该值可以选填。默认生效时间为当前时间。其规则可以在商户后台进行配置。
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 核销金额，即本次用户消费的金额。
	 */
	@ApiField("use_price")
	private String usePrice;

	/**
	 * 卡码code，改id为商户上传到平台的id。
	 */
	@ApiField("voucher_id")
	private String voucherId;

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

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getUsePrice() {
		return this.usePrice;
	}
	public void setUsePrice(String usePrice) {
		this.usePrice = usePrice;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
