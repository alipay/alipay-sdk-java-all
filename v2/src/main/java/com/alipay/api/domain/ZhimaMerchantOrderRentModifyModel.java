package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用借还订单修改接口
 *
 * @author auto create
 * @since 1.0, 2019-07-12 13:48:45
 */
public class ZhimaMerchantOrderRentModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6512457849386149113L;

	/**
	 * 芝麻借还订单的开始借用时间，时间格式：yyyy-mm-dd hh:MM:ss。
注意：
* borrow_time 与 expiry_time 须至少传入一个，可同时传入。
* 若同时传入 expiry_time（应归还时间），则传入的 borrow_time（开始借用时间）不能晚于 expiry_time；
* 若未传入 expiry_time（应归还时间），则传入的 borrow_time（开始借用时间）不能晚于原有应归还时间。
	 */
	@ApiField("borrow_time")
	private String borrowTime;

	/**
	 * 芝麻借还订单的应归还时间(到期时间)，时间格式：yyyy-mm-dd hh:MM:ss。
注意：
* borrow_time 与 expiry_time 须至少传入一个，可同时传入。
* 传入的 expiry_time（应归还时间）不能早于原有应归还时间。
	 */
	@ApiField("expiry_time")
	private String expiryTime;

	/**
	 * 信用借还订单号，通过<a href="https://opendocs.alipay.com/apis/api_8/zhima.merchant.order.rent.create">zhima.merchant.order.rent.create</a>(信用借还订单创建(页面))接口创建信用借还订单后获取。
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 信用借还产品码，固定为：w1010100000000002858。
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBorrowTime() {
		return this.borrowTime;
	}
	public void setBorrowTime(String borrowTime) {
		this.borrowTime = borrowTime;
	}

	public String getExpiryTime() {
		return this.expiryTime;
	}
	public void setExpiryTime(String expiryTime) {
		this.expiryTime = expiryTime;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
