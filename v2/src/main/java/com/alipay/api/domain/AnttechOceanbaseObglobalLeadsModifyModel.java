package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 纷享销客更新海图商机	
 *
 * @author auto create
 * @since 1.0, 2026-03-30 16:03:53
 */
public class AnttechOceanbaseObglobalLeadsModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4588653343762919441L;

	/**
	 * 纷享销客更新leads
	 */
	@ApiField("fxiaoke_update_leads_request")
	private FxiaokeUpdateLeadsRequest fxiaokeUpdateLeadsRequest;

	public FxiaokeUpdateLeadsRequest getFxiaokeUpdateLeadsRequest() {
		return this.fxiaokeUpdateLeadsRequest;
	}
	public void setFxiaokeUpdateLeadsRequest(FxiaokeUpdateLeadsRequest fxiaokeUpdateLeadsRequest) {
		this.fxiaokeUpdateLeadsRequest = fxiaokeUpdateLeadsRequest;
	}

}
