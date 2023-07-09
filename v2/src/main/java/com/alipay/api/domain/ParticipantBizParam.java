package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展数据
 *
 * @author auto create
 * @since 1.0, 2023-05-31 15:42:12
 */
public class ParticipantBizParam extends AlipayObject {

	private static final long serialVersionUID = 8224415741198387988L;

	/**
	 * 出资比例
	 */
	@ApiField("fund_ratio")
	private String fundRatio;

	/**
	 * 出资类型
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 间连商户ID
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public String getFundRatio() {
		return this.fundRatio;
	}
	public void setFundRatio(String fundRatio) {
		this.fundRatio = fundRatio;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
