package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单物流信息请求
 *
 * @author auto create
 * @since 1.0, 2020-06-20 11:02:46
 */
public class OrderLogisticsInformationRequest extends AlipayObject {

	private static final long serialVersionUID = 6227891444332364627L;

	/**
	 * 物流公司编号。

物流公司编号值请查看产品文档
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 物流单号
	 */
	@ApiField("tracking_no")
	private String trackingNo;

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getTrackingNo() {
		return this.trackingNo;
	}
	public void setTrackingNo(String trackingNo) {
		this.trackingNo = trackingNo;
	}

}
