package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 秒转用户资产查询
 *
 * @author auto create
 * @since 1.0, 2025-12-22 14:57:41
 */
public class AnttechNftCtocUserassetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3621657127331841151L;

	/**
	 * 用户id
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
	 * null
	 */
	@ApiListField("sku_id_list")
	@ApiField("number")
	private List<Long> skuIdList;

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

	public List<Long> getSkuIdList() {
		return this.skuIdList;
	}
	public void setSkuIdList(List<Long> skuIdList) {
		this.skuIdList = skuIdList;
	}

}
