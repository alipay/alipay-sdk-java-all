package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约方同步履约状态
 *
 * @author auto create
 * @since 1.0, 2025-12-18 15:47:42
 */
public class AlipayCommerceMedicalHdfinspectionSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2459964195954566929L;

	/**
	 * 双方定义
	 */
	@ApiField("biz_source")
	private String bizSource;

	/**
	 * 履约方定义
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 订单总金额，单位：元
	 */
	@ApiField("order_price")
	private String orderPrice;

	/**
	 * 履约方的支付状态
	 */
	@ApiField("pay_status")
	private Long payStatus;

	/**
	 * 履约方定义
	 */
	@ApiField("reserve_code")
	private String reserveCode;

	/**
	 * 履约方的预约状态
	 */
	@ApiField("reserve_status")
	private Long reserveStatus;

	/**
	 * 用户预约的检验检查时间
	 */
	@ApiField("reserve_time")
	private String reserveTime;

	/**
	 * 好大夫侧的单号
	 */
	@ApiField("union_order_code")
	private String unionOrderCode;

	public String getBizSource() {
		return this.bizSource;
	}
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderPrice() {
		return this.orderPrice;
	}
	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Long getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(Long payStatus) {
		this.payStatus = payStatus;
	}

	public String getReserveCode() {
		return this.reserveCode;
	}
	public void setReserveCode(String reserveCode) {
		this.reserveCode = reserveCode;
	}

	public Long getReserveStatus() {
		return this.reserveStatus;
	}
	public void setReserveStatus(Long reserveStatus) {
		this.reserveStatus = reserveStatus;
	}

	public String getReserveTime() {
		return this.reserveTime;
	}
	public void setReserveTime(String reserveTime) {
		this.reserveTime = reserveTime;
	}

	public String getUnionOrderCode() {
		return this.unionOrderCode;
	}
	public void setUnionOrderCode(String unionOrderCode) {
		this.unionOrderCode = unionOrderCode;
	}

}
