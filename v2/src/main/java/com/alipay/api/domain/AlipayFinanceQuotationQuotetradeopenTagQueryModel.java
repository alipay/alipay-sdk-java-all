package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行情标签查询
 *
 * @author auto create
 * @since 1.0, 2025-10-10 17:22:47
 */
public class AlipayFinanceQuotationQuotetradeopenTagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7754168884233681929L;

	/**
	 * 标签查询请求，必传
	 */
	@ApiField("obj_tag_request")
	private ObjTagRequest objTagRequest;

	public ObjTagRequest getObjTagRequest() {
		return this.objTagRequest;
	}
	public void setObjTagRequest(ObjTagRequest objTagRequest) {
		this.objTagRequest = objTagRequest;
	}

}
