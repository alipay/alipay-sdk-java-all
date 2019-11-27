package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模拟高德地图接口
 *
 * @author auto create
 * @since 1.0, 2019-01-14 19:50:28
 */
public class AmapMapMapserviceAppOpenbizmockQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7155393937851269362L;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
