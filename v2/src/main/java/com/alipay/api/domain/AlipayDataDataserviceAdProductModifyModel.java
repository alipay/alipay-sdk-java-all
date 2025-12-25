package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品状态更新接口
 *
 * @author auto create
 * @since 1.0, 2025-10-30 14:23:23
 */
public class AlipayDataDataserviceAdProductModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5515954541493524428L;

	/**
	 * 商品归属的商户oid, 传入oid时优先使用oid，否则使用pid
	 */
	@ApiField("alipay_oid")
	private String alipayOid;

	/**
	 * 支付宝唯一id，用于操作鉴权
	 */
	@ApiField("alipay_pid")
	private String alipayPid;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 商品实体类型code，由灯火系统分配
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 商品外部id
	 */
	@ApiField("out_id")
	private String outId;

	/**
	 * 商品外部来源code，由灯火系统分配
	 */
	@ApiField("source")
	private String source;

	/**
	 * 商品外部原始状态
	 */
	@ApiField("source_status")
	private String sourceStatus;

	public String getAlipayOid() {
		return this.alipayOid;
	}
	public void setAlipayOid(String alipayOid) {
		this.alipayOid = alipayOid;
	}

	public String getAlipayPid() {
		return this.alipayPid;
	}
	public void setAlipayPid(String alipayPid) {
		this.alipayPid = alipayPid;
	}

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

	public String getOutId() {
		return this.outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceStatus() {
		return this.sourceStatus;
	}
	public void setSourceStatus(String sourceStatus) {
		this.sourceStatus = sourceStatus;
	}

}
