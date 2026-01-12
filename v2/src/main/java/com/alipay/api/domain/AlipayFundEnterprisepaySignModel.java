package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 因公付企业签约
 *
 * @author auto create
 * @since 1.0, 2023-03-07 19:52:23
 */
public class AlipayFundEnterprisepaySignModel extends AlipayObject {

	private static final long serialVersionUID = 7378855573694275491L;

	/**
	 * 企业简称，传空采用默认规则命名，使用公司名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 指定签约终端类型
PC-电脑浏览器
MOBILE-手机端
	 */
	@ApiField("appoint_sign_terminal")
	private String appointSignTerminal;

	/**
	 * 业务场景，联系支付宝分配
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 特殊场景下扩展字段
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 开户账号：
当identity_type是ALIPAY_USER_ID时填支付宝会员ID（2088开头）；
当identity_type是ALIPAY_LOGON_ID 时填支付宝登录号；
当identity_type是OUT_USER_ID时填外部平台的用户uid;
当identity_type是ALIPAY_OPEN_ID时填用户openId
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 开户用户名称，identity_type为ALIPAY_LOGON_ID时必填
	 */
	@ApiField("identity_name")
	private String identityName;

	/**
	 * 账号类型，目前支持如下类型：
1、ALIPAY_USER_ID 支付宝的会员ID
2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式
3、OUT_USER_ID：外部用户uid
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 商户侧单号（幂等字段）
，补充说明：幂等逻辑（商户appid+out_biz_no），商户集成时需注意，如换号重复发起，则认为是一笔新的请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部实体ID，一般表述为外部操作人操作某个外部实体。比如企业码2284号
	 */
	@ApiField("out_entity_id")
	private String outEntityId;

	/**
	 * ISV平台定义的共同账户开户来源
	 */
	@ApiField("out_source")
	private String outSource;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAppointSignTerminal() {
		return this.appointSignTerminal;
	}
	public void setAppointSignTerminal(String appointSignTerminal) {
		this.appointSignTerminal = appointSignTerminal;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getExtParams() {
		return this.extParams;
	}
	public void setExtParams(String extParams) {
		this.extParams = extParams;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityName() {
		return this.identityName;
	}
	public void setIdentityName(String identityName) {
		this.identityName = identityName;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutEntityId() {
		return this.outEntityId;
	}
	public void setOutEntityId(String outEntityId) {
		this.outEntityId = outEntityId;
	}

	public String getOutSource() {
		return this.outSource;
	}
	public void setOutSource(String outSource) {
		this.outSource = outSource;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
