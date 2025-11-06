package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单的检票二维码
 *
 * @author auto create
 * @since 1.0, 2024-09-14 12:13:48
 */
public class TicketQRCode extends AlipayObject {

	private static final long serialVersionUID = 8639428283823943594L;

	/**
	 * 票 、码的描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 当前二维码的过期时间，可选传递,不传的话为长期有效
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 用户
	 */
	@ApiField("name")
	private String name;

	/**
	 * 当前二维码包含的门票的数量
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 二维码检票的code值
	 */
	@ApiField("qrcode")
	private String qrcode;

	/**
	 * qrcode的图片URL，可选传递
	 */
	@ApiField("qrcode_url")
	private String qrcodeUrl;

	/**
	 * 当前二维码的状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 二维码有效时长,单位为秒,不传的话为长期有效
	 */
	@ApiField("valid_time")
	private Long validTime;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public String getQrcode() {
		return this.qrcode;
	}
	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

	public String getQrcodeUrl() {
		return this.qrcodeUrl;
	}
	public void setQrcodeUrl(String qrcodeUrl) {
		this.qrcodeUrl = qrcodeUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getValidTime() {
		return this.validTime;
	}
	public void setValidTime(Long validTime) {
		this.validTime = validTime;
	}

}
