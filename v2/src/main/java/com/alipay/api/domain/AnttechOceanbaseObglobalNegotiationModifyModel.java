package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * CRM同步合同磋商
 *
 * @author auto create
 * @since 1.0, 2025-12-01 19:22:42
 */
public class AnttechOceanbaseObglobalNegotiationModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4181713968588795762L;

	/**
	 * 入参
	 */
	@ApiField("fxiaoke_update_contract_request")
	private FxiaokeUpdateContractRequest fxiaokeUpdateContractRequest;

	public FxiaokeUpdateContractRequest getFxiaokeUpdateContractRequest() {
		return this.fxiaokeUpdateContractRequest;
	}
	public void setFxiaokeUpdateContractRequest(FxiaokeUpdateContractRequest fxiaokeUpdateContractRequest) {
		this.fxiaokeUpdateContractRequest = fxiaokeUpdateContractRequest;
	}

}
