package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消售后单
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:13:15
 */
public class AlipayCloudCloudpromoMallRenfundorderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6148693445999791832L;

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
