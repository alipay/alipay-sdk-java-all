package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品配置
 *
 * @author auto create
 * @since 1.0, 2019-07-22 20:03:14
 */
public class PrizeConfig extends AlipayObject {

	private static final long serialVersionUID = 5358555589429158695L;

	/**
	 * 总预算
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 奖品开始时间
	 */
	@ApiField("gmt_begin")
	private Date gmtBegin;

	/**
	 * 奖品结束时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 剩余预算
	 */
	@ApiField("remain_amount")
	private String remainAmount;

	/**
	 * PRIZE_CREATED("PRIZE_CREATED", "已创建状态") PRIZE_OPENED("PRIZE_OPENED", "开启状态") PRIZE_PAUSED("PRIZE_PAUSED", "暂停状态") PRIZE_CLOSED("PRIZE_CLOSED", "关闭状态")
	 */
	@ApiField("status")
	private String status;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getGmtBegin() {
		return this.gmtBegin;
	}
	public void setGmtBegin(Date gmtBegin) {
		this.gmtBegin = gmtBegin;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getRemainAmount() {
		return this.remainAmount;
	}
	public void setRemainAmount(String remainAmount) {
		this.remainAmount = remainAmount;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
