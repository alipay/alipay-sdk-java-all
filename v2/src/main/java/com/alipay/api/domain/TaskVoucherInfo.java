package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务优惠券列表
 *
 * @author auto create
 * @since 1.0, 2021-12-27 14:54:59
 */
public class TaskVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 2295117971212464642L;

	/**
	 * 当前门店优惠券核销笔数
	 */
	@ApiField("shop_voucher_sales_amount")
	private Long shopVoucherSalesAmount;

	/**
	 * 优惠券面额
	 */
	@ApiField("voucher_denomination")
	private String voucherDenomination;

	/**
	 * 优惠券图标链接
	 */
	@ApiField("voucher_icon_url")
	private String voucherIconUrl;

	/**
	 * 优惠券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 优惠券核销笔数
	 */
	@ApiField("voucher_sales_amount")
	private Long voucherSalesAmount;

	/**
	 * 优惠券模版id，唯一标识
	 */
	@ApiField("voucher_template_id")
	private String voucherTemplateId;

	/**
	 * 优惠券门槛
	 */
	@ApiField("voucher_usage_threshold")
	private String voucherUsageThreshold;

	public Long getShopVoucherSalesAmount() {
		return this.shopVoucherSalesAmount;
	}
	public void setShopVoucherSalesAmount(Long shopVoucherSalesAmount) {
		this.shopVoucherSalesAmount = shopVoucherSalesAmount;
	}

	public String getVoucherDenomination() {
		return this.voucherDenomination;
	}
	public void setVoucherDenomination(String voucherDenomination) {
		this.voucherDenomination = voucherDenomination;
	}

	public String getVoucherIconUrl() {
		return this.voucherIconUrl;
	}
	public void setVoucherIconUrl(String voucherIconUrl) {
		this.voucherIconUrl = voucherIconUrl;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	public Long getVoucherSalesAmount() {
		return this.voucherSalesAmount;
	}
	public void setVoucherSalesAmount(Long voucherSalesAmount) {
		this.voucherSalesAmount = voucherSalesAmount;
	}

	public String getVoucherTemplateId() {
		return this.voucherTemplateId;
	}
	public void setVoucherTemplateId(String voucherTemplateId) {
		this.voucherTemplateId = voucherTemplateId;
	}

	public String getVoucherUsageThreshold() {
		return this.voucherUsageThreshold;
	}
	public void setVoucherUsageThreshold(String voucherUsageThreshold) {
		this.voucherUsageThreshold = voucherUsageThreshold;
	}

}
