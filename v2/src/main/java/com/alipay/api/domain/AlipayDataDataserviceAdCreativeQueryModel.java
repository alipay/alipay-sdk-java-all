package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询创意详情
 *
 * @author auto create
 * @since 1.0, 2024-02-28 15:10:34
 */
public class AlipayDataDataserviceAdCreativeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7415355888737834525L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 外部平台导入广告库后，广告投放创意对应的外部资源ID
	 */
	@ApiField("creative_outer_id")
	private String creativeOuterId;

	/**
	 * 交易ID（灯火平台生成，请联系灯火运营获取）
	 */
	@ApiField("deal_id")
	private String dealId;

	/**
	 * 交易类型，如果是ReachMax公司，固定传字符串"ReachMax"
	 */
	@ApiField("deal_type")
	private String dealType;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getCreativeOuterId() {
		return this.creativeOuterId;
	}
	public void setCreativeOuterId(String creativeOuterId) {
		this.creativeOuterId = creativeOuterId;
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
