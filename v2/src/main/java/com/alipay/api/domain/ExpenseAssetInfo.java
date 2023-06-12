package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消耗资产明细
 *
 * @author auto create
 * @since 1.0, 2023-03-10 22:04:42
 */
public class ExpenseAssetInfo extends AlipayObject {

	private static final long serialVersionUID = 1176819827792859968L;

	/**
	 * 资产ID
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产类型
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 资产归属员工的ID
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 员工OPENID
	 */
	@ApiField("employee_open_id")
	private String employeeOpenId;

	/**
	 * 支付业务类型
	 */
	@ApiField("pay_biz_type")
	private String payBizType;

	/**
	 * 消耗资产的额度，单位分
	 */
	@ApiField("peer_pay_amount")
	private String peerPayAmount;

	/**
	 * 退款号
	 */
	@ApiField("refund_id")
	private String refundId;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeOpenId() {
		return this.employeeOpenId;
	}
	public void setEmployeeOpenId(String employeeOpenId) {
		this.employeeOpenId = employeeOpenId;
	}

	public String getPayBizType() {
		return this.payBizType;
	}
	public void setPayBizType(String payBizType) {
		this.payBizType = payBizType;
	}

	public String getPeerPayAmount() {
		return this.peerPayAmount;
	}
	public void setPeerPayAmount(String peerPayAmount) {
		this.peerPayAmount = peerPayAmount;
	}

	public String getRefundId() {
		return this.refundId;
	}
	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

}
