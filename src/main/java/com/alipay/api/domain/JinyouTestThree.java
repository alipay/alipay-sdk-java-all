package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * JinyouTestThree
 *
 * @author auto create
 * @since 1.0, 2022-09-13 23:40:23
 */
public class JinyouTestThree extends AlipayObject {

	private static final long serialVersionUID = 3374246582781924486L;

	/**
	 * 11
	 */
	@ApiField("th_1_f")
	private JinyouTestTwo th1F;

	/**
	 * 1
	 */
	@ApiField("th_2_n")
	private Date th2N;

	/**
	 * 1
	 */
	@ApiField("th_3_n")
	private Boolean th3N;

	public JinyouTestTwo getTh1F() {
		return this.th1F;
	}
	public void setTh1F(JinyouTestTwo th1F) {
		this.th1F = th1F;
	}

	public Date getTh2N() {
		return this.th2N;
	}
	public void setTh2N(Date th2N) {
		this.th2N = th2N;
	}

	public Boolean getTh3N() {
		return this.th3N;
	}
	public void setTh3N(Boolean th3N) {
		this.th3N = th3N;
	}

}
