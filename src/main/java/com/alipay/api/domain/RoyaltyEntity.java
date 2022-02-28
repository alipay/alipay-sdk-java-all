package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账主体信息
 *
 * @author auto create
 * @since 1.0, 2021-10-26 00:20:22
 */
public class RoyaltyEntity extends AlipayObject {

	private static final long serialVersionUID = 6319958541713342216L;

	/**
	 * 分账接收方账号。
当分账方类型是userId时，本参数为用户的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字；
当分账方类型是loginName时，本参数为用户的支付宝登录号。
	 */
	@ApiField("account")
	private String account;

	/**
	 * 分账关系描述
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 分账接收方真实姓名。
绑定分账关系时：
当分账方类型是userId时，本参数可以不传，若上传则进行校验不上传不会校验。
当分账方类型是loginName时，本参数必传。
解绑分账关系时：作为请求参数可不填，分账关系查询时不作为返回结果返回
	 */
	@ApiField("name")
	private String name;

	/**
	 * 分账接收方方类型。
userId：表示是支付宝账号对应的支付宝唯一用户号；loginName：表示是支付宝登录号
	 */
	@ApiField("type")
	private String type;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
