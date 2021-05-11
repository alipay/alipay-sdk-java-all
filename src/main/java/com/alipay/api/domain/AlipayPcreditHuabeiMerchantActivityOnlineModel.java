package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新版花呗分期商家贴息活动发布接口
 *
 * @author auto create
 * @since 1.0, 2020-12-03 21:08:40
 */
public class AlipayPcreditHuabeiMerchantActivityOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 4161477457777134149L;

	/**
	 * 商家活动ID，用于唯一确定一个活动
	 */
	@ApiField("aggr_id")
	private String aggrId;

	/**
	 * 外部请求号,用于幂等管理
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getAggrId() {
		return this.aggrId;
	}
	public void setAggrId(String aggrId) {
		this.aggrId = aggrId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
