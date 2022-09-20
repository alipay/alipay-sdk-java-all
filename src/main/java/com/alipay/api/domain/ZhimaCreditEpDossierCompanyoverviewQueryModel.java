package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁企业信用一分钟知企业
 *
 * @author auto create
 * @since 1.0, 2022-06-30 13:49:37
 */
public class ZhimaCreditEpDossierCompanyoverviewQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5321696872583624971L;

	/**
	 * 企业社会统一信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 业务场景。不同业务场景，输出结果不同，请联系接口对接人，分配业务场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
