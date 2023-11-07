package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁商品sku信息
 *
 * @author auto create
 * @since 1.0, 2023-06-28 14:03:57
 */
public class LeaseItemSkuDTO extends AlipayObject {

	private static final long serialVersionUID = 4664262274859346551L;

	/**
	 * 品牌方pid
	 */
	@ApiField("brand_pid")
	private String brandPid;

	/**
	 * 品牌方skuid
	 */
	@ApiField("brand_sku_id")
	private String brandSkuId;

	/**
	 * sku租赁价格
	 */
	@ApiField("lease_price")
	private String leasePrice;

	/**
	 * 租赁商品跳转地址
	 */
	@ApiField("lessor_path")
	private String lessorPath;

	/**
	 * 租赁商pid
	 */
	@ApiField("lessor_pid")
	private String lessorPid;

	/**
	 * 租赁商品skuid
	 */
	@ApiField("lessor_sku_id")
	private String lessorSkuId;

	/**
	 * 支付宝平台侧商品sku的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getBrandPid() {
		return this.brandPid;
	}
	public void setBrandPid(String brandPid) {
		this.brandPid = brandPid;
	}

	public String getBrandSkuId() {
		return this.brandSkuId;
	}
	public void setBrandSkuId(String brandSkuId) {
		this.brandSkuId = brandSkuId;
	}

	public String getLeasePrice() {
		return this.leasePrice;
	}
	public void setLeasePrice(String leasePrice) {
		this.leasePrice = leasePrice;
	}

	public String getLessorPath() {
		return this.lessorPath;
	}
	public void setLessorPath(String lessorPath) {
		this.lessorPath = lessorPath;
	}

	public String getLessorPid() {
		return this.lessorPid;
	}
	public void setLessorPid(String lessorPid) {
		this.lessorPid = lessorPid;
	}

	public String getLessorSkuId() {
		return this.lessorSkuId;
	}
	public void setLessorSkuId(String lessorSkuId) {
		this.lessorSkuId = lessorSkuId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
