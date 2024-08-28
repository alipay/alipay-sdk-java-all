package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益同步结果查询
 *
 * @author auto create
 * @since 1.0, 2022-11-17 18:07:15
 */
public class AlipayOverseasTravelBenefitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8199536546478726822L;

	/**
	 * 权益同步时传递的业务幂等号
	 */
	@ApiField("sync_out_biz_no")
	private String syncOutBizNo;

	public String getSyncOutBizNo() {
		return this.syncOutBizNo;
	}
	public void setSyncOutBizNo(String syncOutBizNo) {
		this.syncOutBizNo = syncOutBizNo;
	}

}
