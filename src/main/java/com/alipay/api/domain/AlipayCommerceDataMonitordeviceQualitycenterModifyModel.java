package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能机具监控对接质量中心
 *
 * @author auto create
 * @since 1.0, 2018-04-11 10:35:40
 */
public class AlipayCommerceDataMonitordeviceQualitycenterModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6595238681334567348L;

	/**
	 * device_id, 唯一标识设备，由openmonitor传递到质量中心。
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * fault_type，标识设备故障类型，由openmonitor传递到质量中心。
	 */
	@ApiField("fault_type")
	private String faultType;

	/**
	 * invoke_id, 用来回溯监控中心的调用方id，监控中心生成
	 */
	@ApiField("invoke_id")
	private Long invokeId;

	/**
	 * quality_center_id，唯一，用于问题追踪去重，质量中心生成的唯一id。
	 */
	@ApiField("quality_center_id")
	private String qualityCenterId;

	/**
	 * result, 机具处理结果，由质量中心生成。
	 */
	@ApiField("result")
	private String result;

	/**
	 * result_date, 处理结果的时间，质量中心生成。
	 */
	@ApiField("result_date")
	private Date resultDate;

	/**
	 * result_msg，处理结果的描述，质量中心生成。
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getFaultType() {
		return this.faultType;
	}
	public void setFaultType(String faultType) {
		this.faultType = faultType;
	}

	public Long getInvokeId() {
		return this.invokeId;
	}
	public void setInvokeId(Long invokeId) {
		this.invokeId = invokeId;
	}

	public String getQualityCenterId() {
		return this.qualityCenterId;
	}
	public void setQualityCenterId(String qualityCenterId) {
		this.qualityCenterId = qualityCenterId;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public Date getResultDate() {
		return this.resultDate;
	}
	public void setResultDate(Date resultDate) {
		this.resultDate = resultDate;
	}

	public String getResultMsg() {
		return this.resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

}
