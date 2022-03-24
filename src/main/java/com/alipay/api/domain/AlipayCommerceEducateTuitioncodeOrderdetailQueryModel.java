package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学费码账单详情查询接口
 *
 * @author auto create
 * @since 1.0, 2020-11-25 14:59:04
 */
public class AlipayCommerceEducateTuitioncodeOrderdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6121847899218535593L;

	/**
	 * 是否查询打款计划列表
	 */
	@ApiField("include_plans")
	private Boolean includePlans;

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

	public Boolean getIncludePlans() {
		return this.includePlans;
	}
	public void setIncludePlans(Boolean includePlans) {
		this.includePlans = includePlans;
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

}
