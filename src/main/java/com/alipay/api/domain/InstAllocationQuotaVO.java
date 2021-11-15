package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 调拨额度配置
 *
 * @author auto create
 * @since 1.0, 2020-06-24 16:27:52
 */
public class InstAllocationQuotaVO extends AlipayObject {

	private static final long serialVersionUID = 2555168892281588341L;

	/**
	 * 管控账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * BANK_CARD/BALANCE_ACCOUNT，银行卡/余额户
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 额度限制是否激活
	 */
	@ApiField("active")
	private Boolean active;

	/**
	 * 生效时间
	 */
	@ApiField("effective_time")
	private Date effectiveTime;

	/**
	 * 过期时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 额度配置附言
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * OUT/IN，流出限额/流入限额
	 */
	@ApiField("quota_mode")
	private String quotaMode;

	/**
	 * 额度金额，默认人民币币种
	 */
	@ApiField("quota_value")
	private String quotaValue;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Boolean getActive() {
		return this.active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	public Date getEffectiveTime() {
		return this.effectiveTime;
	}
	public void setEffectiveTime(Date effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getQuotaMode() {
		return this.quotaMode;
	}
	public void setQuotaMode(String quotaMode) {
		this.quotaMode = quotaMode;
	}

	public String getQuotaValue() {
		return this.quotaValue;
	}
	public void setQuotaValue(String quotaValue) {
		this.quotaValue = quotaValue;
	}

}
