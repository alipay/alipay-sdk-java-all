package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insserviceprod.serinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 13:08:20
 */
public class AlipayInsSceneInsserviceprodSerinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6489423311776819777L;

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
