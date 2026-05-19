package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NexusPayProduct;
import com.alipay.api.domain.RecurringConfig;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.price.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-15 17:41:29
 */
public class AlipayTradePriceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8137683866668823468L;

	/** 
	 * 该价格实例是否可用
	 */
	@ApiField("active")
	private Boolean active;

	/** 
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 价格id
	 */
	@ApiField("id")
	private String id;

	/** 
	 * 商户需要保存在价格模型中的元数据
	 */
	@ApiField("metadata")
	private String metadata;

	/** 
	 * 关联的商品信息
	 */
	@ApiField("product")
	private NexusPayProduct product;

	/** 
	 * 关联商品id
	 */
	@ApiField("product_id")
	private String productId;

	/** 
	 * 循环计价配置，用于订阅等场景
	 */
	@ApiField("recurring")
	private RecurringConfig recurring;

	/** 
	 * 价格类型
	 */
	@ApiField("type")
	private String type;

	/** 
	 * 单位金额，单位：分
	 */
	@ApiField("unit_amount")
	private Long unitAmount;

	public void setActive(Boolean active) {
		this.active = active;
	}
	public Boolean getActive( ) {
		return this.active;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}
	public String getMetadata( ) {
		return this.metadata;
	}

	public void setProduct(NexusPayProduct product) {
		this.product = product;
	}
	public NexusPayProduct getProduct( ) {
		return this.product;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductId( ) {
		return this.productId;
	}

	public void setRecurring(RecurringConfig recurring) {
		this.recurring = recurring;
	}
	public RecurringConfig getRecurring( ) {
		return this.recurring;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

	public void setUnitAmount(Long unitAmount) {
		this.unitAmount = unitAmount;
	}
	public Long getUnitAmount( ) {
		return this.unitAmount;
	}

}
