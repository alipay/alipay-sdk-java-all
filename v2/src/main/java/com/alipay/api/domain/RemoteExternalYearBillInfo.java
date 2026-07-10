package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 按年外部账单
 *
 * @author auto create
 * @since 1.0, 2026-06-25 14:11:27
 */
public class RemoteExternalYearBillInfo extends AlipayObject {

	private static final long serialVersionUID = 8326619757323773133L;

	/**
	 * 账单明细
	 */
	@ApiListField("external_bill_details")
	@ApiField("remote_external_bill_detail")
	private List<RemoteExternalBillDetail> externalBillDetails;

	/**
	 * 年分组总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 年份
	 */
	@ApiField("year")
	private String year;

	public List<RemoteExternalBillDetail> getExternalBillDetails() {
		return this.externalBillDetails;
	}
	public void setExternalBillDetails(List<RemoteExternalBillDetail> externalBillDetails) {
		this.externalBillDetails = externalBillDetails;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getYear() {
		return this.year;
	}
	public void setYear(String year) {
		this.year = year;
	}

}
