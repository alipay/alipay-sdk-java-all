package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ka服务地址注册
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:53:15
 */
public class AlipayEcoRenthouseKaServiceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4875677147186196158L;

	/**
	 * 地址-对应在网关注册时候的接口标识
	 */
	@ApiField("address")
	private String address;

	/**
	 * kaCode唯一标识
	 */
	@ApiField("ka_code")
	private String kaCode;

	/**
	 * 类型：1:预约看房， 2:确认租约 ，3:拨号记录， 4:支付页面url
	 */
	@ApiField("type")
	private Long type;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getKaCode() {
		return this.kaCode;
	}
	public void setKaCode(String kaCode) {
		this.kaCode = kaCode;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
