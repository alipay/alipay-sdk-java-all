package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益同步结果查询
 *
 * @author auto create
 * @since 1.0, 2026-06-25 11:15:39
 */
public class AlipayOverseasTravelBenefitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8378525816738972737L;

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
