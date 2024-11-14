package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询物料上传结果
 *
 * @author auto create
 * @since 1.0, 2024-07-19 16:30:24
 */
public class AlipayDataDataserviceAdMaterialQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6274161716458351443L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

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

	/**
	 * 上传图片/视频物料对应的外部id，需要保证唯一
	 */
	@ApiField("material_outer_id")
	private String materialOuterId;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
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

	public String getMaterialOuterId() {
		return this.materialOuterId;
	}
	public void setMaterialOuterId(String materialOuterId) {
		this.materialOuterId = materialOuterId;
	}

}
