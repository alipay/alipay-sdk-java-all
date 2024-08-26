package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.unicom.mobile.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipayUserUnicomMobileSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3444223116122496723L;

	/** 
	 * 业务处理结果（成功: SUCCESS, 失败: FAIL, 重试: RETRY）
	 */
	@ApiField("mobile_sync_result")
	private String mobileSyncResult;

	/** 
	 * 回传的业务流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setMobileSyncResult(String mobileSyncResult) {
		this.mobileSyncResult = mobileSyncResult;
	}
	public String getMobileSyncResult( ) {
		return this.mobileSyncResult;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
