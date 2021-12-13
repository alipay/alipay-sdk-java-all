package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量生产IoT设备sn
 *
 * @author auto create
 * @since 1.0, 2021-01-28 19:39:35
 */
public class AlipayCommerceIotSnCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6415515636153693868L;

	/**
	 * 申请单描述信息
	 */
	@ApiField("content")
	private String content;

	/**
	 * 生成的sn数量
	 */
	@ApiField("create_count")
	private Long createCount;

	/**
	 * 硬件产品标识位
硬件差异的标识，有硬件换料的需求，需要在SN中区分
	 */
	@ApiField("hardware_product_id")
	private String hardwareProductId;

	/**
	 * 物料id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * pcba板厂商
	 */
	@ApiField("pcba")
	private String pcba;

	/**
	 * 产品系列
	 */
	@ApiField("product_series")
	private String productSeries;

	/**
	 * 规则id
	 */
	@ApiField("rule_id")
	private Long ruleId;

	/**
	 * 厂商id
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Long getCreateCount() {
		return this.createCount;
	}
	public void setCreateCount(Long createCount) {
		this.createCount = createCount;
	}

	public String getHardwareProductId() {
		return this.hardwareProductId;
	}
	public void setHardwareProductId(String hardwareProductId) {
		this.hardwareProductId = hardwareProductId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getPcba() {
		return this.pcba;
	}
	public void setPcba(String pcba) {
		this.pcba = pcba;
	}

	public String getProductSeries() {
		return this.productSeries;
	}
	public void setProductSeries(String productSeries) {
		this.productSeries = productSeries;
	}

	public Long getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
