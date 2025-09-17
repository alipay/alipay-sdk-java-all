package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单购买信息
 *
 * @author auto create
 * @since 1.0, 2025-08-25 20:57:32
 */
public class RentBuyoutInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1611757639495867733L;

	/**
	 * 租赁阶梯购买分期号
	 */
	@ApiField("buyout_installment_no")
	private Long buyoutInstallmentNo;

	/**
	 * 原租赁交易组件订单号
	 */
	@ApiField("origin_order_id")
	private String originOrderId;

	/**
	 * 支付宝服务器主动通知商户服务器里指定的页面http/https路径
	 */
	@ApiField("pay_notify_url")
	private String payNotifyUrl;

	/**
	 * true表示当前购买订单创建不需要自动创建支付宝trade_no。商户需自行处理收款后，通过alipay.commerce.rent.order.pay.sync接口进行同步。
	 */
	@ApiField("sync_pay")
	private Boolean syncPay;

	public Long getBuyoutInstallmentNo() {
		return this.buyoutInstallmentNo;
	}
	public void setBuyoutInstallmentNo(Long buyoutInstallmentNo) {
		this.buyoutInstallmentNo = buyoutInstallmentNo;
	}

	public String getOriginOrderId() {
		return this.originOrderId;
	}
	public void setOriginOrderId(String originOrderId) {
		this.originOrderId = originOrderId;
	}

	public String getPayNotifyUrl() {
		return this.payNotifyUrl;
	}
	public void setPayNotifyUrl(String payNotifyUrl) {
		this.payNotifyUrl = payNotifyUrl;
	}

	public Boolean getSyncPay() {
		return this.syncPay;
	}
	public void setSyncPay(Boolean syncPay) {
		this.syncPay = syncPay;
	}

}
