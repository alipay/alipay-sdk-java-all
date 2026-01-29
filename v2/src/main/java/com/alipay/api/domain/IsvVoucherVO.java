package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券类型奖品列表
 *
 * @author auto create
 * @since 1.0, 2025-11-28 16:12:41
 */
public class IsvVoucherVO extends AlipayObject {

	private static final long serialVersionUID = 3873718783967447971L;

	/**
	 * 可用现金价值，单位分
	 */
	@ApiField("available_cash")
	private Long availableCash;

	/**
	 * 可用次数
	 */
	@ApiField("available_count")
	private Long availableCount;

	/**
	 * 冻结资金，单位分
	 */
	@ApiField("freeze_amount")
	private Long freezeAmount;

	/**
	 * 冻结资金，单位分
	 */
	@ApiField("freeze_cash")
	private Long freezeCash;

	/**
	 * 券生效时间
	 */
	@ApiField("gmt_active")
	private Date gmtActive;

	/**
	 * 券失效时间
	 */
	@ApiField("gmt_expired")
	private Date gmtExpired;

	/**
	 * 展期(退款时间超过失效时间，但是未到展期，将失效时间改成展期实际时间)
	 */
	@ApiField("gmt_extend")
	private Date gmtExtend;

	/**
	 * 券名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 回收金额，单位分
	 */
	@ApiField("recycle_amount")
	private Long recycleAmount;

	/**
	 * 描述跳转链接
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 总金额，单位分
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/**
	 * 总现金价值，单位分
	 */
	@ApiField("total_cash")
	private Long totalCash;

	/**
	 * 总次数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 已转移金额，单位分
	 */
	@ApiField("transfer_amount")
	private Long transferAmount;

	/**
	 * 已使用次数
	 */
	@ApiField("used_count")
	private Long usedCount;

	/**
	 * 券描述
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/**
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public Long getAvailableCash() {
		return this.availableCash;
	}
	public void setAvailableCash(Long availableCash) {
		this.availableCash = availableCash;
	}

	public Long getAvailableCount() {
		return this.availableCount;
	}
	public void setAvailableCount(Long availableCount) {
		this.availableCount = availableCount;
	}

	public Long getFreezeAmount() {
		return this.freezeAmount;
	}
	public void setFreezeAmount(Long freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public Long getFreezeCash() {
		return this.freezeCash;
	}
	public void setFreezeCash(Long freezeCash) {
		this.freezeCash = freezeCash;
	}

	public Date getGmtActive() {
		return this.gmtActive;
	}
	public void setGmtActive(Date gmtActive) {
		this.gmtActive = gmtActive;
	}

	public Date getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(Date gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public Date getGmtExtend() {
		return this.gmtExtend;
	}
	public void setGmtExtend(Date gmtExtend) {
		this.gmtExtend = gmtExtend;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getRecycleAmount() {
		return this.recycleAmount;
	}
	public void setRecycleAmount(Long recycleAmount) {
		this.recycleAmount = recycleAmount;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getTotalCash() {
		return this.totalCash;
	}
	public void setTotalCash(Long totalCash) {
		this.totalCash = totalCash;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getTransferAmount() {
		return this.transferAmount;
	}
	public void setTransferAmount(Long transferAmount) {
		this.transferAmount = transferAmount;
	}

	public Long getUsedCount() {
		return this.usedCount;
	}
	public void setUsedCount(Long usedCount) {
		this.usedCount = usedCount;
	}

	public String getVoucherDescription() {
		return this.voucherDescription;
	}
	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
