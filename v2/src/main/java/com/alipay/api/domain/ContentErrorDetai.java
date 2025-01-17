package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 内容品检错误明细
 *
 * @author auto create
 * @since 1.0, 2024-09-23 10:33:33
 */
public class ContentErrorDetai extends AlipayObject {

	private static final long serialVersionUID = 3247481582878344319L;

	/**
	 * 品检后具体错误项，包含错误字段，原本正确值，以及错误值
	 */
	@ApiListField("error_contents")
	@ApiField("content_error_line")
	private List<ContentErrorLine> errorContents;

	/**
	 * 实体物料唯一ID标识，它代表唯一一个实体物料
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public List<ContentErrorLine> getErrorContents() {
		return this.errorContents;
	}
	public void setErrorContents(List<ContentErrorLine> errorContents) {
		this.errorContents = errorContents;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
