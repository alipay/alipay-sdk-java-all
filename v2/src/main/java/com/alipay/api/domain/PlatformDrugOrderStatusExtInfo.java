package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 药品单状态扩展字段
 *
 * @author auto create
 * @since 1.0, 2024-11-14 15:17:13
 */
public class PlatformDrugOrderStatusExtInfo extends AlipayObject {

	private static final long serialVersionUID = 3167494245931961561L;

	/**
	 * 退款时间
	 */
	@ApiField("gmt_refund")
	private Date gmtRefund;

	/**
	 * 物流公司
	 */
	@ApiField("logistics_company")
	private String logisticsCompany;

	/**
	 * 物流单号
	 */
	@ApiField("logistics_id")
	private String logisticsId;

	/**
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	public Date getGmtRefund() {
		return this.gmtRefund;
	}
	public void setGmtRefund(Date gmtRefund) {
		this.gmtRefund = gmtRefund;
	}

	public String getLogisticsCompany() {
		return this.logisticsCompany;
	}
	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}

	public String getLogisticsId() {
		return this.logisticsId;
	}
	public void setLogisticsId(String logisticsId) {
		this.logisticsId = logisticsId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

}
