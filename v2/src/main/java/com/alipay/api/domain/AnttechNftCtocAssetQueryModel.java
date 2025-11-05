package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * C2C用户持有藏品查询
 *
 * @author auto create
 * @since 1.0, 2025-07-02 21:06:20
 */
public class AnttechNftCtocAssetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7222979819522219494L;

	/**
	 * 授权接入令牌
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 鲸探授权用户id(已转加密)
	 */
	@ApiField("id_no")
	private String idNo;

	/**
	 * 账号类型
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 上次的最后一条数据游标id
	 */
	@ApiField("last_index")
	private Long lastIndex;

	/**
	 * 藏品skuId列表
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
