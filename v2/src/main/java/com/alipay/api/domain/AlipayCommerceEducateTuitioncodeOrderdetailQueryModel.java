package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学费码账单详情查询接口
 *
 * @author auto create
 * @since 1.0, 2023-04-12 10:52:11
 */
public class AlipayCommerceEducateTuitioncodeOrderdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3854561513963321626L;

	/**
	 * 是否查询打款计划列表
	 */
	@ApiField("include_plans")
	private Boolean includePlans;

	/**
	 * 订单购买人支付宝uid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 场景，固定"XFM"
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 商户smid
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 订单购买人支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	public Boolean getIncludePlans() {
		return this.includePlans;
	}
	public void setIncludePlans(Boolean includePlans) {
		this.includePlans = includePlans;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
