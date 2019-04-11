package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品SKU创建模型
 *
 * @author auto create
 * @since 1.0, 2018-11-28 16:15:37
 */
public class ItemSkuCreateInfo extends AlipayObject {

	private static final long serialVersionUID = 6239669462756368254L;

	/**
	 * 成本价，单位分
	 */
	@ApiField("cost_price")
	private Long costPrice;

	/**
	 * SKU扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("item_ext_info")
	private List<ItemExtInfo> extInfo;

	/**
	 * 标价，单位分
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 售价，单位分
	 */
	@ApiField("price")
	private Long price;

	public Long getCostPrice() {
		return this.costPrice;
	}
	public void setCostPrice(Long costPrice) {
		this.costPrice = costPrice;
	}

	public List<ItemExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<ItemExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

}
