package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户票使用记录查询接口
 *
 * @author auto create
 * @since 1.0, 2023-11-27 10:27:45
 */
public class AlipayMarketingVoucherBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2849381578299284658L;

	/**
	 * 支付宝用户的openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 第多少页，从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页返回的数据量大小，取值范围1~50
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
