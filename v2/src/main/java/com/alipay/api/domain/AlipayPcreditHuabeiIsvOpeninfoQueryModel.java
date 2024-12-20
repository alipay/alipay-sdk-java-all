package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询服务商开放信息
 *
 * @author auto create
 * @since 1.0, 2024-01-30 15:48:31
 */
public class AlipayPcreditHuabeiIsvOpeninfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8327232524662411544L;

	/**
	 * 一次请求的唯一性标识,调用时需要保证在非重试类请求中不重复.
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 二级商户唯一标识
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 店铺的唯一标识,可以不填写.
	 */
	@ApiField("store_id")
	private String storeId;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
