package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.userinfo.npassporter.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-16 16:25:24
 */
public class AlipayOfflineProviderUserinfoNpassporterDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8762716938494158951L;

	/** 
	 * 出库失败的用户订单号，失败原因一般是订单号未入库。可能为空。
	 */
	@ApiListField("fail_out_biz_no")
	@ApiField("string")
	private List<String> failOutBizNo;

	/** 
	 * 成功出库的用户订单号。如果都不成功，则为空。
	 */
	@ApiListField("success_out_biz_no")
	@ApiField("string")
	private List<String> successOutBizNo;

	public void setFailOutBizNo(List<String> failOutBizNo) {
		this.failOutBizNo = failOutBizNo;
	}
	public List<String> getFailOutBizNo( ) {
		return this.failOutBizNo;
	}

	public void setSuccessOutBizNo(List<String> successOutBizNo) {
		this.successOutBizNo = successOutBizNo;
	}
	public List<String> getSuccessOutBizNo( ) {
		return this.successOutBizNo;
	}

}
