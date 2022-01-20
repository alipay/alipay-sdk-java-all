package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流信息; 订单信息包含物流信息时，必填; 列表最多支持物流信 息个数;最大支持10个 
注:若该值不为空，且物流信息同步至我的快递，则在查询订单 时可返回具体物流信息
 *
 * @author auto create
 * @since 1.0, 2021-10-11 17:20:12
 */
public class OrderLogisticsInformationRequestDTO extends AlipayObject {

	private static final long serialVersionUID = 2159982878765619187L;

	/**
	 * 物流公司编号。
注：该值为空时，有可能匹配不到物流信息。若有则必传
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 物流单号，logistics_info_list不为空时，必填
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
