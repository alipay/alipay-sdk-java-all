package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改设备机型
 *
 * @author auto create
 * @since 1.0, 2024-04-03 11:59:01
 */
public class AlipayOpenMiniAmpeDevicemodelModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1186578528487978616L;

	/**
	 * 硬件参数，选填，三选一，最大长度30
	 */
	@ApiField("hardware_params")
	private String hardwareParams;

	/**
	 * 机型ID，必填
	 */
	@ApiField("model_id")
	private Long modelId;

	/**
	 * 机型名称，选填，三选一，最大长度30，单productId下唯一
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * 机型编号，选填，三选一，最大长度30，单productId下唯一
	 */
	@ApiField("model_no")
	private String modelNo;

	/**
	 * 产品ID，必填
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 场景码，申请后平台分配，必填
	 */
	@ApiField("scene_code")
	private String sceneCode;

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

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
