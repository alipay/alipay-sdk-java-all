package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签操作
 *
 * @author auto create
 * @since 1.0, 2023-10-19 09:21:46
 */
public class AnttechOceanbaseObglobalTagCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 7285833878539411887L;

	/**
	 * 标签操作请求体
	 */
	@ApiField("operate_tag_request")
	private TagOperationRequest operateTagRequest;

	public TagOperationRequest getOperateTagRequest() {
		return this.operateTagRequest;
	}
	public void setOperateTagRequest(TagOperationRequest operateTagRequest) {
		this.operateTagRequest = operateTagRequest;
	}

}
