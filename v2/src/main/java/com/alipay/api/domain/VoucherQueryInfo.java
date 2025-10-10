package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券详情查询结果信息
 *
 * @author auto create
 * @since 1.0, 2019-12-09 11:09:51
 */
public class VoucherQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 6349823526118285233L;

	/**
	 * 券生效时间
	 */
	@ApiField("active_time")
	private Date activeTime;

	/**
	 * 券面额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 券剩余可用金额，单位为元
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 券失效时间,超过此时间券将不能被使用
	 */
	@ApiField("expired_time")
	private Date expiredTime;

	/**
	 * 券发放时间
	 */
	@ApiField("send_time")
	private String sendTime;

	/**
	 * 券模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 当前券券已经使用的次数
	 */
	@ApiField("used_count")
	private Long usedCount;

	/**
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券状态 ENABLED：可使用。（注意，如果当前时间在券有效期之前，状态还是可用） 
EXPIRED：已过期（在券面额没有用完的情况下） 
USED：已经使用（券面额已经全部是使用完，不能再使用） 
DELETE：已删除
DISABLE：不可用
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	/**
	 * 券类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public Date getActiveTime() {
		return this.activeTime;
	}
	public void setActiveTime(Date activeTime) {
		this.activeTime = activeTime;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public Date getExpiredTime() {
		return this.expiredTime;
	}
	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getSendTime() {
		return this.sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public Long getUsedCount() {
		return this.usedCount;
	}
	public void setUsedCount(Long usedCount) {
		this.usedCount = usedCount;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherStatus() {
		return this.voucherStatus;
	}
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
