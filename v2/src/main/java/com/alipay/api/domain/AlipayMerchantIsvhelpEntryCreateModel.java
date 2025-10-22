package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商代入驻资料提交接口
 *
 * @author auto create
 * @since 1.0, 2025-09-29 19:23:24
 */
public class AlipayMerchantIsvhelpEntryCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7588191674184722561L;

	/**
	 * 受益人是否是法人。如果是，则受益人信息可以不用填写
	 */
	@ApiField("beneficiary_is_legal")
	private Boolean beneficiaryIsLegal;

	/**
	 * 入驻信息，扩展信息
目前支持的key如下
1.   MERCHANT_MCC  行业类目,多个逗号分隔
2.   MERCHANT_CONTACT_PHONE 联系手机号
3.   BRAND_NAME   品牌方名称
4.   ISV_HAVANAL_ID   HAVANA_ID  
5.  ISV_CLIENT_IP  客户端ip
	 */
	@ApiField("ext_info")
	private ExtInfoMap extInfo;

	/**
	 * 服务商自定义的申请编号，每个申请编号唯一对应一个申请单，需在服务商下唯一。只能用数字、字母或下划线组成
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 受益所有人信息
	 */
	@ApiField("merchant_entry_beneficiary_info")
	private MerchantEntryBeneficiaryInfo merchantEntryBeneficiaryInfo;

	/**
	 * 法定代表人信息
	 */
	@ApiField("merchant_entry_legal_info")
	private MerchantEntryLegalInfo merchantEntryLegalInfo;

	/**
	 * 商家入驻主体信息
	 */
	@ApiField("merchant_entry_org_info")
	private MerchantEntryOrgInfo merchantEntryOrgInfo;

	public Boolean getBeneficiaryIsLegal() {
		return this.beneficiaryIsLegal;
	}
	public void setBeneficiaryIsLegal(Boolean beneficiaryIsLegal) {
		this.beneficiaryIsLegal = beneficiaryIsLegal;
	}

	public ExtInfoMap getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(ExtInfoMap extInfo) {
		this.extInfo = extInfo;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public MerchantEntryBeneficiaryInfo getMerchantEntryBeneficiaryInfo() {
		return this.merchantEntryBeneficiaryInfo;
	}
	public void setMerchantEntryBeneficiaryInfo(MerchantEntryBeneficiaryInfo merchantEntryBeneficiaryInfo) {
		this.merchantEntryBeneficiaryInfo = merchantEntryBeneficiaryInfo;
	}

	public MerchantEntryLegalInfo getMerchantEntryLegalInfo() {
		return this.merchantEntryLegalInfo;
	}
	public void setMerchantEntryLegalInfo(MerchantEntryLegalInfo merchantEntryLegalInfo) {
		this.merchantEntryLegalInfo = merchantEntryLegalInfo;
	}

	public MerchantEntryOrgInfo getMerchantEntryOrgInfo() {
		return this.merchantEntryOrgInfo;
	}
	public void setMerchantEntryOrgInfo(MerchantEntryOrgInfo merchantEntryOrgInfo) {
		this.merchantEntryOrgInfo = merchantEntryOrgInfo;
	}

}
