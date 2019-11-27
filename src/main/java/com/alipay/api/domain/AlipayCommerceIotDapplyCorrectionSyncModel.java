package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * SN批量修改
 *
 * @author auto create
 * @since 1.0, 2019-06-28 17:59:20
 */
public class AlipayCommerceIotDapplyCorrectionSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4454189466967942627L;

	/**
	 * 申请单号
	 */
	@ApiField("asset_apply_order_id")
	private String assetApplyOrderId;

	/**
	 * 修改后的deviceSn
	 */
	@ApiField("new_sn")
	private String newSn;

	/**
	 * 原有deviceSn
	 */
	@ApiField("original_sn")
	private String originalSn;

	/**
	 * 场景码
	 */
	@ApiField("source_code")
	private String sourceCode;

	/**
	 * 供应商id
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getAssetApplyOrderId() {
		return this.assetApplyOrderId;
	}
	public void setAssetApplyOrderId(String assetApplyOrderId) {
		this.assetApplyOrderId = assetApplyOrderId;
	}

	public String getNewSn() {
		return this.newSn;
	}
	public void setNewSn(String newSn) {
		this.newSn = newSn;
	}

	public String getOriginalSn() {
		return this.originalSn;
	}
	public void setOriginalSn(String originalSn) {
		this.originalSn = originalSn;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
