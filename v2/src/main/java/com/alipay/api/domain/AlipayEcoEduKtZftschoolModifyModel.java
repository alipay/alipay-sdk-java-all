package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 教育缴费学校直付通进件接口
 *
 * @author auto create
 * @since 1.0, 2022-09-05 20:43:11
 */
public class AlipayEcoEduKtZftschoolModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6458574649764242712L;

	/**
	 * 商户结算卡信息。本业务当前只允许传入一张结算卡
	 */
	@ApiListField("biz_cards")
	@ApiField("settle_card_info_kt")
	private List<SettleCardInfoKt> bizCards;

	/**
	 * 学校地址。地址对象中省、市、区、地址必填，其余选填
	 */
	@ApiField("business_address")
	private AddressInfoKt businessAddress;

	/**
	 * 商户证件图片url，格式jpg、jpeg、png 
不可修改，请核对后再提交
	 */
	@ApiField("cert_image")
	private String certImage;

	/**
	 * 证件反面图片URL，格式jpg、jpeg、png
。目前只有当主证件为身份证时才需填写
	 */
	@ApiField("cert_image_back")
	private String certImageBack;

	/**
	 * 目前只有个体工商户商户类型要求填入本字段，填写值为个体工商户营业执照上的名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 商户证件编号（企业或者个体工商户提供营业执照，统一信用代码，事业单位提供事证号）
不可修改，请核对后再提交
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 商户证件类型，201：营业执照；204 民办非企业单位登记证书；2011:营业执照(统一社会信用代码)；218：事业单位法人证书。 

对应merchant_type规则，可参考：
01对应201或2011；
02对应218 办学许可证、事业单位法人证书、办园许可证、学前教育机构登记证、登记注册合格证；
03对应204 民办非企业单位登记证书 
07对应 201 或 2011	
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 学校联系人信息。在本业务中，ContactInfo对象中名称，类型、手机号必填，其他选填
	 */
	@ApiListField("contact_infos")
	@ApiField("contact_info_kt")
	private List<ContactInfoKt> contactInfos;

	/**
	 * 开票资料信息
	 */
	@ApiField("invoice_info")
	private MerchantInvoiceInfoKt invoiceInfo;

	/**
	 * 此通知地址是为了保持教育缴费平台与ISV商户支付状态一致性。用户支付成功后，支付宝会根据本isv_notify_url，通过POST请求的形式将支付结果作为参数通知到商户系统，ISV商户可以根据返回的参数更新账单状态。
说明文档：https://docs.open.alipay.com/203/105286/
不可修改，请核对后再提交
	 */
	@ApiField("isv_notify_url")
	private String isvNotifyUrl;

	/**
	 * 法人或负责人身份证反面URL，格式jpg、jpeg、png
	 */
	@ApiField("legal_cert_back_image")
	private String legalCertBackImage;

	/**
	 * 法人或负责人身份证正面URL，格式jpg、jpeg、png
	 */
	@ApiField("legal_cert_front_image")
	private String legalCertFrontImage;

	/**
	 * 法人身份证号
	 */
	@ApiField("legal_cert_no")
	private String legalCertNo;

	/**
	 * 法人名称，与证件上面一致
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 学校名和结算卡不一致时必填
学校授权函URL，格式jpg、jpeg、png
	 */
	@ApiField("license_auth_letter_image")
	private String licenseAuthLetterImage;

	/**
	 * 商户类别码mcc，参见附件描述中的“类目code” https://mif-pub.alipayobjects.com/AlipayMCC.xlsx
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 商家类型：01：企业；02：事业单位；03：民办非企业组织，07：个体工商户。 

对应cert_type规则，可参考：
01对应201或2011；
02对应218 办学许可证、事业单位法人证书、办园许可；证、学前教育机构登记证、登记注册合格证
03对应204 民办非企业单位登记证书；
07对应 201 或 2011
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 如果status为修改M，此项必填
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部订单号，ISV每次申请单生成，用于查询审核结果，创建时每个isv唯一标识，修改需和创建时保持一致
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 门头照URL，格式jpg、jpeg、png，该行业只支持一张
	 */
	@ApiListField("out_door_images")
	@ApiField("string")
	private List<String> outDoorImages;

	/**
	 * ISV的名称，用于缴费详情页面展示
不可修改，请核对后再提交
	 */
	@ApiField("partner_name")
	private String partnerName;

	/**
	 * ISV联系电话,用于账单详情页面显示
不可修改，请核对后再提交
	 */
	@ApiField("partner_phone")
	private String partnerPhone;

	/**
	 * ISV的支付宝唯一标识PID
不可修改，请核对后再提交
	 */
	@ApiField("partner_pid")
	private String partnerPid;

	/**
	 * 商户行业资质，教育缴费行业必填
	 */
	@ApiListField("qualifications")
	@ApiField("industry_qualification_info_kt")
	private List<IndustryQualificationInfoKt> qualifications;

	/**
	 * 学校名称，与证件一致，请核对后再提交
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * K12学校类型，1：代表托儿所； 2：代表幼儿园；3：代表小学；4：代表初中；5：代表高中。 
如果学校兼有多种属性，可以连写，比如： 
45：代表兼有初中部高中部；34：代表兼有小学部初中部
不可修改，请核对后再提交
	 */
	@ApiField("school_type")
	private String schoolType;

	/**
	 * 商户使用服务，可选值有：当面付、app支付、wap支付、电脑支付，本行业wap支付必须填写
	 */
	@ApiListField("service")
	@ApiField("string")
	private List<String> service;

	/**
	 * 客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 2018-10-01
	 */
	@ApiField("sign_time_with_isv")
	private String signTimeWithIsv;

	/**
	 * 商户站点信息，包括网站、app、小程序。商户使用服务包含电脑支付或wap支付时，必须填充一个类型为01(网站)的SiteInfo对象；当包含app支付时，必须至少填充类型为02(APP)或06(支付宝小程序)中一种类型的SiteInfo对象
	 */
	@ApiListField("sites")
	@ApiField("site_info_kt")
	private List<SiteInfoKt> sites;

	/**
	 * 修改还是创建，创建传C , 修改传M
	 */
	@ApiField("status")
	private String status;

	public List<SettleCardInfoKt> getBizCards() {
		return this.bizCards;
	}
	public void setBizCards(List<SettleCardInfoKt> bizCards) {
		this.bizCards = bizCards;
	}

	public AddressInfoKt getBusinessAddress() {
		return this.businessAddress;
	}
	public void setBusinessAddress(AddressInfoKt businessAddress) {
		this.businessAddress = businessAddress;
	}

	public String getCertImage() {
		return this.certImage;
	}
	public void setCertImage(String certImage) {
		this.certImage = certImage;
	}

	public String getCertImageBack() {
		return this.certImageBack;
	}
	public void setCertImageBack(String certImageBack) {
		this.certImageBack = certImageBack;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
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

	public List<ContactInfoKt> getContactInfos() {
		return this.contactInfos;
	}
	public void setContactInfos(List<ContactInfoKt> contactInfos) {
		this.contactInfos = contactInfos;
	}

	public MerchantInvoiceInfoKt getInvoiceInfo() {
		return this.invoiceInfo;
	}
	public void setInvoiceInfo(MerchantInvoiceInfoKt invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
	}

	public String getIsvNotifyUrl() {
		return this.isvNotifyUrl;
	}
	public void setIsvNotifyUrl(String isvNotifyUrl) {
		this.isvNotifyUrl = isvNotifyUrl;
	}

	public String getLegalCertBackImage() {
		return this.legalCertBackImage;
	}
	public void setLegalCertBackImage(String legalCertBackImage) {
		this.legalCertBackImage = legalCertBackImage;
	}

	public String getLegalCertFrontImage() {
		return this.legalCertFrontImage;
	}
	public void setLegalCertFrontImage(String legalCertFrontImage) {
		this.legalCertFrontImage = legalCertFrontImage;
	}

	public String getLegalCertNo() {
		return this.legalCertNo;
	}
	public void setLegalCertNo(String legalCertNo) {
		this.legalCertNo = legalCertNo;
	}

	public String getLegalName() {
		return this.legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getLicenseAuthLetterImage() {
		return this.licenseAuthLetterImage;
	}
	public void setLicenseAuthLetterImage(String licenseAuthLetterImage) {
		this.licenseAuthLetterImage = licenseAuthLetterImage;
	}

	public String getMcc() {
		return this.mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<String> getOutDoorImages() {
		return this.outDoorImages;
	}
	public void setOutDoorImages(List<String> outDoorImages) {
		this.outDoorImages = outDoorImages;
	}

	public String getPartnerName() {
		return this.partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getPartnerPhone() {
		return this.partnerPhone;
	}
	public void setPartnerPhone(String partnerPhone) {
		this.partnerPhone = partnerPhone;
	}

	public String getPartnerPid() {
		return this.partnerPid;
	}
	public void setPartnerPid(String partnerPid) {
		this.partnerPid = partnerPid;
	}

	public List<IndustryQualificationInfoKt> getQualifications() {
		return this.qualifications;
	}
	public void setQualifications(List<IndustryQualificationInfoKt> qualifications) {
		this.qualifications = qualifications;
	}

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolType() {
		return this.schoolType;
	}
	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	public List<String> getService() {
		return this.service;
	}
	public void setService(List<String> service) {
		this.service = service;
	}

	public String getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	public String getSignTimeWithIsv() {
		return this.signTimeWithIsv;
	}
	public void setSignTimeWithIsv(String signTimeWithIsv) {
		this.signTimeWithIsv = signTimeWithIsv;
	}

	public List<SiteInfoKt> getSites() {
		return this.sites;
	}
	public void setSites(List<SiteInfoKt> sites) {
		this.sites = sites;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
