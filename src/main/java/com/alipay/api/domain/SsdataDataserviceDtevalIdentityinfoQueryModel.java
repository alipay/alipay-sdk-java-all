package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上数用户信息核身信息查询接口
 *
 * @author auto create
 * @since 1.0, 2017-06-14 11:33:39
 */
public class SsdataDataserviceDtevalIdentityinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2635549439118564927L;

	/**
	 * 业务流水号(biz_no)，代表了一笔业务，该参数由上数系统创建，为了唯一确定一笔业务的具体核身查询动作
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务类型(biz_type)，代表了查询核身信息的业务具体类型，其中prophet来自于枚举值，目前枚举值只有一个业务枚举，即"先知"业务 ，该参数由上数系统传递
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 手机号(phone)，代表传入的用户手机号码，该参数由上数系统传递
	 */
	@ApiField("phone")
	private String phone;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
