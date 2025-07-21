package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用企业标签信息查询
 *
 * @author auto create
 * @since 1.0, 2024-07-10 11:51:40
 */
public class ZhimaCreditEpDossierLabelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8265942635768495284L;

	/**
	 * 统一社会信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 业务场景。不同业务场景，输出结果不同，请联系接口对接人，分配业务场景码。
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 是否用于展示
	 */
	@ApiField("show_flag")
	private Boolean showFlag;

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

	public Boolean getShowFlag() {
		return this.showFlag;
	}
	public void setShowFlag(Boolean showFlag) {
		this.showFlag = showFlag;
	}

}
