package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 秒转用户资产总数量查询
 *
 * @author auto create
 * @since 1.0, 2025-11-18 21:17:41
 */
public class AnttechNftCtocAssetcountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3352757456198564138L;

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

}
