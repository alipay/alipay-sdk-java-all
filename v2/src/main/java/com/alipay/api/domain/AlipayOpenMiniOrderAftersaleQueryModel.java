package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询售后单
 *
 * @author auto create
 * @since 1.0, 2025-02-28 16:03:21
 */
public class AlipayOpenMiniOrderAftersaleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5158549873272699612L;

	/**
	 * 售后单号，和商家自定义售后单号二选一
	 */
	@ApiField("aftersale_id")
	private String aftersaleId;

	/**
	 * 买家open_id，和uid二选一
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商家自定义售后单号，和平台售后单号二选一
	 */
	@ApiField("out_aftersale_id")
	private String outAftersaleId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAftersaleId() {
		return this.aftersaleId;
	}
	public void setAftersaleId(String aftersaleId) {
		this.aftersaleId = aftersaleId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutAftersaleId() {
		return this.outAftersaleId;
	}
	public void setOutAftersaleId(String outAftersaleId) {
		this.outAftersaleId = outAftersaleId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
