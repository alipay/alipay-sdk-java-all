package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取售后单详情
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:14:28
 */
public class AlipayCloudCloudpromoMallRenfundorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3454392668297668513L;

	/**
	 * 纠纷id
	 */
	@ApiField("dispute_id")
	private String disputeId;

	public String getDisputeId() {
		return this.disputeId;
	}
	public void setDisputeId(String disputeId) {
		this.disputeId = disputeId;
	}

}
