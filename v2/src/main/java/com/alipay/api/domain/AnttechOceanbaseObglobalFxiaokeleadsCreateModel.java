package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 纷享销客创建海图商机
 *
 * @author auto create
 * @since 1.0, 2024-04-07 15:28:30
 */
public class AnttechOceanbaseObglobalFxiaokeleadsCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4459865483154715638L;

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
