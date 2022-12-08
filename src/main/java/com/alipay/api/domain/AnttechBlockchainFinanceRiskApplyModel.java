package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风控申请
 *
 * @author auto create
 * @since 1.0, 2020-04-26 18:02:33
 */
public class AnttechBlockchainFinanceRiskApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7235165468124748735L;

	/**
	 * 因何种资产业务发起的贷前风控申请
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 请求的唯一性标识，用于幂等处理。
若不传，则使用风控参数作为幂等条件
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * JSON字符串，字段参见资产字段信息表，风控字段。
	 */
	@ApiField("risk_object")
	private String riskObject;

	/**
	 * 风控类型，默认贷前风控
	 */
	@ApiField("risk_type")
	private String riskType;

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRiskObject() {
		return this.riskObject;
	}
	public void setRiskObject(String riskObject) {
		this.riskObject = riskObject;
	}

	public String getRiskType() {
		return this.riskType;
	}
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

}
