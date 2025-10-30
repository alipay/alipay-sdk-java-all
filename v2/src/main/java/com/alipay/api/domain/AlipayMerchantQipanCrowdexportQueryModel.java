package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群渠道查询接口
 *
 * @author auto create
 * @since 1.0, 2024-06-05 20:03:54
 */
public class AlipayMerchantQipanCrowdexportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3629299695721541386L;

	/**
	 * 外部业务号，用于查询同步任务
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
