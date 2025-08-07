package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兑换券价值模型
 *
 * @author auto create
 * @since 1.0, 2023-11-27 20:57:23
 */
public class ExchangeVoucherValueInfo extends AlipayObject {

	private static final long serialVersionUID = 3894678166746226531L;

	/**
	 * 兑换券本次变更的次数
	 */
	@ApiField("change_count")
	private Long changeCount;

	/**
	 * 兑换券可兑换的商品图片
	 */
	@ApiField("product_img_url")
	private String productImgUrl;

	/**
	 * 兑换券可兑换的商品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 兑换券剩余还可兑换的次数
	 */
	@ApiField("remain_count")
	private Long remainCount;

	/**
	 * 兑换券可兑换的总次数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 兑换券已兑换的次数
	 */
	@ApiField("used_count")
	private Long usedCount;

	public Long getChangeCount() {
		return this.changeCount;
	}
	public void setChangeCount(Long changeCount) {
		this.changeCount = changeCount;
	}

	public String getProductImgUrl() {
		return this.productImgUrl;
	}
	public void setProductImgUrl(String productImgUrl) {
		this.productImgUrl = productImgUrl;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getRemainCount() {
		return this.remainCount;
	}
	public void setRemainCount(Long remainCount) {
		this.remainCount = remainCount;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getUsedCount() {
		return this.usedCount;
	}
	public void setUsedCount(Long usedCount) {
		this.usedCount = usedCount;
	}

}
