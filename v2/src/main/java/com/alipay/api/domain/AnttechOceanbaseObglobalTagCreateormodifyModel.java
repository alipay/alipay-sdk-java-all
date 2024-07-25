package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签操作
 *
 * @author auto create
 * @since 1.0, 2024-04-07 15:28:41
 */
public class AnttechOceanbaseObglobalTagCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 1697267181416547594L;

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
