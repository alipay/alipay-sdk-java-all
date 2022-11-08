package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ManjiangTestab
 *
 * @author auto create
 * @since 1.0, 2022-09-17 21:39:46
 */
public class ManjiangTestab extends AlipayObject {

	private static final long serialVersionUID = 6438531533851153517L;

	/**
	 * 1
	 */
	@ApiField("comflex_1")
	private String comflex1;

	/**
	 * 1
	 */
	@ApiField("tes")
	private ManjiangTestabc tes;

	public String getComflex1() {
		return this.comflex1;
	}
	public void setComflex1(String comflex1) {
		this.comflex1 = comflex1;
	}

	public ManjiangTestabc getTes() {
		return this.tes;
	}
	public void setTes(ManjiangTestabc tes) {
		this.tes = tes;
	}

}
