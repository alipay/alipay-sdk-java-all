package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户申贷
 *
 * @author auto create
 * @since 1.0, 2016-08-25 10:32:50
 */
public class AlipayPcreditLoanApplyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2897652124278259966L;

	/**
	 * 申贷金额，单位为元
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/**
	 * 用户身份证后4位
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商户订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户贴息率，0~1的小数
	 */
	@ApiField("ratio")
	private Long ratio;

	/**
	 * 场景码
	 */
	@ApiField("scene")
	private String scene;

	public String getApplyAmt() {
		return this.applyAmt;
	}
	public void setApplyAmt(String applyAmt) {
		this.applyAmt = applyAmt;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getRatio() {
		return this.ratio;
	}
	public void setRatio(Long ratio) {
		this.ratio = ratio;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
