package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量删除小程序硬件设备
 *
 * @author auto create
 * @since 1.0, 2021-08-26 20:57:43
 */
public class AlipayOpenMiniAmpeDeviceDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3163464294774898831L;

	/**
	 * 厂商在对应设备产品和机型下已添加的设备ID，单次最多提交200个
	 */
	@ApiListField("device_id_list")
	@ApiField("string")
	private List<String> deviceIdList;

	/**
	 * 设备产品下具体的一个机型ID，由系统生成
	 */
	@ApiField("model_id")
	private String modelId;

	/**
	 * 设备产品的productId，由系统生成
	 */
	@ApiField("product_id")
	private Long productId;

	public List<String> getDeviceIdList() {
		return this.deviceIdList;
	}
	public void setDeviceIdList(List<String> deviceIdList) {
		this.deviceIdList = deviceIdList;
	}

	public String getModelId() {
		return this.modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

}
