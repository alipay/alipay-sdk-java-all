package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物流运单信息
 *
 * @author auto create
 * @since 1.0, 2024-12-17 10:52:38
 */
public class LogisticsWaybill extends AlipayObject {

	private static final long serialVersionUID = 1888275725589469283L;

	/**
	 * 用户自行寄件退货时填写的补充描述
	 */
	@ApiField("additional_reason")
	private String additionalReason;

	/**
	 * 物流公司编号
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 用户自行寄回商品时，补充上传的证明图片和视频信息
	 */
	@ApiListField("logistics_media_list")
	@ApiField("order_media_info")
	private List<OrderMediaInfo> logisticsMediaList;

	/**
	 * 退货寄送方式
	 */
	@ApiField("return_delivery_type")
	private String returnDeliveryType;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 物流详情
	 */
	@ApiListField("steps")
	@ApiField("waybill_step")
	private List<WaybillStep> steps;

	/**
	 * 运单号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public String getAdditionalReason() {
		return this.additionalReason;
	}
	public void setAdditionalReason(String additionalReason) {
		this.additionalReason = additionalReason;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public List<OrderMediaInfo> getLogisticsMediaList() {
		return this.logisticsMediaList;
	}
	public void setLogisticsMediaList(List<OrderMediaInfo> logisticsMediaList) {
		this.logisticsMediaList = logisticsMediaList;
	}

	public String getReturnDeliveryType() {
		return this.returnDeliveryType;
	}
	public void setReturnDeliveryType(String returnDeliveryType) {
		this.returnDeliveryType = returnDeliveryType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<WaybillStep> getSteps() {
		return this.steps;
	}
	public void setSteps(List<WaybillStep> steps) {
		this.steps = steps;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
