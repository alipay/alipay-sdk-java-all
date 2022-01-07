package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁乐驾车主车辆保存服务
 *
 * @author auto create
 * @since 1.0, 2019-08-26 17:24:24
 */
public class AlipayInsAutoCarSaveModel extends AlipayObject {

	private static final long serialVersionUID = 1655422376789771349L;

	/**
	 * 车牌号
	 */
	@ApiField("car_no")
	private String carNo;

	/**
	 * 用户ID,车主会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCarNo() {
		return this.carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
