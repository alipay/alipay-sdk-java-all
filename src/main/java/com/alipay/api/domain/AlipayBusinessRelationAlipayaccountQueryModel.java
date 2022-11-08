package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝代运营商业关系收单pid支付宝账号查询
 *
 * @author auto create
 * @since 1.0, 2022-08-12 10:22:33
 */
public class AlipayBusinessRelationAlipayaccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2734221565221442939L;

	/**
	 * 商业组织关系中商圈的ownerPid
	 */
	@ApiField("mall_pid")
	private String mallPid;

	/**
	 * 商业关系中的门店收单pid
	 */
	@ApiField("shopmember_pid")
	private String shopmemberPid;

	public String getMallPid() {
		return this.mallPid;
	}
	public void setMallPid(String mallPid) {
		this.mallPid = mallPid;
	}

	public String getShopmemberPid() {
		return this.shopmemberPid;
	}
	public void setShopmemberPid(String shopmemberPid) {
		this.shopmemberPid = shopmemberPid;
	}

}
