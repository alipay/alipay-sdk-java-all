package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 冻结订单详情
 *
 * @author auto create
 * @since 1.0, 2022-11-09 17:57:48
 */
public class UnfreezeOrderDetail extends AlipayObject {

	private static final long serialVersionUID = 6146271235495228177L;

	/**
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 冻结订单的商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 订单的最近修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 冻结金额（含服务费）
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单状态：I：初始，S：成功，F：失败
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 解冻金额（含服务费）
	 */
	@ApiField("unfreeze_amount")
	private String unfreezeAmount;

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getUnfreezeAmount() {
		return this.unfreezeAmount;
	}
	public void setUnfreezeAmount(String unfreezeAmount) {
		this.unfreezeAmount = unfreezeAmount;
	}

}
