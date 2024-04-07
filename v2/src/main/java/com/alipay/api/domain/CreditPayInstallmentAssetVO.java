package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 信用支付贷款分期资产视图
 *
 * @author auto create
 * @since 1.0, 2022-10-18 20:16:30
 */
public class CreditPayInstallmentAssetVO extends AlipayObject {

	private static final long serialVersionUID = 7587524944816577446L;

	/**
	 * 信用支付资产详情基础信息
	 */
	@ApiField("base_info")
	private CreditPayAssetBaseVO baseInfo;

	/**
	 * 分期详情
	 */
	@ApiListField("installment_details")
	@ApiField("credit_pay_installment_detail_v_o")
	private List<CreditPayInstallmentDetailVO> installmentDetails;

	public CreditPayAssetBaseVO getBaseInfo() {
		return this.baseInfo;
	}
	public void setBaseInfo(CreditPayAssetBaseVO baseInfo) {
		this.baseInfo = baseInfo;
	}

	public List<CreditPayInstallmentDetailVO> getInstallmentDetails() {
		return this.installmentDetails;
	}
	public void setInstallmentDetails(List<CreditPayInstallmentDetailVO> installmentDetails) {
		this.installmentDetails = installmentDetails;
	}

}
