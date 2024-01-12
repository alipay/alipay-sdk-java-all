package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 纷享销客更新海图商机	
 *
 * @author auto create
 * @since 1.0, 2023-10-19 09:22:17
 */
public class AnttechOceanbaseObglobalLeadsModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5334598631728448115L;

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
