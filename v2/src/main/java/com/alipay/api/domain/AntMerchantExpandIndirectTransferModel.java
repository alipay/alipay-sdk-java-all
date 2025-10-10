package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连商户转移给银联网联接口
 *
 * @author auto create
 * @since 1.0, 2022-10-12 20:10:35
 */
public class AntMerchantExpandIndirectTransferModel extends AlipayObject {

	private static final long serialVersionUID = 2839119148556127263L;

	/**
	 * 商户编号，由机构定义，需要保证在机构下唯一，与sub_merchant_id二选一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号，与external_id二选一
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/**
	 * 商户转移目标的id，填银联或者网联的id
	 */
	@ApiField("transfer_target_id")
	private String transferTargetId;

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	public String getTransferTargetId() {
		return this.transferTargetId;
	}
	public void setTransferTargetId(String transferTargetId) {
		this.transferTargetId = transferTargetId;
	}

}
