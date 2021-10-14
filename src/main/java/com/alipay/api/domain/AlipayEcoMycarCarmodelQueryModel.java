package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询车型详情信息接口
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:52:12
 */
public class AlipayEcoMycarCarmodelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8364741939242359812L;

	/**
	 * 支付宝车型库车型编号,系统唯一。
	 */
	@ApiField("model_id")
	private String modelId;

	public String getModelId() {
		return this.modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

}
