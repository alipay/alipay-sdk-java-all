package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 反洗钱风险资产查询开放API
 *
 * @author auto create
 * @since 1.0, 2023-03-09 11:50:37
 */
public class AlipaySecurityDataAmlassetBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2496815746957649987L;

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
	@ApiListField("open_ids")
	@ApiField("string")
	private List<String> openIds;

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

	public List<String> getOpenIds() {
		return this.openIds;
	}
	public void setOpenIds(List<String> openIds) {
		this.openIds = openIds;
	}

	public List<String> getUids() {
		return this.uids;
	}
	public void setUids(List<String> uids) {
		this.uids = uids;
	}

}
