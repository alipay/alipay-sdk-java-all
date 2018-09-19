package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 送礼平台商户进行核销调用
 *
 * @author auto create
 * @since 1.0, 2018-09-04 16:32:42
 */
public class AlipaySocialGiftVoucherUseModel extends AlipayObject {

	private static final long serialVersionUID = 6487571777614891345L;

	/**
	 * 失效时间
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
	 * 当前金额，注意这个金额是核销后的当前金额。use_price是核销金额
	 */
	@ApiField("price")
	private String price;

	/**
	 * 生效时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 核销金额
	 */
	@ApiField("use_price")
	private String usePrice;

	/**
	 * 卡码code
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
