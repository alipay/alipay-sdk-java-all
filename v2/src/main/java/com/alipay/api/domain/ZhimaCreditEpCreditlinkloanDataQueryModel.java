package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 断直连贷款数据查询服务
 *
 * @author auto create
 * @since 1.0, 2023-03-22 10:05:29
 */
public class ZhimaCreditEpCreditlinkloanDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1466399111676299692L;

	/**
	 * 查询的数据类型，是列表类型
	 */
	@ApiListField("collect_data_type")
	@ApiField("string")
	private List<String> collectDataType;

	/**
	 * 商户自身的单号，需保证其唯一性
	 */
	@ApiField("merchant_biz_no")
	private String merchantBizNo;

	/**
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	public List<String> getCollectDataType() {
		return this.collectDataType;
	}
	public void setCollectDataType(List<String> collectDataType) {
		this.collectDataType = collectDataType;
	}

	public String getMerchantBizNo() {
		return this.merchantBizNo;
	}
	public void setMerchantBizNo(String merchantBizNo) {
		this.merchantBizNo = merchantBizNo;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

}
