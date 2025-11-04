package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 纷享销客更新海图商机	
 *
 * @author auto create
 * @since 1.0, 2024-04-07 15:28:19
 */
public class AnttechOceanbaseObglobalLeadsModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5412444773623926632L;

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
