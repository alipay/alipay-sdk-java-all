package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询广告投放实体详情
 *
 * @author auto create
 * @since 1.0, 2025-07-14 20:50:51
 */
public class AlipayDataDataserviceAdentitylibraryServiceentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1398597925868211979L;

	/**
	 * 商品的id
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 灯火定义的营销目标对应的code值
	 */
	@ApiField("market_target_code")
	private String marketTargetCode;

	/**
	 * 商家的id，用于唯一标识一个商家
	 */
	@ApiField("principal_id")
	private Long principalId;

	/**
	 * 商家标志,唯一值,在广告投放平台商家详情获取。
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 用于表示实体来源
	 */
	@ApiField("service_entity_out_source")
	private String serviceEntityOutSource;

	/**
	 * 标识实体的类型，可以是电商商品、金融商品、保险服务三种类型
	 */
	@ApiField("service_entity_type")
	private String serviceEntityType;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getMarketTargetCode() {
		return this.marketTargetCode;
	}
	public void setMarketTargetCode(String marketTargetCode) {
		this.marketTargetCode = marketTargetCode;
	}

	public Long getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getServiceEntityOutSource() {
		return this.serviceEntityOutSource;
	}
	public void setServiceEntityOutSource(String serviceEntityOutSource) {
		this.serviceEntityOutSource = serviceEntityOutSource;
	}

	public String getServiceEntityType() {
		return this.serviceEntityType;
	}
	public void setServiceEntityType(String serviceEntityType) {
		this.serviceEntityType = serviceEntityType;
	}

}
