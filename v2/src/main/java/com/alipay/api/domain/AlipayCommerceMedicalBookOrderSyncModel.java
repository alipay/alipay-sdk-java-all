package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单信息同步
 *
 * @author auto create
 * @since 1.0, 2025-12-22 11:08:47
 */
public class AlipayCommerceMedicalBookOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3279638125514991837L;

	/**
	 * 订单详情
	 */
	@ApiField("book_order_detail")
	private BookOrderDetailVO bookOrderDetail;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public BookOrderDetailVO getBookOrderDetail() {
		return this.bookOrderDetail;
	}
	public void setBookOrderDetail(BookOrderDetailVO bookOrderDetail) {
		this.bookOrderDetail = bookOrderDetail;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
