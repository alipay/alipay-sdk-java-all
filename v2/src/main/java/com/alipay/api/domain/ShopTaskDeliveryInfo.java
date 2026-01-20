package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店物流信息状态
 *
 * @author auto create
 * @since 1.0, 2025-03-20 11:12:53
 */
public class ShopTaskDeliveryInfo extends AlipayObject {

	private static final long serialVersionUID = 1235244353245945611L;

	/**
	 * ● PRODUCING：生产中
● DELIVERING：已发货
为空时代表支付宝暂时还未处理该单
	 */
	@ApiField("delivery_status")
	private String deliveryStatus;

	/**
	 * 快递公司名称，可空
	 */
	@ApiField("logistics_name")
	private String logisticsName;

	/**
	 * 快递单号，可空
	 */
	@ApiField("way_bill_no")
	private String wayBillNo;

	public String getDeliveryStatus() {
		return this.deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getLogisticsName() {
		return this.logisticsName;
	}
	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

	public String getWayBillNo() {
		return this.wayBillNo;
	}
	public void setWayBillNo(String wayBillNo) {
		this.wayBillNo = wayBillNo;
	}

}
