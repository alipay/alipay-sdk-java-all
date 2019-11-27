package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇入汇款查询接口
 *
 * @author auto create
 * @since 1.0, 2017-06-21 08:14:55
 */
public class AlipayOverseasFundRemitReceiveQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4899982467129663275L;

	/**
	 * network_trans_id是汇款机构用来标示一笔汇款交易的。如果trans_id已经提供，本参数将被忽略。如果network_trans_time也提供了，那么network_trans_id和network_trans_time的组合将被用来唯一确认交易。
	 */
	@ApiField("network_trans_id")
	private String networkTransId;

	/**
	 * network_trans_time, 标明汇款机构的交易时间。格式采用ISO 8601 YYYY-MM-DDThh:mm:ssZ。如果提供，network_trans_id+network_trans_time会被用来唯一确定一笔交易。
	 */
	@ApiField("network_trans_time")
	private String networkTransTime;

	/**
	 * product_code用来确定汇款产品，汇款机构签约时确定。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 支付宝交易号，用来唯一确认一条汇款记录。如果trans_id和network_trans_id都提供了，trans_id优先使用。
	 */
	@ApiField("trans_id")
	private String transId;

	public String getNetworkTransId() {
		return this.networkTransId;
	}
	public void setNetworkTransId(String networkTransId) {
		this.networkTransId = networkTransId;
	}

	public String getNetworkTransTime() {
		return this.networkTransTime;
	}
	public void setNetworkTransTime(String networkTransTime) {
		this.networkTransTime = networkTransTime;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTransId() {
		return this.transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}

}
