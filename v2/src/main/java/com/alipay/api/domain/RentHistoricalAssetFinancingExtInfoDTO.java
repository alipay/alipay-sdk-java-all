package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁历史融资扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-09-16 20:02:25
 */
public class RentHistoricalAssetFinancingExtInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2166738869854112285L;

	/**
	 * 已还期数
	 */
	@ApiField("paid_period")
	private Long paidPeriod;

	/**
	 * 已还租金，单位：元。
	 */
	@ApiField("paid_price")
	private String paidPrice;

	/**
	 * 开始融资期数
	 */
	@ApiField("start_financing_period")
	private Long startFinancingPeriod;

	/**
	 * 剩余未还期数
	 */
	@ApiField("unpaid_period")
	private Long unpaidPeriod;

	/**
	 * 剩余未还租金，单位：元。
	 */
	@ApiField("unpaid_price")
	private String unpaidPrice;

	public Long getPaidPeriod() {
		return this.paidPeriod;
	}
	public void setPaidPeriod(Long paidPeriod) {
		this.paidPeriod = paidPeriod;
	}

	public String getPaidPrice() {
		return this.paidPrice;
	}
	public void setPaidPrice(String paidPrice) {
		this.paidPrice = paidPrice;
	}

	public Long getStartFinancingPeriod() {
		return this.startFinancingPeriod;
	}
	public void setStartFinancingPeriod(Long startFinancingPeriod) {
		this.startFinancingPeriod = startFinancingPeriod;
	}

	public Long getUnpaidPeriod() {
		return this.unpaidPeriod;
	}
	public void setUnpaidPeriod(Long unpaidPeriod) {
		this.unpaidPeriod = unpaidPeriod;
	}

	public String getUnpaidPrice() {
		return this.unpaidPrice;
	}
	public void setUnpaidPrice(String unpaidPrice) {
		this.unpaidPrice = unpaidPrice;
	}

}
