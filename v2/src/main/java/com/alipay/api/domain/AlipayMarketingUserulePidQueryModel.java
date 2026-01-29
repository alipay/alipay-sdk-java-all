package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户签约PID查询
 *
 * @author auto create
 * @since 1.0, 2024-12-24 15:40:55
 */
public class AlipayMarketingUserulePidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1583116248125464387L;

	/**
	 * 合作伙伴ID，传入ID必须与当前APPID所属合作伙伴ID一致，否则会报权限不足
	 */
	@ApiField("pid")
	private String pid;

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
