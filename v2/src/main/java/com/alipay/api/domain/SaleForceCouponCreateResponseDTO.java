package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果对象
 *
 * @author auto create
 * @since 1.0, 2026-04-15 17:37:45
 */
public class SaleForceCouponCreateResponseDTO extends AlipayObject {

	private static final long serialVersionUID = 2541735367174198444L;

	/**
	 * 海图费用减免记录id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 海图费用减免申请单号
	 */
	@ApiField("item_no")
	private String itemNo;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getItemNo() {
		return this.itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

}
