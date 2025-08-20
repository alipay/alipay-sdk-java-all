package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用服务企业标签信息查询
 *
 * @author auto create
 * @since 1.0, 2024-12-24 16:41:08
 */
public class ZhimaCreditEpAcceptanceLabelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7163826397317895867L;

	/**
	 * 统一社会信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 受理台业务场景类别，由芝麻企业信用方分发提供，配置有误会返回参数错误
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 是否用于前端展示标识（true标识用于展示，false标识不用于展示，不传代表false不用于展示）
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
