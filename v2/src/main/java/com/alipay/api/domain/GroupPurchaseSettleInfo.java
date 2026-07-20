package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 店铺结算信息
 *
 * @author auto create
 * @since 1.0, 2026-07-01 19:41:54
 */
public class GroupPurchaseSettleInfo extends AlipayObject {

	private static final long serialVersionUID = 2236387815984624287L;

	/**
	 * 结算到户的账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 结算银行卡信息
	 */
	@ApiField("bank_card")
	private GroupPurchaseBankCard bankCard;

	/**
	 * 资金证明图片,使用openApi接口ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id。文件最小为 5KB，最大为5M，图片格式必须为：png、jpg、jpeg。
	 */
	@ApiListField("fund_proofs_url")
	@ApiField("string")
	private List<String> fundProofsUrl;

	/**
	 * 资金关系类型
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 法人证照图片正面，使用openApi接口ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id。文件最小为 5KB，最大为5M，图片格式必须为：png、jpg、jpeg。
	 */
	@ApiField("legal_cert_image")
	private String legalCertImage;

	/**
	 * 法人证照图片反面，使用openApi接口ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id。文件最小为 5KB，最大为5M，图片格式必须为：png、jpg、jpeg。
	 */
	@ApiField("legal_cert_image_back")
	private String legalCertImageBack;

	/**
	 * 组织证照图片，使用openApi接口ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id。文件最小为 5KB，最大为5M，图片格式必须为：png、jpg、jpeg。
	 */
	@ApiField("org_cert_image")
	private String orgCertImage;

	/**
	 * 结算类型
	 */
	@ApiField("type")
	private String type;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public GroupPurchaseBankCard getBankCard() {
		return this.bankCard;
	}
	public void setBankCard(GroupPurchaseBankCard bankCard) {
		this.bankCard = bankCard;
	}

	public List<String> getFundProofsUrl() {
		return this.fundProofsUrl;
	}
	public void setFundProofsUrl(List<String> fundProofsUrl) {
		this.fundProofsUrl = fundProofsUrl;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getLegalCertImage() {
		return this.legalCertImage;
	}
	public void setLegalCertImage(String legalCertImage) {
		this.legalCertImage = legalCertImage;
	}

	public String getLegalCertImageBack() {
		return this.legalCertImageBack;
	}
	public void setLegalCertImageBack(String legalCertImageBack) {
		this.legalCertImageBack = legalCertImageBack;
	}

	public String getOrgCertImage() {
		return this.orgCertImage;
	}
	public void setOrgCertImage(String orgCertImage) {
		this.orgCertImage = orgCertImage;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
