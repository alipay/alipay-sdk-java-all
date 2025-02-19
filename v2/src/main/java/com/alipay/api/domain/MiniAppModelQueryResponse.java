package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁域小程序核心模型查询接口返回对象
 *
 * @author auto create
 * @since 1.0, 2019-05-08 10:09:45
 */
public class MiniAppModelQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 5386964384445919998L;

	/**
	 * 模型查询类型
	 */
	@ApiField("model_type")
	private String modelType;

	/**
	 * 小程序核心模型的json化字符串
	 */
	@ApiListField("records")
	@ApiField("string")
	private List<String> records;

	public String getModelType() {
		return this.modelType;
	}
	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public List<String> getRecords() {
		return this.records;
	}
	public void setRecords(List<String> records) {
		this.records = records;
	}

}
