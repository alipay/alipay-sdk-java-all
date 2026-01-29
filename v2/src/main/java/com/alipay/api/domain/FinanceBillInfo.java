package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金融服务子单信息
 *
 * @author auto create
 * @since 1.0, 2025-12-17 16:57:34
 */
public class FinanceBillInfo extends AlipayObject {

	private static final long serialVersionUID = 4541927799398645766L;

	/**
	 * 子单状态
	 */
	@ApiField("bill_state")
	private String billState;

	/**
	 * 子单类型
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 子单详情
	 */
	@ApiField("detail_info")
	private String detailInfo;

	/**
	 * 子单id
	 */
	@ApiField("finance_bill_id")
	private String financeBillId;

	public String getBillState() {
		return this.billState;
	}
	public void setBillState(String billState) {
		this.billState = billState;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getDetailInfo() {
		return this.detailInfo;
	}
	public void setDetailInfo(String detailInfo) {
		this.detailInfo = detailInfo;
	}

	public String getFinanceBillId() {
		return this.financeBillId;
	}
	public void setFinanceBillId(String financeBillId) {
		this.financeBillId = financeBillId;
	}

}
