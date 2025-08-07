package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 直付通c2c进件接口
 *
 * @author auto create
 * @since 1.0, 2025-08-04 16:03:12
 */
public class AntMerchantExpandIndirectZftforcCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7648987373193289825L;

	/**
	 * 支付宝收银台及账单中的商户名称会展示此处设置的别名。如果涉及支付宝APP内的支付，支付结果页也会展示该别名；如果涉及线下当面付场景，请填写线下店铺名称
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 结算账号使用支付宝账号时必填，本字段指定交易资金结算的具体支付宝账号，与binding_alipay_logon_id保持一致
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 需使用实名认证支付宝账号，使用该支付宝账号签约直付通二级商户及后续服务，商户主体与该支付宝账号主体相同
	 */
	@ApiField("binding_alipay_logon_id")
	private String bindingAlipayLogonId;

	/**
	 * 证件号。若传入签约支付宝账号，该字段无效
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型。若传入签约支付宝账号，该字段无效
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 在本业务中，ContactInfo对象中联系人姓名，手机号必填，其他选填
	 */
	@ApiListField("contact_infos")
	@ApiField("contact_info")
	private List<ContactInfo> contactInfos;

	/**
	 * 由机构定义,需要保证在机构下唯一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 平台商回跳地址
	 */
	@ApiField("jump_back_url")
	private String jumpBackUrl;

	/**
	 * 商户类别码 mcc（和行业约定），可查看
 <a href="https://mdn.alipayobjects.com/huamei_fctrxv/afts/file/A*3TMHRZ8ppa4AAAAAAAAAAAAADs2DAQ/%E8%BF%9B%E4%BB%B6MCC%E4%B8%8E%E8%B5%84%E8%B4%A8%E8%A6%81%E6%B1%82202212.xlsx">进件MCC与资质要求 202212.xlsx</a>，不支持特殊mcc
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 用户名称。若传入签约支付宝账号，该字段无效
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商户使用服务, 固定传（jsapi支付、app支付、wap支付、电脑支付、小程序支付）
	 */
	@ApiListField("service")
	@ApiField("string")
	private List<String> service;

	/**
	 * 二级商户与服务商的签约时间
	 */
	@ApiField("sign_time_with_isv")
	private String signTimeWithIsv;

	/**
	 * 商户站点信息，包括网站、app、小程序。商户使用服务包含电脑支付、wap支付时，必须填充一个类型为01(网站)的SiteInfo对象，site_type/site_url/site_name必填；当包含app支付时，必须至少填充类型为02(APP)或06(支付宝小程序)中一种类型的SiteInfo对象，site_type/site_name必填；当包含jsapi支付时，必须填充一个类型为06(支付宝小程序)的SiteInfo对象；
	 */
	@ApiListField("sites")
	@ApiField("site_info")
	private List<SiteInfo> sites;

	/**
	 * 根据平台商签约开户维度
	 */
	@ApiField("sub_scene")
	private String subScene;

	public String getAliasName() {
		return this.aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

	public String getBindingAlipayLogonId() {
		return this.bindingAlipayLogonId;
	}
	public void setBindingAlipayLogonId(String bindingAlipayLogonId) {
		this.bindingAlipayLogonId = bindingAlipayLogonId;
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

	public List<ContactInfo> getContactInfos() {
		return this.contactInfos;
	}
	public void setContactInfos(List<ContactInfo> contactInfos) {
		this.contactInfos = contactInfos;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getJumpBackUrl() {
		return this.jumpBackUrl;
	}
	public void setJumpBackUrl(String jumpBackUrl) {
		this.jumpBackUrl = jumpBackUrl;
	}

	public String getMcc() {
		return this.mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getService() {
		return this.service;
	}
	public void setService(List<String> service) {
		this.service = service;
	}

	public String getSignTimeWithIsv() {
		return this.signTimeWithIsv;
	}
	public void setSignTimeWithIsv(String signTimeWithIsv) {
		this.signTimeWithIsv = signTimeWithIsv;
	}

	public List<SiteInfo> getSites() {
		return this.sites;
	}
	public void setSites(List<SiteInfo> sites) {
		this.sites = sites;
	}

	public String getSubScene() {
		return this.subScene;
	}
	public void setSubScene(String subScene) {
		this.subScene = subScene;
	}

}
