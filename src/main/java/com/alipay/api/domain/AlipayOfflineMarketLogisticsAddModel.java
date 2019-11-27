package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑到家业务，外部商户的物流信息变动后追加到订单上
 *
 * @author auto create
 * @since 1.0, 2015-12-07 10:37:55
 */
public class AlipayOfflineMarketLogisticsAddModel extends AlipayObject {

	private static final long serialVersionUID = 5825313326317469333L;

	/**
	 * 外部商户物流单号
	 */
	@ApiField("external_logistics_id")
	private String externalLogisticsId;

	/**
	 * 物流信息
	 */
	@ApiField("logistics_desc")
	private String logisticsDesc;

	/**
	 * 物流时间
	 */
	@ApiField("logistics_time")
	private String logisticsTime;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getExternalLogisticsId() {
		return this.externalLogisticsId;
	}
	public void setExternalLogisticsId(String externalLogisticsId) {
		this.externalLogisticsId = externalLogisticsId;
	}

	public String getLogisticsDesc() {
		return this.logisticsDesc;
	}
	public void setLogisticsDesc(String logisticsDesc) {
		this.logisticsDesc = logisticsDesc;
	}

	public String getLogisticsTime() {
		return this.logisticsTime;
	}
	public void setLogisticsTime(String logisticsTime) {
		this.logisticsTime = logisticsTime;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
