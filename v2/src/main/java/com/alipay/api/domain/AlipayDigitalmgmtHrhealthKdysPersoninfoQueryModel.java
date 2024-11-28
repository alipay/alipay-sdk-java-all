package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 体检系统口袋医生在线问诊-人员信息查询
 *
 * @author auto create
 * @since 1.0, 2023-09-19 21:02:53
 */
public class AlipayDigitalmgmtHrhealthKdysPersoninfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4366238134585628832L;

	/**
	 * 一般为带'-'的uuid
	 */
	@ApiField("data_key")
	private String dataKey;

	/**
	 * 钉钉免登码
	 */
	@ApiField("no_login_code")
	private String noLoginCode;

	public String getDataKey() {
		return this.dataKey;
	}
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

	public String getNoLoginCode() {
		return this.noLoginCode;
	}
	public void setNoLoginCode(String noLoginCode) {
		this.noLoginCode = noLoginCode;
	}

}
