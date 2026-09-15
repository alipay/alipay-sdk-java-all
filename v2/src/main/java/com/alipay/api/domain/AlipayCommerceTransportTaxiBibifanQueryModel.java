package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合作伙伴查询司机笔笔返活动详情
 *
 * @author auto create
 * @since 1.0, 2026-09-04 13:52:49
 */
public class AlipayCommerceTransportTaxiBibifanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8561598633491692514L;

	/**
	 * 司机身份证号
	 */
	@ApiField("driver_cert_no")
	private String driverCertNo;

	/**
	 * 查询截止时间-时间区间不超过1天
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 不同服务商来自不同
	 */
	@ApiField("source")
	private String source;

	/**
	 * 查询开始时间
	 */
	@ApiField("start_date")
	private String startDate;

	public String getDriverCertNo() {
		return this.driverCertNo;
	}
	public void setDriverCertNo(String driverCertNo) {
		this.driverCertNo = driverCertNo;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
