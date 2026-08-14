package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 三方账单分组信息
 *
 * @author auto create
 * @since 1.0, 2026-08-06 10:00:08
 */
public class RemoteExternalBillGroupInfo extends AlipayObject {

	private static final long serialVersionUID = 6264825741564555762L;

	/**
	 * 分组标题
	 */
	@ApiField("bill_info_title")
	private String billInfoTitle;

	/**
	 * 账单明细
	 */
	@ApiListField("external_bill_details")
	@ApiField("remote_external_bill_detail")
	private List<RemoteExternalBillDetail> externalBillDetails;

	/**
	 * 分组总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getBillInfoTitle() {
		return this.billInfoTitle;
	}
	public void setBillInfoTitle(String billInfoTitle) {
		this.billInfoTitle = billInfoTitle;
	}

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

}
