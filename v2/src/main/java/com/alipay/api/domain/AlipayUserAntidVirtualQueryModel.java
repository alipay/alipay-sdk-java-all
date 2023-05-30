package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据识别因子查询虚拟账户AntID
 *
 * @author auto create
 * @since 1.0, 2021-06-17 15:19:36
 */
public class AlipayUserAntidVirtualQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4154247765878824721L;

	/**
	 * 业务域场景，由提供方分配
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 识别因子内容，json格式内容。跟identification_factor_type一一对应。MOBILE_BIZ类型对应的key为mobile,bizType,bizId; THIRD_PARTY类型对应的key为partnerId,userId,bizId; CERTIFICATE类型对应的key为certType,certNo,certName。 会以不同识别因子类型的识别内容作为唯一条件查询虚拟账户AntID
	 */
	@ApiField("identification_factor_content")
	private String identificationFactorContent;

	/**
	 * 识别因子类型，有3种；分别为手机场景识别因子 MOBILE_BIZ，第三方识别因子 THIRD_PARTY和证件识别因子 CERTIFICATE
	 */
	@ApiField("identification_factor_type")
	private String identificationFactorType;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
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

}
