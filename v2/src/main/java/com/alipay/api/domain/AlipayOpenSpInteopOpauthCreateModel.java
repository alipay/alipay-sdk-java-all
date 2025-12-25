package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务商一体化开通作业添加代运营授权项
 *
 * @author auto create
 * @since 1.0, 2025-10-23 20:35:29
 */
public class AlipayOpenSpInteopOpauthCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7891715944741293465L;

	/**
	 * 业务开通主单号，用于一体化作业过程的申请单串联
	 */
	@ApiField("inteop_order_no")
	private String inteopOrderNo;

	/**
	 * 授权产品信息
	 */
	@ApiListField("inteop_product_info")
	@ApiField("inteop_op_auth_product_info")
	private List<InteopOpAuthProductInfo> inteopProductInfo;

	public String getInteopOrderNo() {
		return this.inteopOrderNo;
	}
	public void setInteopOrderNo(String inteopOrderNo) {
		this.inteopOrderNo = inteopOrderNo;
	}

	public List<InteopOpAuthProductInfo> getInteopProductInfo() {
		return this.inteopProductInfo;
	}
	public void setInteopProductInfo(List<InteopOpAuthProductInfo> inteopProductInfo) {
		this.inteopProductInfo = inteopProductInfo;
	}

}
