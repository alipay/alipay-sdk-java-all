package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 主站配置查询接口
 *
 * @author auto create
 * @since 1.0, 2022-05-18 16:19:24
 */
public class AlipayAccountExrateConfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6198991479575568467L;

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
