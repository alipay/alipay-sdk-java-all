package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Boss云平台费用减免状态修改同步
 *
 * @author auto create
 * @since 1.0, 2025-07-14 16:26:10
 */
public class AnttechOceanbaseObglobalCloudfeereductionModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8852611789483482226L;

	/**
	 * 申请单号
	 */
	@ApiField("item_no")
	private String itemNo;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getItemNo() {
		return this.itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
