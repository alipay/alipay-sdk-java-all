package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量删除创意
 *
 * @author auto create
 * @since 1.0, 2024-07-19 14:36:40
 */
public class AlipayDataDataserviceAdCreativeDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2881416865527341328L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 要删除创意对应的外部资源ID集合，单批次最多支持20个广告，该ID由用户自己维护和对应
	 */
	@ApiListField("creative_outer_id_list")
	@ApiField("string")
	private List<String> creativeOuterIdList;

	/**
	 * 交易ID（灯火平台生成，请联系灯火运营获取）
	 */
	@ApiField("deal_id")
	private String dealId;

	/**
	 * 交易相关字段，新机构接入时，灯火平台会生成特定的值给到接入的机构，请联系灯火运营获取
	 */
	@ApiField("deal_type")
	private String dealType;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public List<String> getCreativeOuterIdList() {
		return this.creativeOuterIdList;
	}
	public void setCreativeOuterIdList(List<String> creativeOuterIdList) {
		this.creativeOuterIdList = creativeOuterIdList;
	}

	public String getDealId() {
		return this.dealId;
	}
	public void setDealId(String dealId) {
		this.dealId = dealId;
	}

	public String getDealType() {
		return this.dealType;
	}
	public void setDealType(String dealType) {
		this.dealType = dealType;
	}

}
