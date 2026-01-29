package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 条件查询用户凭证
 *
 * @author auto create
 * @since 1.0, 2025-08-15 16:21:08
 */
public class AlipayMarketingCertificateUserBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4748877658927526485L;

	/**
	 * 凭证归属的商户id。该参数为空时取当前请求商户id
	 */
	@ApiField("belong_merchant_id")
	private String belongMerchantId;

	/**
	 * 凭证状态筛选
	 */
	@ApiField("certificate_status")
	private String certificateStatus;

	/**
	 * 支付宝用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 分页查询页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询单页数据条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 支付宝的门店id，用于判断凭证是否可在此门店进行核销。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 出资的支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBelongMerchantId() {
		return this.belongMerchantId;
	}
	public void setBelongMerchantId(String belongMerchantId) {
		this.belongMerchantId = belongMerchantId;
	}

	public String getCertificateStatus() {
		return this.certificateStatus;
	}
	public void setCertificateStatus(String certificateStatus) {
		this.certificateStatus = certificateStatus;
	}

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

}
