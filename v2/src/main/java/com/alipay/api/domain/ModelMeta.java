package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模型列表信息
 *
 * @author auto create
 * @since 1.0, 2017-04-27 14:36:19
 */
public class ModelMeta extends AlipayObject {

	private static final long serialVersionUID = 7845155818991412156L;

	/**
	 * 模型描述
	 */
	@ApiField("model_desc")
	private String modelDesc;

	/**
	 * 模型名称
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * 模型唯一查询标识符
	 */
	@ApiField("model_uk")
	private String modelUk;

	/**
	 * 查询参数
	 */
	@ApiListField("query_key")
	@ApiField("string")
	private List<String> queryKey;

	public String getModelDesc() {
		return this.modelDesc;
	}
	public void setModelDesc(String modelDesc) {
		this.modelDesc = modelDesc;
	}

	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelUk() {
		return this.modelUk;
	}
	public void setModelUk(String modelUk) {
		this.modelUk = modelUk;
	}

	public List<String> getQueryKey() {
		return this.queryKey;
	}
	public void setQueryKey(List<String> queryKey) {
		this.queryKey = queryKey;
	}

}
