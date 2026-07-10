package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-12 15:32:55
 */
public class ServiceTagSyncFailInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5466496534311154486L;

	/**
	 * 标签同步的失败描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 服务标签元数据的编码
	 */
	@ApiField("tag_code")
	private String tagCode;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

}
