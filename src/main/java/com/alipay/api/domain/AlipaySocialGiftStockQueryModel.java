package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 送礼平台sku库存查询接口
 *
 * @author auto create
 * @since 1.0, 2018-10-11 21:12:30
 */
public class AlipaySocialGiftStockQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5879888954214535687L;

	/**
	 * 券码列表，商户体系内可兑换使用的券码。如果该值为空的话，则改接口会检查总库存和剩余可用库存。不为空则检查该列表中对应的卡码是否正确导入。
	 */
	@ApiListField("entity_list")
	@ApiField("string")
	private List<String> entityList;

	/**
	 * 商户再送礼平台分配的商户id，用于标识具体的调用业务方，需要先在送礼平台进行业务类型的分配之后才看使用。
	 */
	@ApiField("mid")
	private String mid;

	/**
	 * 对应送礼平台skuId，库存导入必须指定唯一的一个SKUID，该id需要送礼平台方先创建相应产品后，在通知使用方
	 */
	@ApiField("sku_id")
	private String skuId;

	public List<String> getEntityList() {
		return this.entityList;
	}
	public void setEntityList(List<String> entityList) {
		this.entityList = entityList;
	}

	public String getMid() {
		return this.mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
