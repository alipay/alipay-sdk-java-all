package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动商品的信息
 *
 * @author auto create
 * @since 1.0, 2019-06-25 19:47:25
 */
public class PromoItemInfo extends AlipayObject {

	private static final long serialVersionUID = 3472321843289617411L;

	/**
	 * 商品购买限制
	 */
	@ApiField("constraint_info")
	private ConstraintInfo constraintInfo;

	/**
	 * 商品ID，用于领取时使用
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商品售卖结束时间
	 */
	@ApiField("sale_end_time")
	private String saleEndTime;

	/**
	 * 商品售卖的开始时间
	 */
	@ApiField("sale_start_time")
	private Date saleStartTime;

	/**
	 * 剩余库存
	 */
	@ApiField("total_inventory")
	private String totalInventory;

	/**
	 * 券信息
	 */
	@ApiField("voucher")
	private Voucher voucher;

	public ConstraintInfo getConstraintInfo() {
		return this.constraintInfo;
	}
	public void setConstraintInfo(ConstraintInfo constraintInfo) {
		this.constraintInfo = constraintInfo;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getSaleEndTime() {
		return this.saleEndTime;
	}
	public void setSaleEndTime(String saleEndTime) {
		this.saleEndTime = saleEndTime;
	}

	public Date getSaleStartTime() {
		return this.saleStartTime;
	}
	public void setSaleStartTime(Date saleStartTime) {
		this.saleStartTime = saleStartTime;
	}

	public String getTotalInventory() {
		return this.totalInventory;
	}
	public void setTotalInventory(String totalInventory) {
		this.totalInventory = totalInventory;
	}

	public Voucher getVoucher() {
		return this.voucher;
	}
	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

}
