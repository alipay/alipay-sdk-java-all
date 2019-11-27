package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 监管科技图谱一期查询
 *
 * @author auto create
 * @since 1.0, 2019-09-23 17:07:51
 */
public class AlipayIserviceCognitiveYdPhaseoneQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2618545565425769856L;

	/**
	 * 根据服务创建时填写的code为准
	 */
	@ApiField("online_service_code")
	private String onlineServiceCode;

	/**
	 * 传入参数
	 */
	@ApiListField("params")
	@ApiField("string_object_map")
	private List<StringObjectMap> params;

	public String getOnlineServiceCode() {
		return this.onlineServiceCode;
	}
	public void setOnlineServiceCode(String onlineServiceCode) {
		this.onlineServiceCode = onlineServiceCode;
	}

	public List<StringObjectMap> getParams() {
		return this.params;
	}
	public void setParams(List<StringObjectMap> params) {
		this.params = params;
	}

}
