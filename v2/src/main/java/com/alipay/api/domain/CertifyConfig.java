package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店扫码核验业务场景下， 插件小程序页面展示的配置
 *
 * @author auto create
 * @since 1.0, 2023-08-24 17:39:09
 */
public class CertifyConfig extends AlipayObject {

	private static final long serialVersionUID = 7473265119816929539L;

	/**
	 * 核验模式，可选范围：【FACE : 人脸认证 ，
 CERT_PHOTO_FACE : 证照和人脸认证】
	 */
	@ApiField("certify_biz_code")
	private String certifyBizCode;

	/**
	 * 组件编码,用于表示使用场景
	 */
	@ApiField("component_out_id")
	private String componentOutId;

	/**
	 * 是否要地址，可选范围【0， 1】
0不需要，1需要，不填写或填错默认1
	 */
	@ApiField("need_address")
	private String needAddress;

	/**
	 * 结果页是否需要展示支付宝侧登记码，可选范围【0， 1】0不需要，1需要，不填写或填错默认1。若不需要展示支付宝侧登记码，则需要isv实时返回isv侧登记码，不返回则不显示登记码
	 */
	@ApiField("need_certify_id")
	private String needCertifyId;

	/**
	 * 是否要性别，可选范围【0， 1】
0不需要，1需要，不填写或填错默认1
	 */
	@ApiField("need_gender")
	private String needGender;

	/**
	 * 是否要手机号，可选范围【0， 1】
0不需要，1需要，不填写或填错默认1
	 */
	@ApiField("need_phone")
	private String needPhone;

	/**
	 * 是否要民族，可选范围【0， 1】
0不需要，1需要，不填写或填错默认1
	 */
	@ApiField("need_user_nation")
	private String needUserNation;

	/**
	 * 核验渠道， IOT核验-IOTMBS，会员中心验证-MEMBER
	 */
	@ApiField("verify_channel")
	private String verifyChannel;

	public String getCertifyBizCode() {
		return this.certifyBizCode;
	}
	public void setCertifyBizCode(String certifyBizCode) {
		this.certifyBizCode = certifyBizCode;
	}

	public String getComponentOutId() {
		return this.componentOutId;
	}
	public void setComponentOutId(String componentOutId) {
		this.componentOutId = componentOutId;
	}

	public String getNeedAddress() {
		return this.needAddress;
	}
	public void setNeedAddress(String needAddress) {
		this.needAddress = needAddress;
	}

	public String getNeedCertifyId() {
		return this.needCertifyId;
	}
	public void setNeedCertifyId(String needCertifyId) {
		this.needCertifyId = needCertifyId;
	}

	public String getNeedGender() {
		return this.needGender;
	}
	public void setNeedGender(String needGender) {
		this.needGender = needGender;
	}

	public String getNeedPhone() {
		return this.needPhone;
	}
	public void setNeedPhone(String needPhone) {
		this.needPhone = needPhone;
	}

	public String getNeedUserNation() {
		return this.needUserNation;
	}
	public void setNeedUserNation(String needUserNation) {
		this.needUserNation = needUserNation;
	}

	public String getVerifyChannel() {
		return this.verifyChannel;
	}
	public void setVerifyChannel(String verifyChannel) {
		this.verifyChannel = verifyChannel;
	}

}
