package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品信息对象
 *
 * @author auto create
 * @since 1.0, 2021-01-28 20:26:40
 */
public class IoTBPaaSMerchantOrderItemInfo extends AlipayObject {

	private static final long serialVersionUID = 3841366562557184194L;

	/**
	 * 商品属性列表
	 */
	@ApiListField("attrs")
	@ApiField("io_t_b_paa_s_key_value")
	private List<IoTBPaaSKeyValue> attrs;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品数量
	 */
	@ApiField("item_num")
	private String itemNum;

	/**
	 * 商品价格
	 */
	@ApiField("item_price")
	private String itemPrice;

	/**
	 * 商品规格列表
	 */
	@ApiListField("specs")
	@ApiField("io_t_b_paa_s_key_value")
	private List<IoTBPaaSKeyValue> specs;

	public List<IoTBPaaSKeyValue> getAttrs() {
		return this.attrs;
	}
	public void setAttrs(List<IoTBPaaSKeyValue> attrs) {
		this.attrs = attrs;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemNum() {
		return this.itemNum;
	}
	public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public List<IoTBPaaSKeyValue> getSpecs() {
		return this.specs;
	}
	public void setSpecs(List<IoTBPaaSKeyValue> specs) {
		this.specs = specs;
	}

}
