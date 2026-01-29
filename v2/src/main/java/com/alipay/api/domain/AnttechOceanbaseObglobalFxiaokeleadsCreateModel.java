package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 纷享销客创建海图商机
 *
 * @author auto create
 * @since 1.0, 2026-01-26 17:54:08
 */
public class AnttechOceanbaseObglobalFxiaokeleadsCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6428928981914853387L;

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
