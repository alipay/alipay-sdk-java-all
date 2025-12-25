package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保养订单状态更新
 *
 * @author auto create
 * @since 1.0, 2022-09-29 10:07:00
 */
public class AlipayEcoMycarMaintainOrderstatusUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 5831914442397438647L;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_param")
	private MaintainOrderStatusExtParams extParam;

	/**
	 * 洗车-015；保养-016；4S-020
	 */
	@ApiField("industry_code")
	private String industryCode;

	/**
	 * 订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 55-已核销；7-已出库；8-已收货
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 废弃
	 */
	@ApiField("type")
	private String type;

	public MaintainOrderStatusExtParams getExtParam() {
		return this.extParam;
	}
	public void setExtParam(MaintainOrderStatusExtParams extParam) {
		this.extParam = extParam;
	}

	public String getIndustryCode() {
		return this.industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
