package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 反洗钱风险资产查询开放API
 *
 * @author auto create
 * @since 1.0, 2020-05-26 13:40:45
 */
public class AlipaySecurityDataAmlassetBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8441311171981835992L;

	/**
	 * 资产的类型，包括LABEL、AML_LIST等
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 合作客户
	 */
	@ApiField("client")
	private String client;

	/**
	 * 名单or资产标签ID
	 */
	@ApiField("lid")
	private String lid;

	/**
	 * 客户ID列表
	 */
	@ApiListField("uids")
	@ApiField("string")
	private List<String> uids;

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getClient() {
		return this.client;
	}
	public void setClient(String client) {
		this.client = client;
	}

	public String getLid() {
		return this.lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}

	public List<String> getUids() {
		return this.uids;
	}
	public void setUids(List<String> uids) {
		this.uids = uids;
	}

}
