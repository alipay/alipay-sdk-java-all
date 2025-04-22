package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 聚积宝券核销消息转发接口
 *
 * @author auto create
 * @since 1.0, 2024-11-28 14:26:06
 */
public class AlipayMerchantJujibaovoucherVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 4763612795519199458L;

	/**
	 * 移动核销入参根节点
	 */
	@ApiField("contract_root")
	private ChinaMobileContractRoot contractRoot;

	public ChinaMobileContractRoot getContractRoot() {
		return this.contractRoot;
	}
	public void setContractRoot(ChinaMobileContractRoot contractRoot) {
		this.contractRoot = contractRoot;
	}

}
