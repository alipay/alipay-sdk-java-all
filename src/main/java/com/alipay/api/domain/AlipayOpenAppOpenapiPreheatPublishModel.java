package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放网关openapi预热接口
 *
 * @author auto create
 * @since 1.0, 2019-04-29 19:46:49
 */
public class AlipayOpenAppOpenapiPreheatPublishModel extends AlipayObject {

	private static final long serialVersionUID = 1168347622277524754L;

	/**
	 * 11
	 */
	@ApiField("datess")
	private Date datess;

	/**
	 * cesh
	 */
	@ApiField("user_id")
	private String userId;

	public Date getDatess() {
		return this.datess;
	}
	public void setDatess(Date datess) {
		this.datess = datess;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
