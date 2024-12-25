package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融支付宝VID查询接口
 *
 * @author auto create
 * @since 1.0, 2021-04-27 15:11:45
 */
public class MybankCreditSceneprodVidGetModel extends AlipayObject {

	private static final long serialVersionUID = 8683282119278838474L;

	/**
	 * 支付宝版本号
	 */
	@ApiField("alipay_version")
	private String alipayVersion;

	/**
	 * 人脸核身方式。在人脸识别场景才需要填写
	 */
	@ApiField("meta_info")
	private String metaInfo;

	/**
	 * 机构编码
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 外部站点，比如：ALIPAY：支付宝站点，MYBANK：银行会员，B2B_CN：B2B中文站，B2B_EN：B2B国际站，TAOBAO：淘宝
	 */
	@ApiField("site")
	private String site;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	/**
	 * 可以选择的是人脸识别（FACE）或者账密方式（PASSWORD）,不填写默认使用账密方式
	 */
	@ApiField("verify_type")
	private String verifyType;

	public String getAlipayVersion() {
		return this.alipayVersion;
	}
	public void setAlipayVersion(String alipayVersion) {
		this.alipayVersion = alipayVersion;
	}

	public String getMetaInfo() {
		return this.metaInfo;
	}
	public void setMetaInfo(String metaInfo) {
		this.metaInfo = metaInfo;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSiteUserId() {
		return this.siteUserId;
	}
	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}

	public String getVerifyType() {
		return this.verifyType;
	}
	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}

}
