package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量添加小程序硬件设备
 *
 * @author auto create
 * @since 1.0, 2020-04-14 19:12:20
 */
public class AlipayOpenMiniAmpeDeviceAddModel extends AlipayObject {

	private static final long serialVersionUID = 8445563515114538981L;

	/**
	 * 用于标识厂商单个设备产品下唯一的一个设备，推荐使用厂商自己定义的序列号。单次最多提交200个，如果productId下已存在deviceId，会被更新为最新一次提交的数据
	 */
	@ApiListField("device_id_list")
	@ApiField("string")
	private List<String> deviceIdList;

	/**
	 * 设备产品下具体的一个机型ID，由系统生成
	 */
	@ApiField("model_id")
	private Long modelId;

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

	public Long getModelId() {
		return this.modelId;
	}
	public void setModelId(Long modelId) {
		this.modelId = modelId;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

}
