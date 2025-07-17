package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆估值信息
 *
 * @author auto create
 * @since 1.0, 2024-09-12 09:51:02
 */
public class ValuationInfo extends AlipayObject {

	private static final long serialVersionUID = 4819363287723987581L;

	/**
	 * 车辆估值金额，单位元
	 */
	@ApiField("valuate_price")
	private Long valuatePrice;

	/**
	 * 车辆估值供应商
	 */
	@ApiField("valuate_supplier")
	private String valuateSupplier;

	/**
	 * 车辆估值时间
	 */
	@ApiField("valuate_time")
	private Date valuateTime;

	public Long getValuatePrice() {
		return this.valuatePrice;
	}
	public void setValuatePrice(Long valuatePrice) {
		this.valuatePrice = valuatePrice;
	}

	public String getValuateSupplier() {
		return this.valuateSupplier;
	}
	public void setValuateSupplier(String valuateSupplier) {
		this.valuateSupplier = valuateSupplier;
	}

	public Date getValuateTime() {
		return this.valuateTime;
	}
	public void setValuateTime(Date valuateTime) {
		this.valuateTime = valuateTime;
	}

}
