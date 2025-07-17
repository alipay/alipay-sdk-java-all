package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 同步校验结果
 *
 * @author auto create
 * @since 1.0, 2019-11-27 19:27:02
 */
public class KoubeiQualityTestShieldResultSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6219732749943558448L;

	/**
	 * 口碑加购单号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 节点执行结果
	 */
	@ApiListField("check_result_list")
	@ApiField("check_result_list")
	private List<CheckResultList> checkResultList;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部订单号，在ISV点餐对接中，特指POS侧订单ID，在接单回执中由ISV给到口碑；
特别说明：
在首次点菜场景中，推单信息中此参数为空；在加菜场景中，此参数不为空；
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 支付类型。
ADVANCE_PAYMENT：先付；
AFTER_PAYMENT：后付；
	 */
	@ApiField("pay_style")
	private String payStyle;

	/**
	 * 口碑门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public List<CheckResultList> getCheckResultList() {
		return this.checkResultList;
	}
	public void setCheckResultList(List<CheckResultList> checkResultList) {
		this.checkResultList = checkResultList;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPayStyle() {
		return this.payStyle;
	}
	public void setPayStyle(String payStyle) {
		this.payStyle = payStyle;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
