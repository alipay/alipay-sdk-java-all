package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签署人信息
 *
 * @author auto create
 * @since 1.0, 2024-09-05 15:23:11
 */
public class AntSignUserInfoRequest extends AlipayObject {

	private static final long serialVersionUID = 8733196465631138895L;

	/**
	 * 授权签署方证件号码
	 */
	@ApiField("auth_signer_cert_number")
	private String authSignerCertNumber;

	/**
	 * 授权签署时的签署人证件类型
	 */
	@ApiField("auth_signer_cert_type")
	private String authSignerCertType;

	/**
	 * 签署方名称
	 */
	@ApiField("auth_signer_name")
	private String authSignerName;

	/**
	 * 是否指定授权人签署,1为true，0为false
	 */
	@ApiField("authorized")
	private String authorized;

	/**
	 * ture为需要自动签署，false为手动签署
	 */
	@ApiField("auto_sign")
	private Boolean autoSign;

	/**
	 * 签署文件列表（包含印模和签署区域）
	 */
	@ApiListField("ca_system_sign_file_request_list")
	@ApiField("ca_system_sign_file_request")
	private List<CaSystemSignFileRequest> caSystemSignFileRequestList;

	/**
	 * 邮箱联系方式
	 */
	@ApiField("email")
	private String email;

	/**
	 * 手机号，用于发送签署短信
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 签署顺序，默认-1无签署顺序
	 */
	@ApiField("order")
	private String order;

	/**
	 * 是否为我方公司,true：我方公司自动完成签署，不发送短信邮件等 false：需要传递mobile和email
	 */
	@ApiField("our_corp")
	private Boolean ourCorp;

	/**
	 * true为需要发送链接，false为不需要发送链接
	 */
	@ApiField("send_link_flag")
	private Boolean sendLinkFlag;

	/**
	 * signUserType为org时必选 
企业子类型
     * BUS("BUS", "企业"),
     * SINGLE("SINGLE", "个体工商户"),
     * GOV("GOV", "党政机关"),
     * INST("INST", "事业单位"),
     * COMMON("COMMON", "社会组织"),
     * OTHER("OTHER", "其他组织");
	 */
	@ApiField("sign_sub_type")
	private String signSubType;

	/**
	 * 签署方用户ID,由签署中心注册生成，不要随便传值，否则无法颁发正确的ca证书
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	/**
	 * 个人:PERSON 
机构:ORG
	 */
	@ApiField("sign_user_type")
	private String signUserType;

	/**
	 * 签署方证件号码：
个人传递身份证件号
企业传递统一社会信用编码
	 */
	@ApiField("signer_cert_number")
	private String signerCertNumber;

	/**
	 * 签署方证件类型
CRED_PSN_CH_IDCARD(大陆身份证)
CRED_ORG_USCC(统一社会信用代码)
	 */
	@ApiField("signer_cert_type")
	private String signerCertType;

	/**
	 * 个人传真实姓名：张三
机构传机构正确的名称：xxx责任有限公司
	 */
	@ApiField("signer_name")
	private String signerName;

	public String getAuthSignerCertNumber() {
		return this.authSignerCertNumber;
	}
	public void setAuthSignerCertNumber(String authSignerCertNumber) {
		this.authSignerCertNumber = authSignerCertNumber;
	}

	public String getAuthSignerCertType() {
		return this.authSignerCertType;
	}
	public void setAuthSignerCertType(String authSignerCertType) {
		this.authSignerCertType = authSignerCertType;
	}

	public String getAuthSignerName() {
		return this.authSignerName;
	}
	public void setAuthSignerName(String authSignerName) {
		this.authSignerName = authSignerName;
	}

	public String getAuthorized() {
		return this.authorized;
	}
	public void setAuthorized(String authorized) {
		this.authorized = authorized;
	}

	public Boolean getAutoSign() {
		return this.autoSign;
	}
	public void setAutoSign(Boolean autoSign) {
		this.autoSign = autoSign;
	}

	public List<CaSystemSignFileRequest> getCaSystemSignFileRequestList() {
		return this.caSystemSignFileRequestList;
	}
	public void setCaSystemSignFileRequestList(List<CaSystemSignFileRequest> caSystemSignFileRequestList) {
		this.caSystemSignFileRequestList = caSystemSignFileRequestList;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOrder() {
		return this.order;
	}
	public void setOrder(String order) {
		this.order = order;
	}

	public Boolean getOurCorp() {
		return this.ourCorp;
	}
	public void setOurCorp(Boolean ourCorp) {
		this.ourCorp = ourCorp;
	}

	public Boolean getSendLinkFlag() {
		return this.sendLinkFlag;
	}
	public void setSendLinkFlag(Boolean sendLinkFlag) {
		this.sendLinkFlag = sendLinkFlag;
	}

	public String getSignSubType() {
		return this.signSubType;
	}
	public void setSignSubType(String signSubType) {
		this.signSubType = signSubType;
	}

	public String getSignUserId() {
		return this.signUserId;
	}
	public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
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

}
