package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insserviceprod.serinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 03:00:07
 */
public class AlipayInsSceneInsserviceprodSerinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3618976643217743996L;

	/** 
	 * 支付宝的单据编号
(就是请求中的ser_biz_no原封不动返回)
	 */
	@ApiField("ser_biz_no")
	private String serBizNo;

	public void setSerBizNo(String serBizNo) {
		this.serBizNo = serBizNo;
	}
	public String getSerBizNo( ) {
		return this.serBizNo;
	}

}
