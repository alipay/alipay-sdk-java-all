package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用检测
 *
 * @author auto create
 * @since 1.0, 2024-07-03 19:23:48
 */
public class AlipaySecurityRiskAppinfoDetectModel extends AlipayObject {

	private static final long serialVersionUID = 1424782447553226669L;

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
