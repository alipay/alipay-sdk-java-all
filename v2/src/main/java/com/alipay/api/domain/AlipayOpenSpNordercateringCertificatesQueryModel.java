package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取核销凭证
 *
 * @author auto create
 * @since 1.0, 2026-10-12 13:47:58
 */
public class AlipayOpenSpNordercateringCertificatesQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2356358613127362416L;

	/**
	 * 点餐端类型
	 */
	@ApiField("client_type")
	private String clientType;

	/**
	 * 桌号
	 */
	@ApiField("desk_no")
	private String deskNo;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 当client_type为WECHAT必填
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 神券门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 当client_type为ALIPAY必填
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 当client_type为ALIPAY必填
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	/**
	 * 微信用户辅助标识
	 */
	@ApiField("wx_id")
	private String wxId;

	public String getClientType() {
		return this.clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getDeskNo() {
		return this.deskNo;
	}
	public void setDeskNo(String deskNo) {
		this.deskNo = deskNo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserOpenId() {
		return this.userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

	public String getWxId() {
		return this.wxId;
	}
	public void setWxId(String wxId) {
		this.wxId = wxId;
	}

}
