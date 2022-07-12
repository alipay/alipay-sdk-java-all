package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销活动审批结果查询
 *
 * @author auto create
 * @since 1.0, 2020-01-10 17:35:00
 */
public class AlipayCommerceTransportVehicleownerCampaignauditQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3577925577651841417L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 外部订单号,商户端唯一
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

}
