package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁操作员联系方式信息
 *
 * @author auto create
 * @since 1.0, 2022-07-18 10:10:50
 */
public class OperatorContactVO extends AlipayObject {

	private static final long serialVersionUID = 8444574771697174662L;

	/**
	 * 联系方式类型，取值参考OperatorContactTypeEnum
范围如下：
1=手机
2=电话
3=Email
8=钉钉
	 */
	@ApiField("type")
	private String type;

	/**
	 * 联系方式值，类型由type决定。
若type=1，则value填手机号码；
若type=3，则value填Email地址；
以此类推
	 */
	@ApiField("value")
	private String value;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
