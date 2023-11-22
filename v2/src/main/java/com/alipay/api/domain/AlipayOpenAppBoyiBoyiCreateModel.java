package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * spi线上验证接口
 *
 * @author auto create
 * @since 1.0, 2020-02-04 21:48:32
 */
public class AlipayOpenAppBoyiBoyiCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2253662262683736984L;

	/**
	 * 12
	 */
	@ApiField("com")
	private GavintestNewLeveaOne com;

	/**
	 * 1
	 */
	@ApiField("des")
	private String des;

	/**
	 * 21
	 */
	@ApiField("desd")
	private GavinTestnew desd;

	/**
	 * 21
	 */
	@ApiField("desdmm")
	private String desdmm;

	/**
	 * 11
	 */
	@ApiField("header")
	private String header;

	/**
	 * 1
	 */
	@ApiField("med")
	private String med;

	/**
	 * 2
	 */
	@ApiField("query")
	private String query;

	public GavintestNewLeveaOne getCom() {
		return this.com;
	}
	public void setCom(GavintestNewLeveaOne com) {
		this.com = com;
	}

	public String getDes() {
		return this.des;
	}
	public void setDes(String des) {
		this.des = des;
	}

	public GavinTestnew getDesd() {
		return this.desd;
	}
	public void setDesd(GavinTestnew desd) {
		this.desd = desd;
	}

	public String getDesdmm() {
		return this.desdmm;
	}
	public void setDesdmm(String desdmm) {
		this.desdmm = desdmm;
	}

	public String getHeader() {
		return this.header;
	}
	public void setHeader(String header) {
		this.header = header;
	}

	public String getMed() {
		return this.med;
	}
	public void setMed(String med) {
		this.med = med;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

}
