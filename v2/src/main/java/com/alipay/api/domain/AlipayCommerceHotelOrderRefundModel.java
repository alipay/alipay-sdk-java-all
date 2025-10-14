package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单退款
 *
 * @author auto create
 * @since 1.0, 2025-03-26 10:34:20
 */
public class AlipayCommerceHotelOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 6559645864217895131L;

	/**
	 * 出行酒店订单id
	 */
	@ApiField("alipay_hotel_order_id")
	private String alipayHotelOrderId;

	/**
	 * 买家open_id；
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号，创建订单请求由商户传入；
	 */
	@ApiField("outer_order_id")
	private String outerOrderId;

	/**
	 * 枚举值：
未入住：NOSHOW
提前离店：EARLY_DEPARTURE
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 当noshow或提前离店时，应退用户金额
	 */
	@ApiField("refund_amount")
	private EtravelHotelSupplyPriceDTO refundAmount;

	/**
	 * 退款流水号，幂等控制
	 */
	@ApiField("refund_bill_no")
	private String refundBillNo;

	public String getAlipayHotelOrderId() {
		return this.alipayHotelOrderId;
	}
	public void setAlipayHotelOrderId(String alipayHotelOrderId) {
		this.alipayHotelOrderId = alipayHotelOrderId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOuterOrderId() {
		return this.outerOrderId;
	}
	public void setOuterOrderId(String outerOrderId) {
		this.outerOrderId = outerOrderId;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public EtravelHotelSupplyPriceDTO getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(EtravelHotelSupplyPriceDTO refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundBillNo() {
		return this.refundBillNo;
	}
	public void setRefundBillNo(String refundBillNo) {
		this.refundBillNo = refundBillNo;
	}

}
