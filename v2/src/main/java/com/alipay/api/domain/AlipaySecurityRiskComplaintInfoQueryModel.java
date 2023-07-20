package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询消费者投诉详情
 *
 * @author auto create
 * @since 1.0, 2023-07-19 16:11:55
 */
public class AlipaySecurityRiskComplaintInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3551326847847218393L;

	/**
	 * 投诉主表主键id
	 */
	@ApiField("complain_id")
	private String complainId;

	public String getComplainId() {
		return this.complainId;
	}
	public void setComplainId(String complainId) {
		this.complainId = complainId;
	}

}
