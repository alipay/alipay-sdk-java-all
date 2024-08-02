package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 处置查询结果
 *
 * @author auto create
 * @since 1.0, 2022-12-21 10:10:52
 */
public class PunishStatusResult extends AlipayObject {

	private static final long serialVersionUID = 1744282823679981188L;

	/**
	 * 需求code
	 */
	@ApiField("demand_code")
	private String demandCode;

	/**
	 * 主体Id
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * pc端自解限跳转URL
	 */
	@ApiField("pc_relieve_url")
	private String pcRelieveUrl;

	/**
	 * app端自解限跳转URL
	 */
	@ApiField("relieve_url")
	private String relieveUrl;

	/**
	 * 处置状态
	 */
	@ApiField("status")
	private String status;

	public String getDemandCode() {
		return this.demandCode;
	}
	public void setDemandCode(String demandCode) {
		this.demandCode = demandCode;
	}

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getPcRelieveUrl() {
		return this.pcRelieveUrl;
	}
	public void setPcRelieveUrl(String pcRelieveUrl) {
		this.pcRelieveUrl = pcRelieveUrl;
	}

	public String getRelieveUrl() {
		return this.relieveUrl;
	}
	public void setRelieveUrl(String relieveUrl) {
		this.relieveUrl = relieveUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
