package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务数据，类型为ObjKLineDTOWrapper
 *
 * @author auto create
 * @since 1.0, 2026-03-24 16:27:46
 */
public class ObjKLineDTOWrapper extends AlipayObject {

	private static final long serialVersionUID = 3384666388667168136L;

	/**
	 * 业务数据，类型为ObjKLineDTOWrapper
	 */
	@ApiField("data")
	private ObjKLineDTO data;

	public ObjKLineDTO getData() {
		return this.data;
	}
	public void setData(ObjKLineDTO data) {
		this.data = data;
	}

}
