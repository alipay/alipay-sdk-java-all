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

	private static final long serialVersionUID = 5787948414656821685L;

	/**
	 * 芝麻借还订单的开始借用时间，格式：yyyy-mm-dd hh:MM:ss 
如果同时传入另一参数:应归还时间expiry_time，则传入的开始借用时间不能晚于传入的应归还时间，如果没有传入应归还时间，则传入的开始借用时间不能晚于原有应归还时间。
borrow_time 与 expiry_time 须至少传入一个，可同时传入。
	 */
	@ApiField("borrow_time")
	private String borrowTime;

	/**
	 * 芝麻借还订单的应归还时间(到期时间)，格式：yyyy-mm-dd hh:MM:ss 
传入的应归还时间不能早于原有应归还时间。
borrow_time 与 expiry_time 须至少传入一个，可同时传入。
	 */
	@ApiField("expiry_time")
	private String expiryTime;

	/**
	 * 信用借还订单号,该订单号在订单创建时由信用借还产品产生,并通过订单创建接口的返回结果返回给调用者
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 信用借还的产品码,是固定值:w1010100000000002858
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
