package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家订单支付信息同步接口
 *
 * @author auto create
 * @since 1.0, 2025-07-10 10:55:18
 */
public class AlipayCommerceRentOrderInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5267169188357495684L;

	/**
	 * 2088开头的16位纯数字，小程序场景下获取用户ID请参考：用户授权; 其它场景下获取用户ID请参考：网页授权获取用户信息; 其中buyer_id与buyer_open_id不能同时为空
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 交易组件分期单号
	 */
	@ApiField("installment_no")
	private String installmentNo;

	/**
	 * 交易组件的业务订单Id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 支付渠道，例如 ALIPAY、WECHAT、OTHER
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 商户同步的租赁支付明细
	 */
	@ApiListField("rent_pay_info")
	@ApiField("rent_pay_info_d_t_o")
	private List<RentPayInfoDTO> rentPayInfo;

	/**
	 * 支付交易号，pay_channnel=ALIPAY 必填
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getInstallmentNo() {
		return this.installmentNo;
	}
	public void setInstallmentNo(String installmentNo) {
		this.installmentNo = installmentNo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public List<RentPayInfoDTO> getRentPayInfo() {
		return this.rentPayInfo;
	}
	public void setRentPayInfo(List<RentPayInfoDTO> rentPayInfo) {
		this.rentPayInfo = rentPayInfo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
