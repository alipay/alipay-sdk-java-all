package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品修改
 *
 * @author auto create
 * @since 1.0, 2026-10-21 11:23:00
 */
public class AlipayTradeProductModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1833894936656337316L;

	/**
	 * 该商品默认价格id
	 */
	@ApiField("default_price_id")
	private String defaultPriceId;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品元数据
	 */
	@ApiField("metadata")
	private String metadata;

	/**
	 * 商品名称，建议命名格式：服务名-等级/版本-周期 e.g：AI视频Token包-高级会员-月度订阅
	 */
	@ApiField("name")
	private String name;

	/**
	 * 本次更新的商品id
	 */
	@ApiField("product_id")
	private String productId;

	public String getDefaultPriceId() {
		return this.defaultPriceId;
	}
	public void setDefaultPriceId(String defaultPriceId) {
		this.defaultPriceId = defaultPriceId;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getMetadata() {
		return this.metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

}
