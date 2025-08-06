package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 信用服务履约同步(批量)
 *
 * @author auto create
 * @since 1.0, 2021-10-27 17:12:31
 */
public class ZhimaCreditEpSceneFulfillmentlistSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7581177316151598675L;

	/**
	 * 信用订单号，为<a href="https://opendocs.alipay.com/apis/api_8/zhima.credit.ep.scene.agreement.use">zhima.credit.ep.scene.agreement.use</a>接口加入信用服务后获取的credit_order_no（信用订单号）。
	 */
	@ApiField("credit_order_no")
	private String creditOrderNo;

	/**
	 * 履约信息列表，最大不超过200项
	 */
	@ApiListField("fulfillment_info_list")
	@ApiField("fulfillment_info")
	private List<FulfillmentInfo> fulfillmentInfoList;

	public String getCreditOrderNo() {
		return this.creditOrderNo;
	}
	public void setCreditOrderNo(String creditOrderNo) {
		this.creditOrderNo = creditOrderNo;
	}

	public List<FulfillmentInfo> getFulfillmentInfoList() {
		return this.fulfillmentInfoList;
	}
	public void setFulfillmentInfoList(List<FulfillmentInfo> fulfillmentInfoList) {
		this.fulfillmentInfoList = fulfillmentInfoList;
	}

}
