package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转帐分佣-授权签约申请
 *
 * @author auto create
 * @since 1.0, 2025-12-15 16:56:09
 */
public class AlipayFundAllocSignAddModel extends AlipayObject {

	private static final long serialVersionUID = 7773185246717239878L;

	/**
	 * 授权签约业务扩展参数
	 */
	@ApiField("alloc_sign_biz_param")
	private AllocSignBizParam allocSignBizParam;

	/**
	 * 产品码由支付宝分配
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * pc -返回pc签约跳转链接，h5 -返回h5签约跳转地址，未传默认返回pc跳转地址
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 1、identity_type为ALIPAY_USER_ID时，该字段需填写开户企业的支付宝会员ID（2088开头的16位数字字符串）；
2、identity_type是ALIPAY_LOGON_ID该字段需填写开户企业的的支付宝登录号。
3、identity_type是ALIPAY_OPEN_ID该字段需填写支付宝的opneId
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * identity_type为ALIPAY_LOGON_ID时必填
	 */
	@ApiField("identity_name")
	private String identityName;

	/**
	 * 1、ALIPAY_USER_ID： 支付宝的会员ID
2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式
3、ALIPAY_OPEN_ID：支付宝openId
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 平台唯一，幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 转帐分佣产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public AllocSignBizParam getAllocSignBizParam() {
		return this.allocSignBizParam;
	}
	public void setAllocSignBizParam(AllocSignBizParam allocSignBizParam) {
		this.allocSignBizParam = allocSignBizParam;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
