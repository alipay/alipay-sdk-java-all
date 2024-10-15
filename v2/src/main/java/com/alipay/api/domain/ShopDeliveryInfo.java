package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店快递信息
 *
 * @author auto create
 * @since 1.0, 2024-09-11 09:52:54
 */
public class ShopDeliveryInfo extends AlipayObject {

	private static final long serialVersionUID = 6728929481179299432L;

	/**
	 * 发货物流状态
	 */
	@ApiField("delivery_status")
	private String deliveryStatus;

	/**
	 * 物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 物流的物料数量，单位 个
	 */
	@ApiField("materials_num")
	private Long materialsNum;

	/**
	 * 快递物流单号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public String getDeliveryStatus() {
		return this.deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public Long getMaterialsNum() {
		return this.materialsNum;
	}
	public void setMaterialsNum(Long materialsNum) {
		this.materialsNum = materialsNum;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
