package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报告文件上传
 *
 * @author auto create
 * @since 1.0, 2026-07-09 10:22:57
 */
public class AlipayCommerceMedicalFulfillmentReportUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7674428616459476837L;

	/**
	 * 履约单ID
	 */
	@ApiField("fulfillment_id")
	private String fulfillmentId;

	/**
	 * null
	 */
	@ApiListField("report_infos")
	@ApiField("fulfillment_report_info_d_t_o")
	private List<FulfillmentReportInfoDTO> reportInfos;

	/**
	 * SAAS订单ID
	 */
	@ApiField("trade_order_id")
	private String tradeOrderId;

	public String getFulfillmentId() {
		return this.fulfillmentId;
	}
	public void setFulfillmentId(String fulfillmentId) {
		this.fulfillmentId = fulfillmentId;
	}

	public List<FulfillmentReportInfoDTO> getReportInfos() {
		return this.reportInfos;
	}
	public void setReportInfos(List<FulfillmentReportInfoDTO> reportInfos) {
		this.reportInfos = reportInfos;
	}

	public String getTradeOrderId() {
		return this.tradeOrderId;
	}
	public void setTradeOrderId(String tradeOrderId) {
		this.tradeOrderId = tradeOrderId;
	}

}
