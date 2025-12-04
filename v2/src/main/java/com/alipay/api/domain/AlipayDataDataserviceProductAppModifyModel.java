package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序商品状态更新
 *
 * @author auto create
 * @since 1.0, 2025-10-30 14:23:10
 */
public class AlipayDataDataserviceProductAppModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7342114256163916491L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 商品类型，由灯火系统分配给商家
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 商家侧商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商品来源，油灯火系统分配给商户
	 */
	@ApiField("out_source")
	private String outSource;

	/**
	 * 商品归属的商户oid, 传入oid时优先使用oid，否则使用pid
	 */
	@ApiField("owner_oid")
	private String ownerOid;

	/**
	 * 商品归属的商户pid
	 */
	@ApiField("owner_pid")
	private String ownerPid;

	/**
	 * 商家在支付宝数字推广平台唯一标识
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 商品归属小程序id
	 */
	@ApiField("prod_app_id")
	private String prodAppId;

	/**
	 * 商品原始状态
	 */
	@ApiField("src_status")
	private String srcStatus;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSource() {
		return this.outSource;
	}
	public void setOutSource(String outSource) {
		this.outSource = outSource;
	}

	public String getOwnerOid() {
		return this.ownerOid;
	}
	public void setOwnerOid(String ownerOid) {
		this.ownerOid = ownerOid;
	}

	public String getOwnerPid() {
		return this.ownerPid;
	}
	public void setOwnerPid(String ownerPid) {
		this.ownerPid = ownerPid;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getProdAppId() {
		return this.prodAppId;
	}
	public void setProdAppId(String prodAppId) {
		this.prodAppId = prodAppId;
	}

	public String getSrcStatus() {
		return this.srcStatus;
	}
	public void setSrcStatus(String srcStatus) {
		this.srcStatus = srcStatus;
	}

}
