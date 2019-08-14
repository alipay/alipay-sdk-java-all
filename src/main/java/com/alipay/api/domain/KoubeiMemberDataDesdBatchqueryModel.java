package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * bizcontet同步
 *
 * @author auto create
 * @since 1.0, 2019-04-12 13:44:46
 */
public class KoubeiMemberDataDesdBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6763338941565826122L;

	/**
	 * 21
	 */
	@ApiField("a")
	private String a;

	/**
	 * 21
	 */
	@ApiField("desd")
	private GavintestNewLeveaOne desd;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

	public GavintestNewLeveaOne getDesd() {
		return this.desd;
	}
	public void setDesd(GavintestNewLeveaOne desd) {
		this.desd = desd;
	}

}
