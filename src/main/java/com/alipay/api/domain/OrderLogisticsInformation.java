package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单物流信息
 *
 * @author auto create
 * @since 1.0, 2019-08-01 14:52:30
 */
public class OrderLogisticsInformation extends AlipayObject {

	private static final long serialVersionUID = 1572194942679683121L;

	/**
	 * 物流公司名称
	 */
	@ApiField("express_company")
	private String expressCompany;

	/**
	 * 物流单号
	 */
	@ApiField("tracking_no")
	private String trackingNo;

	public String getExpressCompany() {
		return this.expressCompany;
	}
	public void setExpressCompany(String expressCompany) {
		this.expressCompany = expressCompany;
	}

	public String getTrackingNo() {
		return this.trackingNo;
	}
	public void setTrackingNo(String trackingNo) {
		this.trackingNo = trackingNo;
	}

}
