package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备机型信息
 *
 * @author auto create
 * @since 1.0, 2023-10-16 19:33:09
 */
public class AmpeDeviceModelInfo extends AlipayObject {

	private static final long serialVersionUID = 7829769422332281651L;

	/**
	 * 硬件参数
	 */
	@ApiField("hardware_params")
	private String hardwareParams;

	/**
	 * 机型id
	 */
	@ApiField("model_id")
	private Long modelId;

	/**
	 * 机型名称
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * 机型编号
	 */
	@ApiField("model_no")
	private String modelNo;

	public String getHardwareParams() {
		return this.hardwareParams;
	}
	public void setHardwareParams(String hardwareParams) {
		this.hardwareParams = hardwareParams;
	}

	public Long getModelId() {
		return this.modelId;
	}
	public void setModelId(Long modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelNo() {
		return this.modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

}
