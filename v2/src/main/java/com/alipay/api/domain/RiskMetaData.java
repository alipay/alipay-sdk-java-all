package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险元数据
 *
 * @author auto create
 * @since 1.0, 2024-07-05 12:05:10
 */
public class RiskMetaData extends AlipayObject {

	private static final long serialVersionUID = 3144299792797857344L;

	/**
	 * 对该条数据的操作类型，新增或删除。删除仅支持当前app_id下的数据。相同数据不会重复添加。
	 */
	@ApiField("op_type")
	private String opType;

	/**
	 * risk_meta_data_type = BLACK_ADDRESS时，按照标准格式传入[province(省份), city(城市), district(区/县), address(详细地址)]四组值；
risk_meta_data_type=BLACK_MOBILE, 传入手机号；
risk_meta_data_type=BLACK_CERT_NO,传入身份证号；
risk_meta_data_type=BLACK_ALIPAY_USER_ID,传入支付宝userId；
risk_meta_data_type=BLACK_MOBILE_SHA256,传入手机号sha256值；
risk_meta_data_type=BLACK_CERT_NO_SHA256,传入身份证号sha256值。
	 */
	@ApiField("risk_meta_data_content")
	private String riskMetaDataContent;

	/**
	 * 传递的高风险数据类型格式
	 */
	@ApiField("risk_meta_data_type")
	private String riskMetaDataType;

	public String getOpType() {
		return this.opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}

	public String getRiskMetaDataContent() {
		return this.riskMetaDataContent;
	}
	public void setRiskMetaDataContent(String riskMetaDataContent) {
		this.riskMetaDataContent = riskMetaDataContent;
	}

	public String getRiskMetaDataType() {
		return this.riskMetaDataType;
	}
	public void setRiskMetaDataType(String riskMetaDataType) {
		this.riskMetaDataType = riskMetaDataType;
	}

}
