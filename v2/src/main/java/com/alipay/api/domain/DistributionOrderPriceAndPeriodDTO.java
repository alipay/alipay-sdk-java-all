package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 价格和租期修改信息
 *
 * @author auto create
 * @since 1.0, 2026-09-04 17:07:50
 */
public class DistributionOrderPriceAndPeriodDTO extends AlipayObject {

	private static final long serialVersionUID = 5782725497941534915L;

	/**
	 * 押金，单位为元
	 */
	@ApiField("deposit_price")
	private String depositPrice;

	/**
	 * 运费，单位为元
	 */
	@ApiField("freight")
	private String freight;

	/**
	 * 租期结束时间
	 */
	@ApiField("rent_end_time")
	private Date rentEndTime;

	/**
	 * 租金，当前场景是首期租金，单位为元
	 */
	@ApiField("rent_price")
	private String rentPrice;

	/**
	 * 租期开始时间
	 */
	@ApiField("rent_start_time")
	private Date rentStartTime;

	public String getDepositPrice() {
		return this.depositPrice;
	}
	public void setDepositPrice(String depositPrice) {
		this.depositPrice = depositPrice;
	}

	public String getFreight() {
		return this.freight;
	}
	public void setFreight(String freight) {
		this.freight = freight;
	}

	public Date getRentEndTime() {
		return this.rentEndTime;
	}
	public void setRentEndTime(Date rentEndTime) {
		this.rentEndTime = rentEndTime;
	}

	public String getRentPrice() {
		return this.rentPrice;
	}
	public void setRentPrice(String rentPrice) {
		this.rentPrice = rentPrice;
	}

	public Date getRentStartTime() {
		return this.rentStartTime;
	}
	public void setRentStartTime(Date rentStartTime) {
		this.rentStartTime = rentStartTime;
	}

}
