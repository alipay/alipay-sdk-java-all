package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业关系门店收单查询
 *
 * @author auto create
 * @since 1.0, 2022-08-11 22:35:43
 */
public class AlipayBusinessRelationShopmemberQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8552242453872815965L;

	/**
	 * 商业组织关系中商圈的ownerPid
	 */
	@ApiField("mall_pid")
	private String mallPid;

	/**
	 * 圈店时填写的门店编号
	 */
	@ApiField("real_shop_no")
	private String realShopNo;

	public String getMallPid() {
		return this.mallPid;
	}
	public void setMallPid(String mallPid) {
		this.mallPid = mallPid;
	}

	public String getRealShopNo() {
		return this.realShopNo;
	}
	public void setRealShopNo(String realShopNo) {
		this.realShopNo = realShopNo;
	}

}
