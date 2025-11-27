package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * C2C用户持有藏品升序查询
 *
 * @author auto create
 * @since 1.0, 2025-11-25 14:34:16
 */
public class AnttechNftCtocAssetascQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2512748888751579938L;

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
	 * 上次的最后一条数据游标id	
	 */
	@ApiField("last_index")
	private Long lastIndex;

	/**
	 * null
	 */
	@ApiListField("sku_id_list")
	@ApiField("number")
	private List<Long> skuIdList;

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

	public List<Long> getSkuIdList() {
		return this.skuIdList;
	}
	public void setSkuIdList(List<Long> skuIdList) {
		this.skuIdList = skuIdList;
	}

}
