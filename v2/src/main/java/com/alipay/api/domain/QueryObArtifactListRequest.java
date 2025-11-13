package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ob制品查询条件请求体
 *
 * @author auto create
 * @since 1.0, 2025-04-09 16:56:05
 */
public class QueryObArtifactListRequest extends AlipayObject {

	private static final long serialVersionUID = 8577688631861492467L;

	/**
	 * 制品使用类型
	 */
	@ApiField("use_type_str")
	private String useTypeStr;

	/**
	 * 制品版本
	 */
	@ApiField("version_tag_str")
	private String versionTagStr;

	public String getUseTypeStr() {
		return this.useTypeStr;
	}
	public void setUseTypeStr(String useTypeStr) {
		this.useTypeStr = useTypeStr;
	}

	public String getVersionTagStr() {
		return this.versionTagStr;
	}
	public void setVersionTagStr(String versionTagStr) {
		this.versionTagStr = versionTagStr;
	}

}
