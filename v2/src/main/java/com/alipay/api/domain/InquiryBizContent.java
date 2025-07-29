package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预问诊病例查询业务实体
 *
 * @author auto create
 * @since 1.0, 2025-03-28 15:53:12
 */
public class InquiryBizContent extends AlipayObject {

	private static final long serialVersionUID = 1816219332527766385L;

	/**
	 * 是否存在预问诊病例
	 */
	@ApiField("has_record")
	private Boolean hasRecord;

	public Boolean getHasRecord() {
		return this.hasRecord;
	}
	public void setHasRecord(Boolean hasRecord) {
		this.hasRecord = hasRecord;
	}

}
