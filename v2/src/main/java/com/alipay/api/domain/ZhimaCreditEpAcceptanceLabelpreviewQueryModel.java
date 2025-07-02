package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用企业公开标签预览接口
 *
 * @author auto create
 * @since 1.0, 2024-07-10 11:38:34
 */
public class ZhimaCreditEpAcceptanceLabelpreviewQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1143299443521394483L;

	/**
	 * 统一社会信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 受理台业务场景类别，由蚂蚁企业信用方分发提供，配置有误会返回参数错误
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
