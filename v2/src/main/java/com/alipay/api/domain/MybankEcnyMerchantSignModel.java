package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 数字人民币商户签约
 *
 * @author auto create
 * @since 1.0, 2021-12-03 16:35:06
 */
public class MybankEcnyMerchantSignModel extends AlipayObject {

	private static final long serialVersionUID = 4366998966642736755L;

	/**
	 * 协议类型，暂时只支持：FACE_TO_FACE_PAYMENT
	 */
	@ApiField("agreement_type")
	private String agreementType;

	/**
	 * 支付宝账号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 经营地址
	 */
	@ApiField("business_address")
	private EcnyAddressInfo businessAddress;

	/**
	 * 商户证件影印件
	 */
	@ApiField("cert_file")
	private String certFile;

	/**
	 * 商户证件编号，按商户类型merchant_type的说明提供对应的证件编号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型： IT01 居民身份证 IT02 军官证 IT03 护照 IT04 户口簿 IT05 士兵证 IT06 港澳往来内地通行证 IT07 台湾同胞来往内地通行证 IT08 临时身份证 IT09 外国人居留证 IT10 警官证 IT11 营业执照 IT12 组织机构代码 IT13 税务登记证 IT14 统一社会信用代码证 IT15 事业单位法人证书 IT16 社会团体法人登记证书 IT17 民办非企业单位登记证书 IT99 其他
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 商户联系人信息。在本业务中，姓名，手机号必填，其他选填
	 */
	@ApiField("concat_info")
	private UserBaseInfo concatInfo;

	/**
	 * 商户编号，由机构定义，需要保证在机构下唯一
	 */
	@ApiField("ext_merchant_id")
	private String extMerchantId;

	/**
	 * 内景照，如果使用线下交易则必填
	 */
	@ApiListField("in_door_images")
	@ApiField("string")
	private List<String> inDoorImages;

	/**
	 * 法定代表人\单位信息
	 */
	@ApiField("legal_rep_info")
	private UserBaseInfo legalRepInfo;

	/**
	 * 行业分类，参见《商家类目对应资质MCC2.0.xlsx》，只需填写二级类目code即可
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 商户别名。账单和结果页中的商户名称会展示此处设置的别名。如果涉及当面付场景，请填写线下店铺名称
	 */
	@ApiField("merchant_alias_name")
	private String merchantAliasName;

	/**
	 * 商户名称。一般情况下要与证件的名称相同。个体工商户类型可以放宽到法人名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户类型，参考单位类型： 01 企业法人 02 非企业法人 03 机关 04 实施预算管理的事业单位 05 非预算管理的事业单位 06 军队，武警团级（含）及以上单位以及分散执勤的支（分）队 07 社会团体 08 民办非企业组织 09 外地常设机构 10 外国驻华机构 11 个人工商户 12 居民委员会、村民委员会、社区委员会 13 独立核算的附属机构 14 其他机构
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 其他证件文件影印件
	 */
	@ApiListField("other_cert_files")
	@ApiField("string")
	private List<String> otherCertFiles;

	/**
	 * 其他证件类型，固定：IT99-其他
	 */
	@ApiField("other_cert_type")
	private String otherCertType;

	/**
	 * 门头照，如果使用线下交易则必填
	 */
	@ApiListField("out_door_images")
	@ApiField("string")
	private List<String> outDoorImages;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 参考《商家类目对应资质MCC2.0.xlsx》，对应类目如果需要资质，需填写。参考《MCC2.0资质类型码.xlsx》,填写资质类型码。-1，无需上传对应资质文件影印件；1位、3位、4位数字需上传对应资质文件影印件。
	 */
	@ApiField("qualification_file")
	private String qualificationFile;

	/**
	 * 参考《商家类目对应资质MCC2.0.xlsx》，对应类目如果需要资质，需填写。参考《MCC2.0资质类型码.xlsx》,填写资质类型码。-1，无需上传对应资质文件影印件；1位、3位、4位数字需上传对应资质文件影印件。
	 */
	@ApiField("qualification_type")
	private String qualificationType;

	/**
	 * 服务费率（%）
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 钱包ID
	 */
	@ApiField("wallet_id")
	private String walletId;

	public String getAgreementType() {
		return this.agreementType;
	}
	public void setAgreementType(String agreementType) {
		this.agreementType = agreementType;
	}

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

	public EcnyAddressInfo getBusinessAddress() {
		return this.businessAddress;
	}
	public void setBusinessAddress(EcnyAddressInfo businessAddress) {
		this.businessAddress = businessAddress;
	}

	public String getCertFile() {
		return this.certFile;
	}
	public void setCertFile(String certFile) {
		this.certFile = certFile;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public UserBaseInfo getConcatInfo() {
		return this.concatInfo;
	}
	public void setConcatInfo(UserBaseInfo concatInfo) {
		this.concatInfo = concatInfo;
	}

	public String getExtMerchantId() {
		return this.extMerchantId;
	}
	public void setExtMerchantId(String extMerchantId) {
		this.extMerchantId = extMerchantId;
	}

	public List<String> getInDoorImages() {
		return this.inDoorImages;
	}
	public void setInDoorImages(List<String> inDoorImages) {
		this.inDoorImages = inDoorImages;
	}

	public UserBaseInfo getLegalRepInfo() {
		return this.legalRepInfo;
	}
	public void setLegalRepInfo(UserBaseInfo legalRepInfo) {
		this.legalRepInfo = legalRepInfo;
	}

	public String getMcc() {
		return this.mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getMerchantAliasName() {
		return this.merchantAliasName;
	}
	public void setMerchantAliasName(String merchantAliasName) {
		this.merchantAliasName = merchantAliasName;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public List<String> getOtherCertFiles() {
		return this.otherCertFiles;
	}
	public void setOtherCertFiles(List<String> otherCertFiles) {
		this.otherCertFiles = otherCertFiles;
	}

	public String getOtherCertType() {
		return this.otherCertType;
	}
	public void setOtherCertType(String otherCertType) {
		this.otherCertType = otherCertType;
	}

	public List<String> getOutDoorImages() {
		return this.outDoorImages;
	}
	public void setOutDoorImages(List<String> outDoorImages) {
		this.outDoorImages = outDoorImages;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getQualificationFile() {
		return this.qualificationFile;
	}
	public void setQualificationFile(String qualificationFile) {
		this.qualificationFile = qualificationFile;
	}

	public String getQualificationType() {
		return this.qualificationType;
	}
	public void setQualificationType(String qualificationType) {
		this.qualificationType = qualificationType;
	}

	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getWalletId() {
		return this.walletId;
	}
	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}

}
