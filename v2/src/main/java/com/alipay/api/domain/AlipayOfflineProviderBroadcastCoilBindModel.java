package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Lite音箱碰配件绑定接口
 *
 * @author auto create
 * @since 1.0, 2026-09-29 19:42:54
 */
public class AlipayOfflineProviderBroadcastCoilBindModel extends AlipayObject {

	private static final long serialVersionUID = 8597331458947793229L;

	/**
	 * 线圈NFCURL。服务商从线圈读取后原样传入。nfc_url和tag_sn必须传入至少一个值。
	 */
	@ApiField("nfc_url")
	private String nfcUrl;

	/**
	 * 服务商自定义作业员标识，用于审计和问题追踪
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 绑定后触达页面地址；再次调用本接口可更新该地址。
	 */
	@ApiField("route_url")
	private String routeUrl;

	/**
	 * 间联商户ID。用于校验Lite设备已完成商户进件，并作为归属校验条件
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 线圈tagSN。服务商可从线圈物料上获取并原样传入。nfc_url和tag_sn必须传入至少一个值。
	 */
	@ApiField("tag_sn")
	private String tagSn;

	public String getNfcUrl() {
		return this.nfcUrl;
	}
	public void setNfcUrl(String nfcUrl) {
		this.nfcUrl = nfcUrl;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getRouteUrl() {
		return this.routeUrl;
	}
	public void setRouteUrl(String routeUrl) {
		this.routeUrl = routeUrl;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getTagSn() {
		return this.tagSn;
	}
	public void setTagSn(String tagSn) {
		this.tagSn = tagSn;
	}

}
