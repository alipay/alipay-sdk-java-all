package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量生产IoT设备sn
 *
 * @author auto create
 * @since 1.0, 2019-11-26 14:34:00
 */
public class AlipayCommerceIotSnCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1114712546745427314L;

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
	 * 厂商id
	 */
	@ApiField("supplier_id")
	private String supplierId;

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

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
