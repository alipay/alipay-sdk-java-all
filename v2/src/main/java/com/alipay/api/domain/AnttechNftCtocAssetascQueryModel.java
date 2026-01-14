package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * C2C用户持有藏品升序查询
 *
 * @author auto create
 * @since 1.0, 2025-12-01 21:02:41
 */
public class AnttechNftCtocAssetascQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5224589745539157757L;

	/**
	 * 接入tocken
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 鲸探openUid
	 */
	@ApiField("id_no")
	private String idNo;

	/**
	 * 枚举：
OPEN_UID-鲸探openUid
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 上次的最后一条数据游标id	 当前字段已废弃(namber无法满足现在的业务需求)
	 */
	@ApiField("last_index")
	@Deprecated
	private Long lastIndex;

	/**
	 * 上次的最后一条数据游标id的string
	 */
	@ApiField("last_index_str")
	private String lastIndexStr;

	/**
	 * null
	 */
	@ApiListField("sku_id_list")
	@ApiField("number")
	private List<Long> skuIdList;

	/**
	 * null
	 */
	@ApiListField("sku_id_list_str")
	@ApiField("string")
	private List<String> skuIdListStr;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getIdNo() {
		return this.idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public Long getLastIndex() {
		return this.lastIndex;
	}
	public void setLastIndex(Long lastIndex) {
		this.lastIndex = lastIndex;
	}

	public String getLastIndexStr() {
		return this.lastIndexStr;
	}
	public void setLastIndexStr(String lastIndexStr) {
		this.lastIndexStr = lastIndexStr;
	}

	public List<Long> getSkuIdList() {
		return this.skuIdList;
	}
	public void setSkuIdList(List<Long> skuIdList) {
		this.skuIdList = skuIdList;
	}

	public List<String> getSkuIdListStr() {
		return this.skuIdListStr;
	}
	public void setSkuIdListStr(List<String> skuIdListStr) {
		this.skuIdListStr = skuIdListStr;
	}

}
