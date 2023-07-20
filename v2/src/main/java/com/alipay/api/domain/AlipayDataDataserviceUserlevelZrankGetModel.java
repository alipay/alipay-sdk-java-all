package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通用的活跃高价值用户等级，支持EMAIL,PHONE,BANKCARD,CERTNO,IMEI,MAC，TBID维度查询用户活跃高价值等级。等级从Z0-Z7，等级越高价值越高，Z0表示未实名认证或者用户信息不全。
 *
 * @author auto create
 * @since 1.0, 2019-08-13 16:30:02
 */
public class AlipayDataDataserviceUserlevelZrankGetModel extends AlipayObject {

	private static final long serialVersionUID = 7818125314565272384L;

	/**
	 * type对应的账号：如手机号-13815869530
	 */
	@ApiField("id")
	private String id;

	/**
	 * 暂时支持：EMAIL(邮箱),PHONE(手机号),BANKCARD（银行卡）,CERTNO（身份证）,IMEI（设备唯一码）,MAC（mac地址）,TBID（淘宝id）
	 */
	@ApiField("type")
	private String type;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
