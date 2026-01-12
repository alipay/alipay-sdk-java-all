package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 购票站点信息，包含站点名称，站点编码，站点外部编码
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class StationDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 3176446824116245366L;

	/**
	 * 站点编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 站点外部编码
	 */
	@ApiField("ext_code")
	private String extCode;

	/**
	 * 站点中文名称
	 */
	@ApiField("name")
	private String name;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getExtCode() {
		return this.extCode;
	}
	public void setExtCode(String extCode) {
		this.extCode = extCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
