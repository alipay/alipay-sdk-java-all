package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 每日租车费
 *
 * @author auto create
 * @since 1.0, 2024-06-19 11:57:47
 */
public class DailyCarRentalFee extends AlipayObject {

	private static final long serialVersionUID = 1439441948791692729L;

	/**
	 * 当日租金的金额，单位为分，注意金额是优惠前的
	 */
	@ApiField("rent_fee")
	private Long rentFee;

	/**
	 * 租车的时间（只需要精确到日）
	 */
	@ApiField("rental_date")
	private Date rentalDate;

	public Long getRentFee() {
		return this.rentFee;
	}
	public void setRentFee(Long rentFee) {
		this.rentFee = rentFee;
	}

	public Date getRentalDate() {
		return this.rentalDate;
	}
	public void setRentalDate(Date rentalDate) {
		this.rentalDate = rentalDate;
	}

}
