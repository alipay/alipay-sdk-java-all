package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 主站添加机构账号信息开放接口
 *
 * @author auto create
 * @since 1.0, 2023-09-15 12:03:14
 */
public class AlipayOverseasOpenIndraccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4595986767951496922L;

	/**
	 * 机构详细信息
	 */
	@ApiField("beneficiary_detail")
	private String beneficiaryDetail;

	/**
	 * 机构账单信息
	 */
	@ApiField("beneficiary_receipt_method")
	private String beneficiaryReceiptMethod;

	/**
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 业务场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	public String getBeneficiaryDetail() {
		return this.beneficiaryDetail;
	}
	public void setBeneficiaryDetail(String beneficiaryDetail) {
		this.beneficiaryDetail = beneficiaryDetail;
	}

	public String getBeneficiaryReceiptMethod() {
		return this.beneficiaryReceiptMethod;
	}
	public void setBeneficiaryReceiptMethod(String beneficiaryReceiptMethod) {
		this.beneficiaryReceiptMethod = beneficiaryReceiptMethod;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
