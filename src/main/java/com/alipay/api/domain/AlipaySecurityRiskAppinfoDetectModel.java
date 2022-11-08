package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用检测
 *
 * @author auto create
 * @since 1.0, 2022-08-15 17:25:20
 */
public class AlipaySecurityRiskAppinfoDetectModel extends AlipayObject {

	private static final long serialVersionUID = 6282324816693281351L;

	/**
	 * app或包信息
	 */
	@ApiField("app_info_list")
	private String appInfoList;

	/**
	 * 扩展配置信息
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 厂商标识
	 */
	@ApiField("source")
	private String source;

	public String getAppInfoList() {
		return this.appInfoList;
	}
	public void setAppInfoList(String appInfoList) {
		this.appInfoList = appInfoList;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
