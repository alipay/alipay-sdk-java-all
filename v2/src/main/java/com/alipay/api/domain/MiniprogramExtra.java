package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商查询生活号的扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-11-13 13:47:04
 */
public class MiniprogramExtra extends AlipayObject {

	private static final long serialVersionUID = 8574257339136466886L;

	/**
	 * 生活号佣金类型
	 */
	@ApiField("commission_type")
	private String commissionType;

	/**
	 * 小程序绑定的账号的管理员ID
	 */
	@ApiField("pid")
	private String pid;

	public String getCommissionType() {
		return this.commissionType;
	}
	public void setCommissionType(String commissionType) {
		this.commissionType = commissionType;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
