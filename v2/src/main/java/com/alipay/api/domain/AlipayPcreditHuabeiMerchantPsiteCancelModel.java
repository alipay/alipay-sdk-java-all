package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗分期间连服务商活动取消报名
 *
 * @author auto create
 * @since 1.0, 2025-07-25 09:43:38
 */
public class AlipayPcreditHuabeiMerchantPsiteCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8667756262322174456L;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 报名记录ID
	 */
	@ApiField("record_id")
	private String recordId;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

}
