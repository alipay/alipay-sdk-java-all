package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料上传结果详情
 *
 * @author auto create
 * @since 1.0, 2024-07-19 16:30:24
 */
public class MaterialUploadDetail extends AlipayObject {

	private static final long serialVersionUID = 8824362465519354385L;

	/**
	 * 广告投放平台生成的物料实例ID
	 */
	@ApiField("material_instance_id")
	private Long materialInstanceId;

	/**
	 * SUCCESS-成功
FAILED-失败
PROCESSING-处理中
	 */
	@ApiField("status")
	private String status;

	public Long getMaterialInstanceId() {
		return this.materialInstanceId;
	}
	public void setMaterialInstanceId(Long materialInstanceId) {
		this.materialInstanceId = materialInstanceId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
