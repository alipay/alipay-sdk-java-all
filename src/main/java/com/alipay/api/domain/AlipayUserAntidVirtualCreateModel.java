package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基于识别因子方式创建蚂蚁虚拟账户ID
 *
 * @author auto create
 * @since 1.0, 2021-06-17 15:19:23
 */
public class AlipayUserAntidVirtualCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2469589645879763831L;

	/**
	 * 业务域场景，由提供方分配
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 额外附加信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 识别因子内容，json格式内容。跟identification_factor_type一一对应。MOBILE_BIZ类型对应的key为mobile,bizType,bizId; THIRD_PARTY类型对应的key为partnerId,userId,bizId; CERTIFICATE类型对应的key为certType,certNo,certName。
会以不同识别因子类型的识别内容作为幂等条件。
	 */
	@ApiField("identification_factor_content")
	private String identificationFactorContent;

	/**
	 * 识别因子类型，有3种；分别为手机场景识别因子 MOBILE_BIZ，第三方识别因子 THIRD_PARTY和证件识别因子 CERTIFICATE
	 */
	@ApiField("identification_factor_type")
	private String identificationFactorType;

	/**
	 * 注册来源，由提供方分配
	 */
	@ApiField("register_from")
	private String registerFrom;

	/**
	 * 用户类型，1-个人  2-企业
	 */
	@ApiField("user_type")
	private String userType;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getIdentificationFactorContent() {
		return this.identificationFactorContent;
	}
	public void setIdentificationFactorContent(String identificationFactorContent) {
		this.identificationFactorContent = identificationFactorContent;
	}

	public String getIdentificationFactorType() {
		return this.identificationFactorType;
	}
	public void setIdentificationFactorType(String identificationFactorType) {
		this.identificationFactorType = identificationFactorType;
	}

	public String getRegisterFrom() {
		return this.registerFrom;
	}
	public void setRegisterFrom(String registerFrom) {
		this.registerFrom = registerFrom;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
