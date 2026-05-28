package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰点餐物料铺设回传查询
 *
 * @author auto create
 * @since 1.0, 2026-05-19 10:46:45
 */
public class AlipayOpenSpNordermaterialsapplyMaterialsrecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2268959286796864375L;

	/**
	 * 铺设记录ID
	 */
	@ApiField("record_id")
	private String recordId;

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

}
