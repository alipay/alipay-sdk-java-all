package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-09 15:02:43
 */
public class AntSignUserInfo extends AlipayObject {

	private static final long serialVersionUID = 2285824356268447912L;

	/**
	 * 是否自动签署
	 */
	@ApiField("auto_sign")
	private Boolean autoSign;

	/**
	 * null
	 */
	@ApiListField("ca_system_sign_file_list")
	@ApiField("ca_system_sign_file")
	private List<CaSystemSignFile> caSystemSignFileList;

	/**
	 * 签署顺序（默认-1：不指定签署顺序，若指定签署顺序，则依次1<2<3<4 排列）
	 */
	@ApiField("order")
	private Long order;

	/**
	 * 是否为我方公司（我方公司指蚂蚁域公司涵网商银行、重庆消金）
	 */
	@ApiField("our_corp")
	private Boolean ourCorp;

	/**
	 * 签署完成后的重定向链接
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * 用户类型 个人 PERSON 机构 ORG
	 */
	@ApiField("sign_user_type")
	private String signUserType;

	/**
	 * 签署方证件号码
	 */
	@ApiField("signer_cert_number")
	private String signerCertNumber;

	/**
	 * 签署人证件类型
	 */
	@ApiField("signer_cert_type")
	private String signerCertType;

	/**
	 * 签署方名称
	 */
	@ApiField("signer_name")
	private String signerName;

	/**
	 * 签署方名称样式
	 */
	@ApiField("signer_name_style")
	private String signerNameStyle;

	/**
	 * 用户认证信息
	 */
	@ApiField("user_certify_info")
	private UserCertifyInfo userCertifyInfo;

	public Boolean getAutoSign() {
		return this.autoSign;
	}
	public void setAutoSign(Boolean autoSign) {
		this.autoSign = autoSign;
	}

	public List<CaSystemSignFile> getCaSystemSignFileList() {
		return this.caSystemSignFileList;
	}
	public void setCaSystemSignFileList(List<CaSystemSignFile> caSystemSignFileList) {
		this.caSystemSignFileList = caSystemSignFileList;
	}

	public Long getOrder() {
		return this.order;
	}
	public void setOrder(Long order) {
		this.order = order;
	}

	public Boolean getOurCorp() {
		return this.ourCorp;
	}
	public void setOurCorp(Boolean ourCorp) {
		this.ourCorp = ourCorp;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getSignUserType() {
		return this.signUserType;
	}
	public void setSignUserType(String signUserType) {
		this.signUserType = signUserType;
	}

	public String getSignerCertNumber() {
		return this.signerCertNumber;
	}
	public void setSignerCertNumber(String signerCertNumber) {
		this.signerCertNumber = signerCertNumber;
	}

	public String getSignerCertType() {
		return this.signerCertType;
	}
	public void setSignerCertType(String signerCertType) {
		this.signerCertType = signerCertType;
	}

	public String getSignerName() {
		return this.signerName;
	}
	public void setSignerName(String signerName) {
		this.signerName = signerName;
	}

	public String getSignerNameStyle() {
		return this.signerNameStyle;
	}
	public void setSignerNameStyle(String signerNameStyle) {
		this.signerNameStyle = signerNameStyle;
	}

	public UserCertifyInfo getUserCertifyInfo() {
		return this.userCertifyInfo;
	}
	public void setUserCertifyInfo(UserCertifyInfo userCertifyInfo) {
		this.userCertifyInfo = userCertifyInfo;
	}

}
