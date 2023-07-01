package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 巨神兵引擎登录状态同步
 *
 * @author auto create
 * @since 1.0, 2021-03-10 16:44:47
 */
public class AlipayEbppInspectSessionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8252573445572515369L;

	/**
	 * id
	 */
	@ApiField("log_name")
	private String logName;

	public String getLogName() {
		return this.logName;
	}
	public void setLogName(String logName) {
		this.logName = logName;
	}

}
