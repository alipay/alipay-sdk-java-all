package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 额度设置接口
 *
 * @author auto create
 * @since 1.0, 2022-04-21 11:06:16
 */
public class AlipayFundAgreementQuotaModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8871871334429517287L;

	/**
	 * 协议额度设置信息
	 */
	@ApiListField("agreement_quota_modify_list")
	@ApiField("agreement_quota_modify_list")
	private List<AgreementQuotaModifyList> agreementQuotaModifyList;

	/**
	 * 场景码，非固定值，使用的对应的资金场景码保持一致
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 额度产品码，非固定值，使用的对应的资金产品码保持一致
	 */
	@ApiField("product_code")
	private String productCode;

	public List<AgreementQuotaModifyList> getAgreementQuotaModifyList() {
		return this.agreementQuotaModifyList;
	}
	public void setAgreementQuotaModifyList(List<AgreementQuotaModifyList> agreementQuotaModifyList) {
		this.agreementQuotaModifyList = agreementQuotaModifyList;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
