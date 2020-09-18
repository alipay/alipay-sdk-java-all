package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智慧公交---资源上传
 *
 * @author auto create
 * @since 1.0, 2020-05-07 15:30:06
 */
public class AlipayDataAiserviceCloudbusResourceUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3795574858834391696L;

	/**
	 * 内容字段
	 */
	@ApiField("data")
	private String data;

	/**
	 * 资源名称
	 */
	@ApiField("res_name")
	private String resName;

	/**
	 * 资源类型
	 */
	@ApiField("type")
	private Long type;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getResName() {
		return this.resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
