package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * icrowd接口请求参数模型
 *
 * @author auto create
 * @since 1.0, 2018-10-25 11:00:24
 */
public class IcrowdUseParam extends AlipayObject {

	private static final long serialVersionUID = 1813982674272472346L;

	/**
	 * 接口上下文
	 */
	@ApiField("context")
	private IcrowdUseContext context;

	/**
	 * 额外信息
	 */
	@ApiListField("external_info")
	@ApiField("string")
	private List<String> externalInfo;

	/**
	 * 要调用的方法ID
	 */
	@ApiField("method_id")
	private String methodId;

	public IcrowdUseContext getContext() {
		return this.context;
	}
	public void setContext(IcrowdUseContext context) {
		this.context = context;
	}

	public List<String> getExternalInfo() {
		return this.externalInfo;
	}
	public void setExternalInfo(List<String> externalInfo) {
		this.externalInfo = externalInfo;
	}

	public String getMethodId() {
		return this.methodId;
	}
	public void setMethodId(String methodId) {
		this.methodId = methodId;
	}

}
