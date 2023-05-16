package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openapi测试2022//11/19
 *
 * @author auto create
 * @since 1.0, 2023-05-16 17:44:54
 */
public class AlipaySecurityProdOpenapiVBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7643259364156195163L;

	/**
	 * 金额SDK目前直接消费字段的描述，若在描述中说明字段废弃和废弃原因，会自动同步SDK，无需另外开
	 */
	@ApiField("d_amount")
	private String dAmount;

	/**
	 * 特殊可选
	 */
	@ApiField("dd")
	private String dd;

	/**
	 * 所有文档可见
	 */
	@ApiField("ddf")
	private String ddf;

	/**
	 * 可选
	 */
	@ApiField("jf")
	private String jf;

	/**
	 * 必选
	 */
	@ApiField("lk")
	private String lk;

	/**
	 * 经度
	 */
	@ApiField("longitudedd")
	private String longitudedd;

	/**
	 * 经度特殊可选
	 */
	@ApiField("longitudeeee")
	private CedsipeihuanCcomplex longitudeeee;

	/**
	 * 所有文档不可见
	 */
	@ApiField("rr")
	private String rr;

	/**
	 * 描述下这个字段（必选，所有文档可以见）
	 */
	@ApiField("x_njd")
	private Boolean xNjd;

	public String getdAmount() {
		return this.dAmount;
	}
	public void setdAmount(String dAmount) {
		this.dAmount = dAmount;
	}

	public String getDd() {
		return this.dd;
	}
	public void setDd(String dd) {
		this.dd = dd;
	}

	public String getDdf() {
		return this.ddf;
	}
	public void setDdf(String ddf) {
		this.ddf = ddf;
	}

	public String getJf() {
		return this.jf;
	}
	public void setJf(String jf) {
		this.jf = jf;
	}

	public String getLk() {
		return this.lk;
	}
	public void setLk(String lk) {
		this.lk = lk;
	}

	public String getLongitudedd() {
		return this.longitudedd;
	}
	public void setLongitudedd(String longitudedd) {
		this.longitudedd = longitudedd;
	}

	public CedsipeihuanCcomplex getLongitudeeee() {
		return this.longitudeeee;
	}
	public void setLongitudeeee(CedsipeihuanCcomplex longitudeeee) {
		this.longitudeeee = longitudeeee;
	}

	public String getRr() {
		return this.rr;
	}
	public void setRr(String rr) {
		this.rr = rr;
	}

	public Boolean getxNjd() {
		return this.xNjd;
	}
	public void setxNjd(Boolean xNjd) {
		this.xNjd = xNjd;
	}

}
