package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单车牌新增/删除API
 *
 * @author auto create
 * @since 1.0, 2019-08-06 20:04:27
 */
public class AlipayEcoMycarParkingCarnumberModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5844329533823462754L;

	/**
	 * 支付宝用户UID，以2088开头的16位数字
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 车牌号
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 扩展参数
	 */
	@ApiField("extern_param")
	private String externParam;

	/**
	 * 目前包括删除和新增车牌，分别为：
deletecar-删除车牌
addcar-新增车牌
	 */
	@ApiField("operate_type")
	private String operateType;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getExternParam() {
		return this.externParam;
	}
	public void setExternParam(String externParam) {
		this.externParam = externParam;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
