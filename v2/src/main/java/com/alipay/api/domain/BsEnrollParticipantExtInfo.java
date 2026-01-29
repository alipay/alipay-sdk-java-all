package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报名对象拓展信息
 *
 * @author auto create
 * @since 1.0, 2026-01-22 20:52:12
 */
public class BsEnrollParticipantExtInfo extends AlipayObject {

	private static final long serialVersionUID = 6469322569692239692L;

	/**
	 * 门店地址信息
	 */
	@ApiField("out_store_address")
	private BsEnrollParticipantAddress outStoreAddress;

	/**
	 * 外部门店名称
	 */
	@ApiField("out_store_name")
	private String outStoreName;

	public BsEnrollParticipantAddress getOutStoreAddress() {
		return this.outStoreAddress;
	}
	public void setOutStoreAddress(BsEnrollParticipantAddress outStoreAddress) {
		this.outStoreAddress = outStoreAddress;
	}

	public String getOutStoreName() {
		return this.outStoreName;
	}
	public void setOutStoreName(String outStoreName) {
		this.outStoreName = outStoreName;
	}

}
