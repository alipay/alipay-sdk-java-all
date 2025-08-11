package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店快递信息
 *
 * @author auto create
 * @since 1.0, 2025-04-18 16:08:05
 */
public class ShopDeliveryInfo extends AlipayObject {

	private static final long serialVersionUID = 6866974965689921411L;

	/**
	 * 发货物流状态
	 */
	@ApiField("delivery_status")
	private String deliveryStatus;

	/**
	 * 发货时间
	 */
	@ApiField("delivery_time")
	private Date deliveryTime;

	/**
	 * 物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 发货的物流公司
	 */
	@ApiField("logistics_name")
	private String logisticsName;

	/**
	 * 物流的物料数量，单位 个
	 */
	@ApiField("materials_num")
	private Long materialsNum;

	/**
	 * 生产完成时间
	 */
	@ApiField("produce_finish_time")
	private Date produceFinishTime;

	/**
	 * 签收时间
	 */
	@ApiField("received_time")
	private Date receivedTime;

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

	public Date getDeliveryTime() {
		return this.deliveryTime;
	}
	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getLogisticsName() {
		return this.logisticsName;
	}
	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

	public Long getMaterialsNum() {
		return this.materialsNum;
	}
	public void setMaterialsNum(Long materialsNum) {
		this.materialsNum = materialsNum;
	}

	public Date getProduceFinishTime() {
		return this.produceFinishTime;
	}
	public void setProduceFinishTime(Date produceFinishTime) {
		this.produceFinishTime = produceFinishTime;
	}

	public Date getReceivedTime() {
		return this.receivedTime;
	}
	public void setReceivedTime(Date receivedTime) {
		this.receivedTime = receivedTime;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
