package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 纷享销客创建海图商机
 *
 * @author auto create
 * @since 1.0, 2024-05-20 16:54:56
 */
public class AnttechOceanbaseObglobalFxiaokeleadsCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3529448429969943535L;

	/**
	 * 提供给纷享销客创建商机接口的入参
	 */
	@ApiField("fxiaoke_create_leads_request")
	private FxiaokeCreateLeadsParams fxiaokeCreateLeadsRequest;

	public FxiaokeCreateLeadsParams getFxiaokeCreateLeadsRequest() {
		return this.fxiaokeCreateLeadsRequest;
	}
	public void setFxiaokeCreateLeadsRequest(FxiaokeCreateLeadsParams fxiaokeCreateLeadsRequest) {
		this.fxiaokeCreateLeadsRequest = fxiaokeCreateLeadsRequest;
	}

}
