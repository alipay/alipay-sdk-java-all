package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 主站配置查询接口
 *
 * @author auto create
 * @since 1.0, 2021-03-12 19:52:12
 */
public class AlipayAccountExrateConfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2831582217624795191L;

	/**
	 * 国际同步到主站的scheduler配置的编码信息,唯一表示一条scheduler配置
	 */
	@ApiField("scheduler_code")
	private String schedulerCode;

	public String getSchedulerCode() {
		return this.schedulerCode;
	}
	public void setSchedulerCode(String schedulerCode) {
		this.schedulerCode = schedulerCode;
	}

}
