package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用报告查询接口
 *
 * @author auto create
 * @since 1.0, 2025-07-02 16:55:14
 */
public class ZhimaCreditEpReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8883914196671696472L;

	/**
	 * 企信生成的报告订单号，用于唯一查询
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 报告类型。可选PDF和H5，不传入默认PDF
	 */
	@ApiField("report_type")
	private String reportType;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getReportType() {
		return this.reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

}
