package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.document.segment.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-05 18:12:39
 */
public class AlipayCloudCloudpromoDocumentSegmentDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 7115652193411521365L;

	/** 
	 * 成功删除分段数目
	 */
	@ApiField("delete_num")
	private Long deleteNum;

	public void setDeleteNum(Long deleteNum) {
		this.deleteNum = deleteNum;
	}
	public Long getDeleteNum( ) {
		return this.deleteNum;
	}

}
