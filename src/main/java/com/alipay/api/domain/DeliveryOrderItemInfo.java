package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 配送单的配送明细
 *
 * @author auto create
 * @since 1.0, 2019-04-08 16:48:49
 */
public class DeliveryOrderItemInfo extends AlipayObject {

	private static final long serialVersionUID = 4838424814213754197L;

	/**
	 * JSON格式的字符串，保留的扩展字段，用于后期接口扩展时传递数据
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 物料SKU
	 */
	@ApiField("sku")
	private String sku;

	/**
	 * 出库的物料数量
	 */
	@ApiField("stuff_amount")
	private Long stuffAmount;

	/**
	 * 物料名称
	 */
	@ApiField("stuff_name")
	private String stuffName;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getSku() {
		return this.sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}

	public Long getStuffAmount() {
		return this.stuffAmount;
	}
	public void setStuffAmount(Long stuffAmount) {
		this.stuffAmount = stuffAmount;
	}

	public String getStuffName() {
		return this.stuffName;
	}
	public void setStuffName(String stuffName) {
		this.stuffName = stuffName;
	}

}
