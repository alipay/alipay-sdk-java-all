package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * alipay.gas.coupon.merchant.query
 *
 * @author auto create
 * @since 1.0, 2020-11-25 20:39:57
 */
public class AlipayCommerceGasInfoGroupcouponQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3539134669262833854L;

	/**
	 * 劵创建结束时间:格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_end_time")
	private Date createEndTime;

	/**
	 * 劵创建开始时间:格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_start_time")
	private Date createStartTime;

	/**
	 * 当前页码,不填写默认第一页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页显示数,不填写默认10条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * shop_id和partner_id不能同时为空
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * ENABLED:可用,多个状态逗号分开,DISABLED:不可用, 多个逗号分隔，例如:ENABLED,DISABLED
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	public Date getCreateEndTime() {
		return this.createEndTime;
	}
	public void setCreateEndTime(Date createEndTime) {
		this.createEndTime = createEndTime;
	}

	public Date getCreateStartTime() {
		return this.createStartTime;
	}
	public void setCreateStartTime(Date createStartTime) {
		this.createStartTime = createStartTime;
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

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
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

	public String getVoucherStatus() {
		return this.voucherStatus;
	}
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

}
